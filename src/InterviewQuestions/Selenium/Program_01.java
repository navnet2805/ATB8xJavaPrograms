package InterviewQuestions.Selenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_01 {


    public static void main(String[] args) {
        int[] a = {10,20,30,5,8,1};

        for(int i=0; i<a.length ; i++)
        {
            int minindex = i; //assume  1st
            for(int j=i+1; j<a.length ; j++) //iterate with remaining element
            {
                if(a[minindex] > a[j]) //values
                {
                    minindex=j; //5
                }
            } //end of inner for loop

//swap values
            int temp = a[i]; //10
            a[i] = a[minindex]; //1
            a[minindex] = temp;


        } //outer for loop


//print the values
        for(int n : a)
        {
            System.out.print(n+" ");
        }

        }
}
