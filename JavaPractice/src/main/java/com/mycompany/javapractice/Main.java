/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author teoberbic
 */
public class Main {
    
    public static void main(String[] args) {
       Novel myNovel = new Novel("Star Wars");
       System.out.println(myNovel.getTitle());
       myNovel.setTitle("Star Wars The Force Awakens");
       System.out.println("Now the title is: " + myNovel.getTitle());
    }
}
