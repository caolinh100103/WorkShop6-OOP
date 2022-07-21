/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author linh1
 */
public class Item {
    private Scanner sc = new Scanner(System.in);
    
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input(){
        value = inputter.Inputter.getInt("Input the value: ", "Invalid value...");
        creator = inputter.Inputter.getString("Input the creator: ", "Invalid creator...");        
        
    }
    
    public void output(){
        System.out.println("The value is: " + value);
        System.out.println("The creator is: " + creator);
    }
}
