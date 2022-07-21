/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.*;

/**
 *
 * @author linh1
 */
public class Menu {
    private String menuTitle;

    public Menu(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    List<String> menu = new ArrayList<>();
    public void addANewOption(String option) {
        if(menu.isEmpty())
            menu.add(option);
        for (int i = 0; i < menu.size(); i++) {
            if(option.equalsIgnoreCase(menu.get(i))){
                System.out.println("Duplicated option");
                return;
            }
        }
        menu.add(option);
    }
    
    public int getChoice() {
        int choice = inputter.Inputter.getAnIntegerInMinMax("Select number: ", 1, menu.size());
        return choice;
    }
    
    public void printMenu() {
        if(menu.isEmpty()){
            System.out.println("Empty menu!!!");
            return;
        }
        System.out.println("\n--------------------------------------");
        System.out.println("WELCOME TO" + menuTitle);
        for (String string : menu) {
            System.out.println(string);
        }
    }
}