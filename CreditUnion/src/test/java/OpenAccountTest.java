import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**

 @author Nan Wang
 */
public class OpenAccountTest {
    OpenAccount openAccount;
    public OpenAccountTest() {
        // create an instance of register
        openAccount = new OpenAccount();
        // set up our "database" of user class
        openAccount.addAccount(1, "Credit Card", 1,  "Passport",          "Utility Bill",                             "1", true);
        openAccount.addAccount(2, "Debit Card",  2,  "National ID Card",  " Bank Society Statement",                  "2", true);
        openAccount.addAccount(3, "Credit Card", 3,  "National ID Card",  "Local Authority Document",                 "3", true);
        openAccount.addAccount(4, "Debit Card",  4,  "Passport",          "Official Document",                        "4", true);
        openAccount.addAccount(5, "Credit Card", 5,  "Drivers’ Licence",  "Building Society Statement",               "5", true);
        openAccount.addAccount(6, "Debit Card",  6,  "National ID Card",  "Utility Bill",                             "6", true);
        openAccount.addAccount(7, "Debit Card",  7,  "National ID Card",  "Utility Bill",                             "7", true);
        

    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class OpenAccount.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        OpenAccount.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccount method, of class OpenAccount.
     */
    //Add account: isMember=false, exists=true
    @Test
    public void testIsNotMemberExist() {
        System.out.println("--------addAccount----------");
        int u_id = 8;
        String acct_type = "Debit Card";
        int acctNo = 1;
        String evidenceOfidentification = "Passport";
        String evidenceOfaddress = "Utility Bill";
        String ppsn = "id8 ppsn";
        boolean isMember = false;
        int expResult = -1;
        int result = openAccount.addAccount(u_id, acct_type, acctNo, evidenceOfidentification, evidenceOfaddress, ppsn, isMember);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Add account: isMember=true, exists=true
    @Test
    public void testIsMemberExist() {
        System.out.println("--------addAccount----------");
        int u_id = 8;
        String acct_type = "Debit Card";
        int acctNo = 1;
        String evidenceOfidentification = "Passport";
        String evidenceOfaddress = "Utility Bill";
        String ppsn = "id8 ppsn";
        boolean isMember = true;
        int expResult = -1;
        int result = openAccount.addAccount(u_id, acct_type, acctNo, evidenceOfidentification, evidenceOfaddress, ppsn, isMember);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Add account: isMember=false, exists=false
    @Test
    public void testIsNotMemberNonexist() {
        System.out.println("--------addAccount----------");
        int u_id = 8;
        String acct_type = "Debit Card";
        int acctNo = 8;
        String evidenceOfidentification = "Passport";
        String evidenceOfaddress = "Utility Bill";
        String ppsn = "id8 ppsn";
        boolean isMember = false;
        int expResult = -1;
        int result = openAccount.addAccount(u_id, acct_type, acctNo, evidenceOfidentification, evidenceOfaddress, ppsn, isMember);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Add account: isMember=true, exists=false
    @Test
    public void testIsMemberNonexist() {
        System.out.println("--------addAccount----------");
        int u_id = 8;
        String acct_type = "Debit Card";
        int acctNo = 8;
        String evidenceOfidentification = "Passport";
        String evidenceOfaddress = "Utility Bill";
        String ppsn = "id8 ppsn";
        boolean isMember = true;
        int expResult = 8;
        int result = openAccount.addAccount(u_id, acct_type, acctNo, evidenceOfidentification, evidenceOfaddress, ppsn, isMember);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delAccount method, of class OpenAccount.
     */
    //Account exists
    @Test
    public void testDelExist() {
        System.out.println("---------delAccount---------");
        int u_id = 1;
        int acctNo = 1;
        int expResult = 6;
        int result = openAccount.delAccount(u_id, acctNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Account doesn't exist
    @Test
    public void testDelNonExist() {
        System.out.println("---------delAccount---------");
        int u_id = 1;
        int acctNo = 100;
        int expResult = -1;
        int result = openAccount.delAccount(u_id, acctNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setAcct_type method, of class OpenAccount.
     */
    @Test
    public void testSetAcct_type() {
        System.out.println("----------setAcct_type-----------");
        int u_id = 1;
        int acctNo = 1;
        String acct_type = "new type";
        String expResult = acct_type;
        String result = openAccount.setAcct_type(u_id, acctNo, acct_type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of submitID method, of class OpenAccount.
     */
    @Test
    public void testSubmitID() {
        System.out.println("-----------submitID------------");
        int u_id = 1;
        int acctNo = 1;
        String evidenceOfidentification = "new id";
        String expResult = evidenceOfidentification;
        String result = openAccount.submitID(u_id, acctNo, evidenceOfidentification);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of submitAddress method, of class OpenAccount.
     */
    @Test
    public void testSubmitAddress() {
        System.out.println("-------------submitAddress--------------");
        int u_id = 1;
        int acctNo = 1;
        String evidenceOfaddress = "new addrress";
        String expResult = evidenceOfaddress;
        String result = openAccount.submitAddress(u_id, acctNo, evidenceOfaddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPpsn method, of class OpenAccount.
     */
    //Non-Duplicate ppsn
    @Test
    public void testSetPpsn1() {
        System.out.println("-----------set Non-Duplicate Ppsn--------------------");
        int u_id = 1;
        int acctNo = 1;
        String ppsn = "new ppsn";
        String expResult = ppsn;
        String result = openAccount.setPpsn(u_id, acctNo, ppsn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Set duplicate ppsn
    @Test
    public void testSetPpsn2() {
        System.out.println("-----------set Duplicate Ppsn--------------------");
        int u_id = 1;
        int acctNo = 1;
        String ppsn = "1";
        String expResult = "fail";//ppsn is unique
        String result = openAccount.setPpsn(u_id, acctNo, ppsn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIsMember method, of class OpenAccount.
     */
    //Set isMember
    @Test
    public void testSetIsMember() {
        System.out.println("setIsMember");
        int u_id = 1;
        int acctNo = 1;
        boolean isMember = false;
        String expResult = "is member:" + isMember;
        String result = openAccount.setIsMember(u_id, acctNo, isMember);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setIsMember method, of class OpenAccount.
     */
    //View account info
    @Test
    public void testViewAcctInfo() {
        System.out.println("---------------ViewAcctInfo----------------");
        int u_id = 1, acctNo = 1;
        String acct_type = openAccount.accounts.get(0).getAcct_type();
        String evidenceOfidentification = openAccount.accounts.get(0).getEvidenceOfidentification();
        String evidenceOfaddress = openAccount.accounts.get(0).getEvidenceOfaddress();
        boolean isMember = openAccount.accounts.get(0).getIsMember();
        String ppsn = openAccount.accounts.get(0).getPpsn();
        
        String expResult = "Account{" + "account type is: " + acct_type + ", account number is: " + acctNo + ", evidenceOfidentification=" + evidenceOfidentification + ", evidenceOfaddress=" + evidenceOfaddress + ", ppsn=" + ppsn + ", is member: " + isMember + '}';
        String result = openAccount.viewAcctInfo(u_id,acctNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of printAccounts method, of class OpenAccount.
     */
    @Test
    public void testPrintAccounts() {
        System.out.println("printAccounts");
        openAccount.printAccounts();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
