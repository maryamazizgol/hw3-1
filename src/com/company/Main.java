package com.company;

import java.util.Scanner;

import static com.company.Moshakhasat.a;

public class Main {

    public static void main(String[] args) {

        Scanner Input1 = new Scanner(System.in);
        System.out.println("SEN :");
        int sen = Input1.nextInt();

        Scanner Input2 = new Scanner(System.in);
        System.out.println("meliat:");
        String m1= Input2.nextLine();

        Scanner Input3 = new Scanner(System.in);
        System.out.println("tahsilat :");
        String t = Input3.nextLine();

        Moshakhasat m = new Moshakhasat(sen,m1,t);


        try {
            m.Meliat1();
        } catch (MeliatExp meliatExp) {
            meliatExp.printStackTrace();
        }


        try {
           m.Sen1();
        } catch (SenExp s) {
            s.printStackTrace();
        }



        try {
            m.Tahsilat1();
        } catch (TahsilatExp e) {
            e.printStackTrace();
        }
    }
}
