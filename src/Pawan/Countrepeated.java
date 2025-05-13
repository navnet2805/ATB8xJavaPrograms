package Pawan;

import java.util.*;

public class Countrepeated {
    /*
  Array consists of integers and special
characters,sum only integers
String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
output: 26
*/

 public static void input(String[] array)
 {
     for (String num : array) {
         System.out.print(num);
     }
     System.out.println();
 }



 public  static void Sum(String[] array)
 {
     int sum=0;
     for (String s : array) //"5"
          {
              try {
                   sum = sum + Integer.parseInt(s);

              } catch (NumberFormatException e) {
              }
          }
     System.out.println("Sum of integers are: " +sum);
 }


    public static void main(String[] args)
    {
        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};

        // to print input array
        System.out.println("input array is: ");
        input(array);

        // to find the common elements between 2 array
        Sum(array);

    }
}