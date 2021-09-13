/*
Modified by: Shibrah Misbah
991593708
Date: 2021-04-06
 */

package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A class to test the methods in our passwordValidator
 * @author dancye, 2018
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before method");

    }
    
    @After
    public void tearDown() {
        System.out.println("After method");
    }

    
    /**
     * Test of checkLength method, of class PasswordValidator.
     * This test gives a good input of MyPassword123, which should
     * easily be long enough to be a good length.
     */
    @Test
    public void testCheckLengthGood() {
        String pass = "Mypassword123";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true, result);

    }
    
     /**
     * This test gives a bad input of mypass, which is
     * less than eight characters.
     */
    @Test
    public void testCheckLengthBad() {
        String pass = "mypass";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(false, result);
    }
    
    /**
     * This test gives an input that fits the exact requirements
     * which is a password of exactly eight characters.
     */
    @Test
    public void testCheckLengthBoundary() {
        String pass = "Password";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true, result);
    }
    
    /**
     * Test of checkUpperCase method, of class PasswordValidator.
     * This test gives a good input of MyPassword123 that contains 
     * two upper case letters.
     */
    @Test
    public void testCheckUpperCaseGood() {
        String pass = "MyPassword123";
        boolean result = PasswordValidator.checkUpperCase(pass);
        assertEquals(true, result);
    }
    
     /**
     * This test gives a bad input of mypassword as it does not
     * contain a single upper case letter.
     */
    @Test
    public void testCheckUpperCaseBad() {
        String pass = "mypassword";
        boolean result = PasswordValidator.checkUpperCase(pass);
        assertEquals(false, result);
    }
    
     /**
     * This test gives an input of a password that contains
     * exactly one uppercase letter, no more, no less.
     */
    @Test
    public void testCheckUpperCaseBoundary() {
        String pass = "Password";
        boolean result = PasswordValidator.checkUpperCase(pass);
        assertEquals(true, result);
    }
    
    /**
     * Test of checkSpecialChar method, of class PasswordValidator.
     * This test gives a good input of P@ssword*123, which meets
     * length, uppercase, and special character requirements.
     */
    @Test
    public void testCheckSpecialCharGood() {
        String pass = "P@ssword*123";
        boolean result = PasswordValidator.checkSpecialChar(pass);
        assertEquals(true, result);
    }
    
     /**
     * This test gives an bad input of Passw1234 which does not   
     * contain a single special character.
     */
    @Test
    public void testCheckSpecialCharBad() {
        String pass = "Passw1234";
        boolean result = PasswordValidator.checkSpecialChar(pass);
        assertEquals(false, result);
    }
    
     /**
     * This test gives a boundary input of P@ssword that contains 
     * exactly one special character, no more, no less.
     */
    @Test
    public void testCheckSpecialCharBoundary() {
        String pass = "P@ssword";
        boolean result = PasswordValidator.checkSpecialChar(pass);
        assertEquals(true, result);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
