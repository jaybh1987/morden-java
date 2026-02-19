package org.example.model;

import org.example.exceptions.EmptyCredentialException;
import org.example.interfaces.AuthenticatorInterface;

import javax.swing.plaf.metal.MetalBorders;

public class AuthenticatorApplication {

    private AuthenticatorInterface authenticator;

    public AuthenticatorApplication(AuthenticatorInterface authenticator) {
        this.authenticator = authenticator;
    }

    public boolean authenticate(String username, String password) throws EmptyCredentialException {
        boolean authenticated;

        this.authenticator.foo();;
        authenticated = this.authenticator.authenticateUser(username,password);



        return authenticated;
    }
}

