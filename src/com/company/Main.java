package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite varda: ");
        String vardas = sc.nextLine();

        System.out.println(vardas.length());

    }
}
