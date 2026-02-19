package org.example.interfaces;

import org.example.exceptions.EmptyCredentialException;

public interface AuthenticatorInterface {

    public boolean authenticateUser(String username, String password) throws EmptyCredentialException;

    public void foo();
}
