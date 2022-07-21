/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import data.*;
import java.util.*;

/**
 *
 * @author linh1
 */
public class ItemList extends ArrayList<Item> {
    private Scanner sc = new Scanner(System.in);
    

    public void addANewVase() {
        Item vase = new Vase();
        vase.input();
        this.add(vase);
    }

    public void addANewStatue() {
        Statue statue = new Statue();
        statue.input();
        this.add(statue);
    }
    
    public void addANewPainting() {
        Item paint = new Painting();
        paint.input();
        this.add(paint);
    }
    
    public void printAllItem() {
        if(this.isEmpty()){
            System.out.println("Empty this!!!");
            return;
        }
        for (Item item : this) {
            if(item instanceof Statue)
                ((Statue)item).output();
            if(item instanceof Vase)
                ((Vase)item).output();
            if(item instanceof Painting)
                ((Painting)item).output();
        }
    }
    
    public Item search(String keyword) {
        if(this.isEmpty())
            return null;
        for (int i = 0; i < this.size(); i++) {
            this.get(i).getCreator().trim().equalsIgnoreCase(keyword.trim());
            return this.get(i);
        }
        return null;
    }
    
    public void searchByCreator() {
        String keyword;
        System.out.println("Enter the creator w want to search: ");
        keyword = sc.nextLine();
        Item tmp = search(keyword);
        if(tmp == null)
            System.out.println("NOT FOUND!");
        else{
            System.out.println("The Item search by creator has been found!!!");
            tmp.output();
        }
    }
    
    public void upadteItem() {
        int index;
        index = inputter.Inputter.getAnIntegerInMinMax("Enter the index of the Item u want to update: ", 0, this.size() - 1);
        if(this.get(index) instanceof Vase){
            System.out.println("This is a Vase");
            System.out.println("The old height " + ((Vase)this.get(index)).getHeight() + " The new one");
            ((Vase)this.get(index)).setHeight(Integer.parseInt(sc.nextLine()));
            System.out.println("The old material: " + ((Vase)this.get(index)).getMaterial() + " The new one: ");
            ((Vase)this.get(index)).setMaterial(sc.nextLine());
            
            System.out.println("successfully updated a vase!");
        }
        if(this.get(index) instanceof Statue){
            System.out.println("This is a Stautue");
            System.out.println("The old weight " + ((Statue)this.get(index)).getWeight() + " The new one");
            ((Statue)this.get(index)).setWeight(Integer.parseInt(sc.nextLine()));
            System.out.println("The old color: " + ((Statue)this.get(index)).getColor() + " The new one: ");
            ((Statue)this.get(index)).setColor(sc.nextLine());
            System.out.println("successfully updated a statue!");
        }
        if(this.get(index) instanceof Painting){
            System.out.println("This is a Paiting.");
            System.out.println("The old height " + ((Vase)this.get(index)).getHeight() + " The new one");
            ((Vase)this.get(index)).setHeight(Integer.parseInt(sc.nextLine()));
            System.out.println("The old weight: " + ((Painting)this.get(index)).getWeight()+ " The new one: ");
            ((Painting)this.get(index)).setWeight(Integer.parseInt(sc.nextLine()));
            System.out.println("successfully updated a painting!");
        }
    }  
    
    public void removeItem() {
        int index;
        index = inputter.Inputter.getAnIntegerInMinMax("Enter the index u want to remove: ", 0, this.size() - 1);
        this.remove(index);
    }
    
    public void displayVaseItem() {
        for (Item item : this) {
            if(item instanceof Vase){
                ((Vase)item).output();
            }
        }
    }
    
    public void sortByValue() {
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Item e1 = ((Item)o1);
                Item e2 = ((Item)o2);
                return e1.getValue() - e2.getValue();
            }
        };
        Collections.sort(this, com);
        for (Item item : this) {
            item.output();
        }
    }
}
