package com.example.spproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.PrivilegedAction;

@SpringBootApplication
public class SpProjectApplication {

    public static void main(String[] args) {
        long startTimer = System.currentTimeMillis();
        ImageProxy imgOne = new ImageProxy("Jeff Bezos");
        ImageProxy imgTwo = new ImageProxy("Elon Musk");
        ImageProxy imgThree = new ImageProxy("Warren Buffet");
        Section sectionOne = new Section("Front Cover");
        sectionOne.add(imgOne);
        Section sectionTwo = new Section("Milionares");
        sectionTwo.add(imgTwo);
        sectionTwo.add(imgThree);
        Book magazine = new Book("Forbes");
        magazine.add(sectionOne);
        magazine.add(sectionTwo);
        long endTimer = System.currentTimeMillis();
        System.out.println("Content creation took " + (endTimer - startTimer) + " milliseconds");
        startTimer = System.currentTimeMillis();
        sectionOne.print();
        endTimer = System.currentTimeMillis();
        System.out.println("Printing section 1 took " + (endTimer - startTimer) + " milliseconds");
        startTimer = System.currentTimeMillis();
        sectionOne.print();
        endTimer = System.currentTimeMillis();
        System.out.println("Printing section 1 again took " + (endTimer - startTimer) + " milliseconds");

    }

}