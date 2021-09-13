/*
Modified by: Shibrah Misbah
991593708
Date: 2021-04-06
 */
package passwordvalidator;

import static java.lang.Character.isUpperCase;
import java.util.Scanner;

/**
 * A class to validate a user's chosen password.
 * The password must have a length of at least 8
 * at least one uppercase character and at least one
 * special character (character that is not a letter or number).
 * This is also our class under test
 * @author dancye, 2018
 */
public class PasswordValidator 
{

    /**
     * Main method cycles through our static utility methods
     * to determine whether the password is valid or not.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isValid=false;
        do
        {
            System.out.println("Please enter a VALID password, password must have:");
            System.out.println("A length of at least 8");
            System.out.println("At least one special character");
            System.out.println("At least one uppercase letter");
            Scanner sc = new Scanner(System.in);
            String pass = sc.nextLine();
            if (checkLength(pass) && checkSpecialChar(pass) && checkUpperCase(pass))
            {
               isValid=true;
            }
        }while(!isValid);
        System.out.println("Valid password, accepted!");
    }
    
    /**
     * A method to check whether a password is at least length 8
     * @param pass - the String to check
     * @return true if length is greater than or equal to 8 and false otherwise
     */
    public static boolean checkLength(String pass)
    {
        if(pass.length()>=8)
        {
            return true;
        }
        return false;
        
    }
    
    /**
     * A method to check whether the password contains at least one
     * special character. Loops through each character to see if it's not
     * a letter or a digit.
     * @return true if count is more than 0
     */
    public static boolean checkSpecialChar(String pass){
         
     int charCount = 0;   
        
     for(int i=0; i<pass.length();i++)
     {
         
         if(!(Character.isLetterOrDigit(pass.charAt(i))))
         {
             charCount++;
         }
     }
     
      if(charCount > 0)
      {
        return true;
      }
      return false;
    }
    
    /**
     * A method to check whether the password contains at least one
     * upper case letter. Loops through each character in passed string
     * to see if it is upper case.
     * @return true if count is more than 0
     */
    public static boolean checkUpperCase(String pass){
         
     int uCount = 0;   
        
     for(int i=0; i<pass.length();i++)
     {
         
         if(isUpperCase(pass.charAt(i)))
         {
             uCount++;
         }
     }
     
      if(uCount > 0)
      {
        return true;
      }
      return false;
    }
}
