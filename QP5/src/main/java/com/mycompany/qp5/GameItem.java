/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qp5;

/**
 *
 * @author teoberbic
 */
//declare fields
public class GameItem {
    private String name;
    private String description;

    //constructor
    public GameItem (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName () {
        return this.name;
    }
    
    public String getDescription () {
        return this.description;
    }
}
