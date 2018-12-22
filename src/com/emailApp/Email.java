package com.emailApp;

import java.util.Arrays;
import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String passWord;
   private String department;
   private String email;
   private String alternativeEmail;
   private int mailboxCapacity = 500;
   private int defaultPasswordLength = 10;
   private String companySuffix = "mycompant.com";

   /** constrcutor: firstName, lastName */
   public Email(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
       System.out.println("Email constructed for: " + this.firstName + " " + this.lastName);

       /** call method to ask and show department */
       this.department = setDepartment();
       System.out.println("Department: " + this.department);

       /** call method to generate random password */
       this.passWord = randomPassword(defaultPasswordLength);
       System.out.println("random password generated: " + this.passWord);

       /** combine firstName and lastName to generate email */
       this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
       System.out.println("Your email is: " + email);

       /** call method to ask and show alternative email */
       this.alternativeEmail = alternativeEmail();
       System.out.println("Your alternative email is : " + alternativeEmail);
   }

   /** set department */
    private String setDepartment(){
        System.out.println("Please Enter the department code:" );
        System.out.println("1 for sales" );
        System.out.println("2 for development" );
        System.out.println("3 for accounting" );
        System.out.println("0 for none" );
        System.out.println("*************************************************");


        Scanner department = new Scanner(System.in);
        int choice = department.nextInt();
        this.department = department.toString();

        switch(choice) {
            case 1: return "sales";
            case 2: return "development";
            case 3: return "account";
            default: return "";
        }
    }

    /** set Alternative email */
    private String alternativeEmail(){
        System.out.println("Please Enter your alternative email" );
        Scanner alter = new Scanner(System.in);
        return alter.toString();
    }

   /** generate random password */
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890#$%&@";

        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

   /** set mailboxCapacity */
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

   /** change password */
    public void changePassword( String newPassword){
        this.passWord = newPassword;
    }


    /** getters */
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternativeEmail(){
        return alternativeEmail;
    }

    public String getPassWord(){
        return passWord;
    }

    /** show information */
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                " Company email: " + email +
                " Email capacity: " + mailboxCapacity + " mb." +
                " Alternative email: " + alternativeEmail;
    }
}
