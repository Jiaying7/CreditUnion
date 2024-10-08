/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**

 @author Nan Wang
 */
public class RegisterTest {
    
    Register register;
    
    public RegisterTest() {
        // create an instance of register
        register = new Register();
        // set up our "database" of user class
        register.addUser(1,"lily", "123", "3538356778");
        register.addUser(2,"lucy", "123", "3538356778");
        register.addUser(3,"luke", "123", "3538356778");
        register.addUser(4,"jack", "123", "3538356778");
        register.addUser(5,"rose", "123", "3538356778");
        register.addUser(6,"tom", "123",  "3538356778");
        register.addUser(7,"black", "123","3538356778");
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Register.
     */
    //vars are all correct
    @Test
    public void testMain() {
        System.out.println("-------------Main-----------");
        String[] args = {};
        Register.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class Register.
     */
    //1.Add a new user
    @Test
    public void testAddNewUser() {
        System.out.println("----------Test Add New User---------");
        int u_id = 8;
        String u_fullname = "jerry";
        String u_pwd = "123";
        String u_phone = "5465";
        int expResult = u_id;
        int result = register.addUser(u_id, u_fullname, u_pwd, u_phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //2.Add an existing ID user
     @Test
    public void testAddDuplicateUser() {
        System.out.println("----------Test Add Duplicate User---------");
        int u_id = 1;
        String u_fullname = "nancy";
        String u_pwd = "123";
        String u_phone = "5465";
        int expResult = -1;
        int result = register.addUser(u_id, u_fullname, u_pwd, u_phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of delUser method, of class Register.
     */
    //1.Delete an existing ID user
    @Test
    public void testDelExistUser() {
        System.out.println("----------Test Delete Valid User---------");
        int u_id = 6;
        int expResult = 6;
        int result = register.delUser(u_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    
    //2.Delete a nonexisting ID user
    @Test
    public void testDelEmptyUser() {
        System.out.println("----------Test Delete Invalid User---------");
        int u_id = 100;
        int expResult = -1;
        int result = register.delUser(u_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateName method, of class Register.
     */
    //Update the fullname of a valid ID user
    @Test
    public void testUpdateName1() {
        System.out.println("----------Test Update Name of a valid id---------");
        int u_id = 1;
        String u_fullname = "updateName1";
        String expResult = u_fullname;
        String result = register.updateName(u_id, u_fullname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Update the fullname of a nonexisting ID user
    @Test
    public void testUpdateName2() {
        System.out.println("----------Test Update Name of a invalid id---------");
        int u_id = 100;
        String u_fullname = "updateName2";
        String expResult = "fail";
        String result = register.updateName(u_id, u_fullname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of updatePhone method, of class Register.
     */
    //Update the phone of a valid ID user
    @Test
    public void testUpdatePhone1() {
        System.out.println("----------Test Update Phone of a valid id---------");
        int u_id = 2;
        String u_phone = "11111";
        String expResult = u_phone;
        String result = register.updatePhone(u_id, u_phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Update the phone of a nonexisting ID user
    @Test
    public void testUpdatePhone2() {
        System.out.println("----------Test Update Phone of a invalid id---------");
        int u_id = 100;
        String u_phone = "222222";
        String expResult = "fail";
        String result = register.updatePhone(u_id, u_phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of resetPhone method, of class Register.
     */
    //Update the phone of a valid ID user
    @Test
    public void testUpdatePwd1() {
        System.out.println("----------Test Update Pwd of a valid id---------");
        int u_id = 3;
        String u_pwd = "456";
        String expResult = u_pwd;
        String result = register.resetPwd(u_id, u_pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Update the phone of a nonexisting ID user
    @Test
    public void testUpdatePwd2() {
        System.out.println("----------Test Update Pwd of a invalid id---------");
        int u_id = 100;
        String u_pwd = "222222";
        String expResult = "fail";
        String result = register.resetPwd(u_id, u_pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    //View password
    @Test
    public void testViewUserInfo() {
        System.out.println("----------Test View Password---------");
        int u_id = 1;
        String expResult = "123";
        String result = register.viewUserPwd(u_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of printUsers method, of class Register.
     */
    @Test
    public void testPrintUsers() {
        System.out.println("printUsers");
        register.printUsers();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
