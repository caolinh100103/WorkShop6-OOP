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
public class Vase extends Item{
    
    
    private int height;
    private String material;

    public Vase() {
       
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
     @Override
    public void input(){
        super.input();
        height = inputter.Inputter.getInt("Input the height: ", "Invalid height");
        material = inputter.Inputter.getString("Input the material", "error material. Please input again: ");
       
    }
    
    @Override
    public void output(){
        super.output();
        System.out.println("The height is: " + height);
        System.out.println("The material is: " + material);
        
    }
}
