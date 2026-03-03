package org.example.exceptions;

public class EmptyCredentialException extends Exception {

    public EmptyCredentialException() {
        super("Empty Credential");
    }
}
