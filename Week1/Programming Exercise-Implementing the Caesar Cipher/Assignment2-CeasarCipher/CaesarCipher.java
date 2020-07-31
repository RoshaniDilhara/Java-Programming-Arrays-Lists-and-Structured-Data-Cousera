
/**
 * Write a description of CaesarCipher here.
 * You will start with the Caesar Cipher algorithm 
 * you learned about in the videos, and you will make
 * some enhancements to it, so that it works with all 
 * letters (both uppercase and lowercase) and to make 
 * it a little bit harder to decrypt.
 * 
 * @author Roshani Dilhara 
 */

import edu.duke.*;
import java.util.*;
import java.lang.*;

public class CaesarCipher {

    public String encrypt(String input, int key){
    // Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        // Write down the alphabet 
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key)+ alphabet.substring(0,key);
        
        // Count from 0 to < length of encrypted,(call it i)
        for ( int i = 0; i < encrypted.length();i++){
        // Look at the ith character of encrypted ( call it currchar)
        char currChar = encrypted.charAt(i);
        // Find the index of currChar in the alphabet (call it idx)
        int idx = alphabet.indexOf(currChar);
        // If currChar is in the alphabet
        if (idx !=-1){
            // Get the idxth character of shiftedAlphabet (newChar)
            char newChar = shiftedAlphabet.charAt(idx);
            // Replace the ith character of encrypted with newChar
            encrypted.setCharAt(i,newChar);
        }
        //otherwise : do nothing   
    }
    // Your answer is the String inside of encrypted 
     return encrypted.toString();
    }
    
    public void testCaesar(){
        FileResource fr = new FileResource();
        String message = fr.asString();
        int key = 23;
        String encrypted = encrypt(message, key);
        System.out.println("key is " + key + "\n" + encrypted);
    }
    
    public String encryptModified(String input, int key){
    // Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        // Write down the alphabet 
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key)+ alphabet.substring(0,key);
        
        // Count from 0 to < length of encrypted,(call it i)
        for ( int i = 0; i < encrypted.length();i++){
            // Look at the ith character of encrypted ( call it currchar)
            char currChar = encrypted.charAt(i);
            //int idx = 0;
            if(Character.isLowerCase(currChar)){
                char currCharUp = Character.toUpperCase(currChar);
                int idx = alphabet.indexOf(currCharUp);
                // If currChar is in the alphabet
                if (idx !=-1){
                    // Get the idxth character of shiftedAlphabet (newChar)
                    char newChar = shiftedAlphabet.toLowerCase().charAt(idx);
                    // Replace the ith character of encrypted with newChar
                    encrypted.setCharAt(i,newChar);
                }
                //char currCharOriginal = Character.toLowerCase(currCharUp);
            }else{
                // Find the index of currChar in the alphabet (call it idx)
                int idx = alphabet.indexOf(currChar);                
                // If currChar is in the alphabet
                if (idx !=-1){
                    // Get the idxth character of shiftedAlphabet (newChar)
                    char newChar = shiftedAlphabet.charAt(idx);
                    // Replace the ith character of encrypted with newChar
                    encrypted.setCharAt(i,newChar);
                }
            }

        //otherwise : do nothing   
    }
    // Your answer is the String inside of encrypted 
     return encrypted.toString();
    }
    
    public void testEncrypt_modified(){
        FileResource fr = new FileResource();
        String message = fr.asString();
        int key = 15;
        String encrypted = encryptModified(message, key);
        System.out.println("key is " + key + "\n" + encrypted);
    }
    
    public String encryptTwoKeys(String input, int key1, int key2){
        // Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder (input);
        // Write down the alphabet 
        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // Compute the shifted alphabet
        String ShiftedAlphabet1 = Alphabet.substring(key1)+ Alphabet.substring(0,key1);
        String shiftedAlphabet1 = alphabet.substring(key1)+ alphabet.substring(0,key1);
        String ShiftedAlphabet2 = Alphabet.substring(key2)+ Alphabet.substring(0,key2);
        String shiftedAlphabet2 = alphabet.substring(key2)+ alphabet.substring(0,key2);
        
        // Count from 0 to < length of encrypted,(call it i)
        for (int i = 0; i <encrypted.length();i+=2){
        // Look at the ith character of encrypted ( call it currchar)
        char currChar = encrypted.charAt(i);
            if ((i %2 == 0) && (Character.isLowerCase(currChar))) {
                // Find the index of currChar in the alphabet (call it idx)
                int idx = alphabet.indexOf(currChar);
                // If currChar is in the alphabet
            if (idx!= 0)
            {
                // Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet1.charAt(idx);
                // Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i,newChar);
            }
        }
        
            else if ((i %2 == 0) && (Character.isUpperCase(currChar)))
            {
                // Find the index of currChar in the alphabet (call it idx)
                int idx = Alphabet.indexOf(currChar);
                // If currChar is in the alphabet
            if (idx != 0)
            {
                // Get the idxth character of shiftedAlphabet (newChar)
                char newChar = ShiftedAlphabet1.charAt(idx);
                // Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i,newChar);
            }
        }
        
    }
    
       for (int i = 1; i <encrypted.length();i+=2){
        // Look at the ith character of encrypted ( call it currchar)
        char currChar = encrypted.charAt(i);
            if ((i %2 != 0) && (Character.isLowerCase(currChar)))
            {
                // Find the index of currChar in the alphabet (call it idx)
                int idx = alphabet.indexOf(currChar);
                // If currChar is in the alphabet
            if (idx != 0)
            {
                // Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet2.charAt(idx);
                // Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i,newChar);
            }
        }
        
        else if ((i %2 != 0) && (Character.isUpperCase(currChar))) {
            // Find the index of currChar in the alphabet (call it idx)
            int idx = Alphabet.indexOf(currChar);
            // If currChar is in the alphabet
        if (idx != 0)
            {
                // Get the idxth character of shiftedAlphabet (newChar)
                char newChar = ShiftedAlphabet2.charAt(idx);
                // Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i,newChar);
            }
        }
                
    } 
    
    return encrypted.toString();
    } 
    
    public void testEncryptTwoKeys(){
        FileResource fr = new FileResource();
        String message = fr.asString();
        int key1 = 8;
        int key2 = 21;
        String encrypted = encryptTwoKeys(message, key1,key2);
        System.out.println(encrypted);
    }
}
