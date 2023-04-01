package com.BridgeLabzDay19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** Welcome to User Registration *****");
        System.out.print("Enter Fist name:- ");
        String firstName = sc.next();
        System.out.print("Enter Last name:- ");
        String lastName = sc.next();
        Pattern pattern = Pattern.compile("^[A-Z]?[a-z]{3,}$");
        Matcher matcher = pattern.matcher(firstName);
        Matcher matcher1 = pattern.matcher(lastName);
        if (matcher.matches()&& matcher1.matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
        System.out.print("Enter Email id:- ");
        String Email = sc.next();
        Pattern pattern3 = Pattern.compile("^[0-9a-zA-Z]+([a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$");
        Matcher matcher3 = pattern3.matcher(Email);
        if(matcher3.matches()){
            System.out.println("valid");
        }
        else {
            System.out.println("Invalid");
        }
        System.out.print("Enter Mobile number:- ");
        String mobileNumber = sc.next();
        Pattern pattern4 = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
        Matcher matcher4 = pattern4.matcher(mobileNumber);
        if(matcher4.matches()){
            System.out.println("valid");
        }
        else {
            System.out.println("Invalid");
        }
        //rule1: minimum 8 chracters
        System.out.print("Enter Mobile Password:- ");
        String password = sc.next();
        Pattern pattern5 = Pattern.compile("^[a-z]{8}$");
        Matcher matcher5 = pattern5.matcher(password);
        if(matcher5.matches()){
            System.out.println("valid password_rule1");
        }
        else {
            System.out.println("Invalid password)rule1");
        }
        //rule2: minimum 8 chracters with atleat 1 capital chracter
        Pattern pattern6 = Pattern.compile("^[A-Za-z]{8,}$");
        Matcher matcher6 = pattern.matcher("mySecretPassword");
        if (matcher.matches())
            System.out.println("valid password_rule2");
        else
            System.out.println("Invalid password_rule2");
        //rule3: minimum 8 chracters with atleat 1 capital chracter and 1 numeric word
        Pattern pattern7 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9]).{8,}$");
        Matcher matcher7 = pattern7.matcher("PPPass8word");
        if (matcher7.matches())
            System.out.println("valid password_rule3");
        else
            System.out.println("Invalid password_rule3");
        //rule4: minimum 8 chracters with atleat 1 capital chracter and 1 numeric word
        // and one special chracter
        Pattern pattern8 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9])(?=.*[\\W_]).{8,}$");
        Matcher matcher8 = pattern8.matcher("PPPass8*word");
        if (matcher8.matches())
            System.out.println("valid password_rule4");
        else
            System.out.println("Invalid password_rule4");
    }
}
