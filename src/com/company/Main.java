package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.*;

public class Main {


    public static void main(String[] args) {
 final int N = 5;
        Employee employee = new Employee();

        double pay1[] = new double[N];
        double hour1[] = new double[N];
        double payroll[] = new double[N];
        int sum =0;
        double math = 0.0;



        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Program");

        int i = 0;
        char sentinelCharater = 'n';
        char sentinelInput;
        System.out.println("Enter y to continue and n to terminate");
        sentinelInput = scanner.next().charAt(0);
        while (sentinelInput != sentinelCharater) {


            System.out.println("Enter employee name:");
            String name = scanner.next();
            System.out.println("Enter employee working hour:");
            double hour = scanner.nextDouble();
            System.out.println("Enter working hour:");
            Double work = scanner.nextDouble();

            hour1[i] = hour;
            pay1[i] = work;
            payroll[i] = employee.calculation(hour, work );
            sum += payroll[i];
            math += hour;
            System.out.println("Gross pay for Employee " + (i+1) + " is: " + payroll[i]);
            i++;
            System.out.println("Enter y to continue and n to terminate");
            sentinelInput = scanner.next().charAt(0);

        }

        System.out.println("Total hour worked "+ math);


            System.out.println("Total gross pay " + sum);



        }



}

