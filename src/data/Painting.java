/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import inputter.Inputter;
import java.util.Scanner;
/**
 *
 * @author linh1
 */
public class Painting extends Item{
    private Scanner sc = new Scanner(System.in);
    
    private int height;
    private int weight;
    private boolean isWaterColor;
    private boolean isFramed;

    public Painting() {
        
    }

    public Painting(int height, int weight, boolean isWaterColor, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.weight = weight;
        this.isWaterColor = isWaterColor;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isIsWaterColor() {
        return isWaterColor;
    }

    public void setIsWaterColor(boolean isWaterColor) {
        this.isWaterColor = isWaterColor;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    @Override
    public void input() {
        super.input();
        height = Inputter.getInt("Input the heghit: ", "Invalid height, input again:");
        weight = Inputter.getInt("Input the weight: ", "Invalid weight, input again: ");
        isWaterColor = isWaterColorOrFramed("If you want to water color press y/Y and n/N fpr no", "Please enter y/Y or n/N");
        isFramed = isWaterColorOrFramed("If you want to frame press y/Y and n/N fpr no", "Please enter y/Y or n/N");
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("the height is: " + height);
        System.out.println("the weight is: " + weight);
        if(isWaterColor)
            System.out.println("The Painting is water color");
        else
            System.out.println("The painting is not water color");
        if(isFramed)
            System.out.println("The painting is framed");
        else
            System.out.println("The paointing is not framed");
    }
    
    public boolean isWaterColorOrFramed(String inputMessage, String errorMessage){
        boolean check = false;
        String tmp;
        while(true) {
            System.out.println(inputMessage);
            try {
                tmp = sc.nextLine();
                if(tmp.equalsIgnoreCase("y"))
                    return check = true;
                if(tmp.equalsIgnoreCase("n"))
                    return check = false;
                else
                    throw new Exception();
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }
}
