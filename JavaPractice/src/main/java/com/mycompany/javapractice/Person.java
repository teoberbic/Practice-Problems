/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author teoberbic
 */
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public static void main(String[] args) {
        Person person1 = new Person("Teo", 20);
        Person person2 = new Person("Dino", 15);
        System.out.println("Your name is: " + person1.getName() + ". Your age is: " + person1.getAge() + "\n");
        System.out.println("Your name is: " + person2.getName() + ". Your age is: " + person2.getAge() + "\n");
        
    }

}