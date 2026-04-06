package com.example.login;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LoginService service = new LoginService();

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (service.login(username, password)) {
            System.out.println("Login Successful ✅");
        } else {
            System.out.println("Login Failed ❌");
        }

        scanner.close();
    }
}