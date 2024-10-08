
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @date 2022年12月17日 下午10:28:35
 * @author Nan Wang
 * @version 1.0
 */
public class User {
    public int u_id;
    public String u_fullname, u_pwd, u_phone;
    List<User> users = new ArrayList<>();
    
    
    public User(){}
    
    public User(int u_id,String u_fullname, String u_pwd, String u_phone){
        this.u_id = u_id;
        this.u_fullname = u_fullname;
        this.u_pwd = u_pwd;
        this.u_phone = u_phone;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_fullname() {
        return u_fullname;
    }

    public void setU_fullname(String u_fullname) {
        this.u_fullname = u_fullname;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }
    
    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }
    
    
    

    
    @Override
    public String toString() {
        return "User{" + "u_id=" + u_id + ", u_fullname=" + u_fullname + ", u_phone=" + u_phone +'}';
    }
    
}
