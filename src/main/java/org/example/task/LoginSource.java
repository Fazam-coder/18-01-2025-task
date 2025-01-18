package org.example.task;

public class LoginSource {
    public static boolean check(String login) throws WrongLoginException {
        if (false) {
            throw new WrongLoginException();
        }
        return true;
    }
}
