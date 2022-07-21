/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputter;

import java.util.Scanner;

/**
 *
 * @author linh1
 */
public class Inputter {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String inputMessage, String errorMessage) {
        int data;
        System.out.println(inputMessage);
        while (true) {
            try {
                data = Integer.parseInt(sc.nextLine());
                return data;
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static String getString(String inputMessage, String errorMessage) {
        String data;
        System.out.println(inputMessage);
        while (true) {
            try {
                data = sc.nextLine().trim();
                if(data.length() == 0 || data.isEmpty())
                    throw new Exception();
                else
                    return data;
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }
    
   public static int getAnIntegerInMinMax(String inputMassage, int min, int max) {
       int data;
       if(min > max){
           int tmp = min;
           min = max;
           max = tmp;
       }
       
       System.out.println(inputMassage);
       while(true) {
           try {
               data = Integer.parseInt(sc.nextLine());
               if(data < max && data > min)
                   return data;
               else
                   throw new Exception();
           } catch (Exception e) {
               System.out.println("Please enter a value between " + min + " and " + max);
           }
       }
   }
}
