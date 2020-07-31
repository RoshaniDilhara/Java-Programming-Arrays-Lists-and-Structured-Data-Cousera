
/**
 * Programming Exercise: Implementing the Caesar Cipher
 * a program to transform words from a file into another form,
 * such as replacing vowels with an asterix.
 * 
 * @author Roshani Dilhara 
 */
import edu.duke.*;
import java.util.*;
//import java.lang.*;

public class WorldPlay {

    public boolean isVowel(char ch){
      char chLower = Character.toLowerCase(ch);
      if((chLower == 'a') || (chLower == 'e') || (chLower == 'i') || 
        (chLower == 'o') || (chLower == 'u')){
        return true;
        }
     return false;
    }
    
    public void testIsVowel(char ch){
        //char ch1 = 'F';
        //System.out.println(isVowel(ch1));
        //char ch2 = 'a';
        //System.out.println(isVowel(ch2));
        System.out.println(isVowel(ch));
    }
    
    public String replaceVowels(String phrase, char ch){
        StringBuilder sb = new StringBuilder(phrase);
        for(int i=0;i<sb.length();i++){
            if(isVowel(sb.charAt(i))){
              sb.setCharAt(i,ch);
            }
        }        
        return sb.toString();
    }
    
    public void testReplaceVowels(){
        String phrase = "Hello World";
        char ch = '*';
        System.out.println(replaceVowels(phrase,ch));
    }
    
    public String emphasize(String phrase, char ch){
        
    StringBuilder sb = new StringBuilder(phrase);
        
        for (int i = 0; i < sb.length();i++) {
        char currChar = sb.charAt(i);        
            if ((currChar == ch) && (i %2 == 0)){
                sb.setCharAt(i, '*');
            }else if ((currChar == ch) && (i %2 != 0)){
                sb.setCharAt(i, '+');
            }
        }
        return sb.toString();
    }
}
