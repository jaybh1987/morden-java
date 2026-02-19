package org.example.model;

import org.example.exceptions.EmptyCredentialException;
import org.example.interfaces.AuthenticatorInterface;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class AuthenticatorApplicationTest {

    @Mock
    AuthenticatorInterface authenticatorMock;

    @InjectMocks
    AuthenticatorApplication authenticator;

    @Test
    public void throughExceptionWhenCredentialsAreEmpty() throws EmptyCredentialException{

        //given
        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorApplication(authenticatorMock);

        //given
        when(authenticatorMock.authenticateUser("","")).thenThrow(new EmptyCredentialException());


        authenticator.authenticate("","");
    }

    @Test
    public void testAuthenticate() throws EmptyCredentialException {

        String username = "java";
        String password = "user";
        //mocking object
        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorApplication(authenticatorMock);
        // defining behaviour what to do when
        when(authenticatorMock.authenticateUser(username,password)).thenReturn(false);

        boolean actual = authenticator.authenticate(username,password);

        InOrder inOrder = inOrder(authenticatorMock);
        inOrder.verify(authenticatorMock).foo();
        inOrder.verify(authenticatorMock).authenticateUser(username,password);
        assertFalse(actual);

        verify(authenticatorMock, times(1)).authenticateUser(username,password);
    }

}