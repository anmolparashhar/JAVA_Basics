package mypackage;

import java.util.Scanner;

public class MyClass {    
    public static void main(String[] args) {    
            
        //Counter variable to store the count of vowels and consonant    
        int vCount = 0, cCount = 0;    
            
        //Declare a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Give any String: ");
        String sInput = sc.nextLine();    
            
        //Converting entire string to lower case to reduce the comparisons    
        sInput = sInput.toLowerCase();    
            
        for(int i = 0; i < sInput.length(); i++) {    
            //Checks whether a character is a vowel    
            if(sInput.charAt(i) == 'a' || sInput.charAt(i) == 'e' || sInput.charAt(i) == 'i' || sInput.charAt(i) == 'o' || sInput.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(sInput.charAt(i) >= 'a' && sInput.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }    
        sc.close();
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    
    }    
}   