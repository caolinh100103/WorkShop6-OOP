/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author linh1
 */
public class Statue extends Item{
    private int weight;
    private String color;

    public Statue() {
    }

    public Statue(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void input() {
        super.input();
        weight = inputter.Inputter.getInt("Enter the weight: ", "Invalid value of weight, input again: ");
        color = inputter.Inputter.getString("Input the color: ", "Invalid color, input again: ");
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("The weight is: " + weight);
        System.out.println("The color is: " + color);
    }
}
