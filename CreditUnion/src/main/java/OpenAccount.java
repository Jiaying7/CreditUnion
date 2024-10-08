/**
 * @date 2022年12月17日 下午11:57:05
 * @author Nan Wang
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class OpenAccount {
    
    public List<Account> accounts = new ArrayList<>();
    
    //-----------------------------------Main----------------------------------------
    public static void main(String[] args) {
        //vars
        List<Account> accounts = new ArrayList<>();
        int u_id;//The user ID is generated after registration. Here, assume a user ID
        String acct_type, evidenceOfidentification, address, evidenceOfaddress, ppsn, is_Member,answer;
        int acctNo;
        boolean isMember;
        
        //constructor
        Account account = new Account();
//        //prepare data
//        Account a1 = new Account(1,"Credit Card",1,"Passport","Utility Bill", "1",true);
//        Account a2 = new Account(2,"Credit Card",2,"Passport","Utility Bill", "2",true);
//        Account a3 = new Account(3,"Credit Card",3,"Passport","Utility Bill", "3",true);
//        accounts.add(a1);
//        accounts.add(a2);
//        accounts.add(a3);

        do{
        //start
        JOptionPane.showMessageDialog(null, "Current Account", "Open Account", 0);
        
        //set user id
        u_id = accounts.size() + 1;
        account.setU_id(u_id);
        
        
        //set account number
        acctNo = (int) (Math.random() * (10^16));
        for(Account a : accounts){
            if(a.getAcctNo()!= acctNo){
                account.setAcctNo(acctNo);
            }else{                
                JOptionPane.showMessageDialog(null, "Got wrong!Duplicate account number,please contact us.", "Open Account", 0);
                return;
            }
        }
        
       
        //input type
        acct_type = "";
        do{
            acct_type = JOptionPane.showInputDialog(null, "Please choose account type(enter 1/2):\n1.Debit Account\n2.Credit Account", "Open Account", 0);
            if(acct_type.equals("1")){
                account.setAcct_type("Debit Account");
            }else if(acct_type.equals("2")){
                account.setAcct_type("Credit Account");
            }
        }while(acct_type.matches("[12]{1}") == false);
        
        //input evidence Of identification
        evidenceOfidentification = "";
        do{
            evidenceOfidentification = JOptionPane.showInputDialog(null, "Please choose the upload document type(enter 1/2/3):\n1.Passport\n2.National ID Card\n3.Drivers’ Licence", "Open Account", 0);
            if(evidenceOfidentification.equals("1")){
                account.setEvidenceOfidentification("Passport");
            }else if(evidenceOfidentification.equals("2")){
                account.setEvidenceOfidentification("National ID Card");
            }else if(evidenceOfidentification.equals("3")){
                account.setEvidenceOfidentification("Drivers’ Licence");
            }
        }while(evidenceOfidentification.matches("[1-3]") == false);
        
        //input evidence Of address
        address = "";
        do{//1:Utility Bill  2:Local Authority Document   3:Official Document for a Government Body   4:Bank/Building Society Statement dated within the last three months
            address = JOptionPane.showInputDialog(null, "Please choose the upload document type(enter 1/2/3/4):\n1.Utility Bill\n2.Local Authority Document\n3.Official Document for a Government Body\n4.Bank/Building Society Statement dated within the last three months", "Open Account", 0);
            if(address.equals("1")){
                evidenceOfaddress = "Utility Bill";
                account.setEvidenceOfaddress(evidenceOfaddress);
            }else if(address.equals("2")){
                evidenceOfaddress = "Local Authority Document";
                account.setEvidenceOfaddress(evidenceOfaddress);
            }else if(address.equals("3")){
                evidenceOfaddress = "Official Document for a Government Body";
                account.setEvidenceOfaddress(evidenceOfaddress);
            }else if(address.equals("4")){
                evidenceOfaddress = "Bank/Building Society Statement dated within the last three months";
                account.setEvidenceOfaddress(evidenceOfaddress);
            }
        }while(address.matches("[1-4]") == false);
        
        //input ppsn
        ppsn = "";
        do{
            ppsn = JOptionPane.showInputDialog(null, "Please enter your PPSN:", "Open Account", 0);
            
            for(Account a : accounts){
                if(a.getPpsn()!= ppsn){
                    account.setPpsn(ppsn);
                    break;
                }else if(a.getPpsn() == ppsn){                
                    JOptionPane.showMessageDialog(null, "Got wrong! Duplicate ppsn,please check.", "Open Account", 0);
                    System.exit(0);
                }
            }
        }while(ppsn.equals(""));
        
        //input whether it is a member
        is_Member = "";
        do{
            is_Member = JOptionPane.showInputDialog(null, "Are you a member of Credit Union?(y/n)", "Open Account", 0);
            
            if(is_Member.equals("y")){
                isMember = true;
                account.setIsMember(isMember);
                break;
            }else if(is_Member.equals("n")){
                isMember = false;                
                JOptionPane.showMessageDialog(null, "You are not a member,please join us.", "Open Account", 0);
                System.exit(0);
            }
        }while(!is_Member.equals("y") || !is_Member.equals("n"));
        
        //add account to arraylist
        accounts.add(account);
        
        //print account info
        JOptionPane.showMessageDialog(null, "Open Account Successfully!\n" + account.toString(), "Open Account", 0);
        
        //end output
        answer = "";
        do{
            answer = JOptionPane.showInputDialog(null, "Continue to open account?(y/n)", "Open Account", 0);
            if(answer.equals("y")){
                break;
            }else if(answer.equals("n")){
                JOptionPane.showMessageDialog(null, "Bye~", "Open Account", 0);
                System.exit(0);
            }
        }while(!answer.equals("y")||!answer.equals("n"));
        
    
        
//        //print accounts in the arraylist of accounts
//        for (Account u : accounts){
//            JOptionPane.showMessageDialog(null, "User\n" + u.toString(), "Open Account", 0);
//        }
    }while(answer.equals("y"));
    
    }//main
    
    //-----------------------------------Test Account Operations----------------------------------------
    //add account
    public int addAccount(int u_id, String acct_type, int acctNo, String evidenceOfidentification, String evidenceOfaddress, String ppsn, boolean isMember) {
        boolean exists = false;
        for (Account a : accounts) {
            if(a.getIsMember() == false || a.getAcctNo() == acctNo){
                exists = true;
            }
        }
        if(exists){
            return -1;
        }
        else{// if the user is a member and account number does not exist, add account to arraylist of accounts
            Account newAccount = new Account(u_id, acct_type, acctNo, evidenceOfidentification, evidenceOfaddress, ppsn, isMember);
            accounts.add(newAccount);
            return newAccount.getAcctNo();
        }
    }
    //delete account
    public int delAccount(int u_id, int acctNo) {
        
        boolean exists = false;
        
        for (Account a : accounts) {
            if (a.getAcctNo() == acctNo) {
                exists = true;
            }
        } 
        if (exists) {
            // if the account number exists, delete the account to the ArrayList of accounts
            accounts.remove(u_id-1);
            return accounts.size();
        } 
        else {
            return -1;
        }
    }
    
    //Set acct_type
    public String setAcct_type(int u_id, int acctNo, String acct_type) {
        
        boolean exists = false;
        for (Account a : accounts) {
            if (a.getAcctNo() == acctNo) {
                exists = true;
            }
        } 
        if (exists) {
            // if the account number exists, set account type
            accounts.get(u_id-1).setAcct_type(acct_type);
            return accounts.get(u_id-1).getAcct_type();
        } 
        else {
            return "fail";
        }
    }
    
    //Submit evidenceOfidentification
    public String submitID(int u_id, int acctNo, String evidenceOfidentification) {
        
        boolean exists = false;
        for (Account a : accounts) {
            if (a.getAcctNo() == acctNo) {
                exists = true;
            }
        } 
        if (exists) {
            accounts.get(u_id-1).setEvidenceOfidentification(evidenceOfidentification);
            return accounts.get(u_id-1).getEvidenceOfidentification();
        } 
        else {
            return "fail";
        }
    }
    
    //Submit evidenceOfaddress
    public String submitAddress(int u_id, int acctNo, String evidenceOfaddress) {
        
        boolean exists = false;
        for (Account a : accounts) {
            if (a.getAcctNo() == acctNo) {
                exists = true;
            }
        } 
        if (exists) {
            accounts.get(u_id-1).setEvidenceOfaddress(evidenceOfaddress);
            return accounts.get(u_id-1).getEvidenceOfaddress();
        } 
        else {
            return "fail";
        }
    }
    
    //Set ppsn
    public String setPpsn(int u_id, int acctNo, String ppsn) {
        int i = 0;
        boolean exists = false;
        for (Account a : accounts) {//ppsn is unique
            if (a.getAcctNo() == acctNo){
                exists = true;
            }
            if(a.getPpsn() == ppsn){//i:the num of duplicate ppsns
                i++;
            }
        } 
        if (exists && i < 1) {//set ppsn, if there is no duplicate ppsn in the arraylist of accounts
            accounts.get(u_id-1).setPpsn(ppsn);
            return accounts.get(u_id-1).getPpsn();
        }
        else {//cannot set ppsn, if there is a duplicate ppsn in the arraylist of accounts
            return "fail";
        }
    }
    
    //Set isMember
    public String setIsMember(int u_id, int acctNo, boolean isMember) {
        
        boolean exists = false;
        for (Account a : accounts) {
            if (a.getAcctNo() == acctNo) {
                exists = true;
            }
        } 
        if (exists) {
            accounts.get(u_id-1).setIsMember(isMember);
            return "is member:"+ accounts.get(u_id-1).getIsMember();
        } 
        else {
            return "fail";
        }
    }
    
    //View account info
    public String viewAcctInfo(int u_id,int acctNo) {
        
        boolean exists = false;
        for (Account a : accounts) {
            if (a.getAcctNo() == acctNo) {
                exists = true;
            }
        } 
        if (exists) {
            return accounts.get(u_id-1).toString();
        } 
        else {
            return "fail";
        }
    }
    
    
    public void printAccounts() {
        for (Account a : accounts)
             System.out.print(a + "\n");
    }
    

}
