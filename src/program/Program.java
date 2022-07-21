/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;
import java.util.ArrayList;
import menu.*;
import list.ItemList;

/**
 *
 * @author linh1
 */
public class Program {
    public static void main(String[] args) {
        Menu menu = new Menu(" ITEM MANAGEMENT");
        menu.addANewOption("1. Add a new vase.");
        menu.addANewOption("2. Add a new statue.");
        menu.addANewOption("3. Add a new painting.");
        menu.addANewOption("4. display all items.");
        menu.addANewOption("5. find the items by creator.");
        menu.addANewOption("6. update item by index.");
        menu.addANewOption("7. remove item by index.");
        menu.addANewOption("8. display all vase items.");
        menu.addANewOption("9. sort items in ascending order based on their value.");
        menu.addANewOption("10. Exit.");
        int choice;
        ItemList list = new ItemList();
        do{
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    list.addANewVase();
                    break;
                case 2:
                    list.addANewStatue();
                    break;
                case 3:
                    list.addANewPainting();
                    break;
                case 4:
                    list.printAllItem();
                    break;
                case 5:
                    list.searchByCreator();
                    break;
                case 6:
                    list.upadteItem();
                    break;
                case 7:
                    list.removeItem();
                    break;
                case 8:
                    list.displayVaseItem();
                    break;
                case 9:
                    list.sortByValue();
                    break;
                case 10:
                    System.out.println("Bye!");
             }
        }while(choice != 10);
    }
}
