package org.example.task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordSource {
    public static boolean check(String password) throws WrongPasswordException {
        String regex = "[\\w@{}()\\[\\],;&!?+\\.-]{8,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.find()) {
            throw new WrongPasswordException();
        }
        return true;
    }
}
