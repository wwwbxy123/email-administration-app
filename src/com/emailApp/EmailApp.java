package com.emailApp;

public class EmailApp {

    public static void main(String[] args){

        Email email1 = new Email("Blanca", "Bai");

        System.out.println(email1.getAlternativeEmail() );
        System.out.println("-------------------------------------------------");

        String info = email1.showInfo();



        System.out.println(info);
        System.out.println("-------------------------------------------------");
    }
}
