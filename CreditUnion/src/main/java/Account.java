
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @date 2022年12月17日 下午10:43:15
 * @author Nan Wang
 * @version 1.0
 */


public class Account{
    private String acct_type,  evidenceOfidentification, evidenceOfaddress, ppsn;
    private int acctNo,u_id=0;
    private boolean isMember;
    
    public Account(){}
    
    public Account(int u_id, String acct_type, int acctNo, String evidenceOfidentification, String evidenceOfaddress, String ppsn, boolean isMember){
        this.u_id = u_id;
        this.acct_type = acct_type;
        this.acctNo = acctNo;
        this.evidenceOfidentification = evidenceOfidentification;
        this.evidenceOfaddress = evidenceOfaddress;
        this.ppsn = ppsn;
        this.isMember = isMember;
    }
    
 
    
    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    
    public String getAcct_type() {
        return acct_type;
    }

    public void setAcct_type(String acct_type) {
        this.acct_type = acct_type;
    }

    public int getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(int acctNo) {
        this.acctNo = acctNo;
    }

    public String getEvidenceOfidentification() {
        return evidenceOfidentification;
    }

    public void setEvidenceOfidentification(String evidenceOfidentification) {
        this.evidenceOfidentification = evidenceOfidentification;
    }

    public String getEvidenceOfaddress() {
        return evidenceOfaddress;
    }

    public void setEvidenceOfaddress(String evidenceOfaddress) {
        this.evidenceOfaddress = evidenceOfaddress;
    }

    public String getPpsn() {
        return ppsn;
    }

    public void setPpsn(String ppsn) {
        this.ppsn = ppsn;
    }

    public boolean getIsMember() {
        return isMember;
    }

    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    @Override
    public String toString() {
        return "Account{" + "\nuser id: " + u_id +"\naccount type: " + acct_type + ";\naccount number: " + acctNo + ";\nevidenceOfidentification: " + evidenceOfidentification + ";\nevidenceOfaddress: " + evidenceOfaddress + ";\nppsn=" + ppsn + ";\nis member: " + isMember + ";\n}";
    }
 
    
    
}
