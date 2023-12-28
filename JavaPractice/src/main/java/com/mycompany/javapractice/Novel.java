/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author teoberbic
 */
public class Novel extends Book {
    
    public Novel (String title) {
        this.title = title;
    }
    @Override
    void setTitle(String s) {
        this.title = s;
    }
    
}
