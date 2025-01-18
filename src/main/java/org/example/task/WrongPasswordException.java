package org.example.task;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
        super("Пароль не по правилам");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
