package org.example.task;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Логин не по правилам");
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
