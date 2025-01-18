package org.example.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginSource {
    public static boolean check(String login) throws WrongLoginException {
        String regex = "[\\w@\\.-]{20,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(login);
        if (!matcher.find()) {
            throw new WrongLoginException();
        }
        return true;
    }
}
