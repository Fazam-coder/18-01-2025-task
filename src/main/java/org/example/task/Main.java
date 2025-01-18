package org.example.task;

import java.util.Scanner;

import static org.example.task.Role.*;

public class Main {

    public static User user = new User();
    public static User admin = new User();

    public static void init() {
        user.setLogin("1234567890QWERTYUIOPdg");
        user.setPassword("{yderuih23564eugi]");
        user.setRole(USER);
        admin.setLogin("qwerty@+asdfgh1234567");
        admin.setPassword("?yerfyuger!");
        admin.setRole(ADMIN);
    }
    public static void main(String[] args) {
        init();
        Role role = null;
        while (role == null) {
            Scanner scanner = new Scanner(System.in);
            String login = scanner.next();
            String password = scanner.next();
            role = userCheck(login, password);
        }
        if (role == ADMIN) {
            System.out.println("1. File");
            System.out.println("2. Create new user");
            System.out.println("3. exit");
        } else {
            System.out.println("1. File");
            System.out.println("2. Get play list");
            System.out.println("3. exit");
        }

    }
    public static Role userCheck(String login, String password) {
        boolean error = true;
        while (error) {
            try {
                LoginSource.check(login);
                PasswordSource.check(password);
                error = false;
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
        if (admin.getLogin().equals(login) && admin.getPassword().equals(password)) {
            return admin.getRole();
        }
        if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
            return user.getRole();
        }
        return null;
    }
}
