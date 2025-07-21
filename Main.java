package com.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {        Scanner input = new Scanner(System.in);
        int i = 2;
        Collection<Cars> cars = new ArrayList<>();
        System.out.println("Welcome ");
       System.out.println("1) Capture vehicle details\n" +
                "2) View vehicle report\n" +
                "3) Exit app");

        int menuOption = input.nextInt();

        if (menuOption == 1) {
            Cars carObj = new Cars();
            int year;
            int mileage;
            String make;
            String model;
            String plateNum;
            String vinNum;
            String color;

            System.out.println("Enter car make:");
            make = input.next();

            System.out.println("Enter car model:");
            model = input.next();

            System.out.println("Enter car color:");
            color = input.next();

            System.out.println("Enter VIN (17 characters):");
            vinNum = input.next();
            while (!(vinNum.length() == 17)) {
                System.out.println("Invalid VIN. Please enter a 17-character VIN:");
                vinNum = input.next();
            }

            System.out.println("Please enter 1 for old format license number (e.g. AAA555GP),\n" +
                    "or 2 for new format plate number (e.g. AA55BBGP):");
            int plateChoice = input.nextInt();

            if (plateChoice == 1) {
                System.out.println("Enter old format plate number:");
                plateNum = input.next();
            } else if (plateChoice == i) {
                System.out.println("Enter new format plate number:");
                plateNum = input.next();
            } else {
                System.out.println("Invalid option. Plate number set to empty.");
                plateNum = "";
            }

            System.out.println("Enter mileage (in kilometers):");
            mileage = input.nextInt();

            System.out.println("Enter manufacturing year:");
            year = input.nextInt();

            carObj.setMake(make);
            carObj.setModel(model);
            carObj.setColor(color);  // new setter
            carObj.setPlateNumber(plateNum);
            carObj.setVin(vinNum);
            carObj.setYear(year);
            carObj.setMileage(mileage);

            cars.add(carObj);
        } else if (menuOption == i) {
            if (cars.isEmpty()) {
                System.out.println("There are no cars captured.");
            } else {
                System.out.println("**********************");
                System.out.println("VEHICLE REPORT");
                System.out.println("**********************");
                for (Cars carObject : cars) {
                    System.out.println("MAKE     : " + carObject.getMake());
                    System.out.println("MODEL    : " + carObject.getModel());
                    System.out.println("COLOR    : " + carObject.getColor());  // new field
                    System.out.println("YEAR     : " + carObject.getYear());
                    System.out.println("VIN      : " + carObject.getVin());
                    System.out.println("PLATE NO : " + carObject.getPlateNumber());
                    System.out.println("MILEAGE  : " + carObject.getMileage() + " km");  // updated field
                    System.out.println("------------------------------");
                }
            }
        }

        System.out.println("Thank you for using the application.");
    }
}
