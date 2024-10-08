/**
 *
 * @author Nan Wang
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Register{
    
    public List<User> users = new ArrayList<>();

//----------------------------------Main--------------------------------------
    public static void main(String[] args) {
        //vars
        List<User> users = new ArrayList<>();
        String fullname,phone,pwd;
        int u_id;
        String regex1 = "\\d{3}-[1-9]\\d{6}";//match phone number:xxx-12345678
        String regex2 = "\\d{6}";//matcg any 6 digits
        
        //constructor
        User user = new User();
//        User u1 = new User(1,"lily", "123", "3538356778");
//        User u2 = new User(2,"lucy", "123", "3538356778");
//        User u3 =new User(3,"luke", "123", "3538356778");
//        users.add(u1);
//        users.add(u2);
//        users.add(u3);
               
    
        
        JOptionPane.showMessageDialog(null, "Welcome to the website of Credit Union", "Register", 0);
        
        //set user id
        u_id = users.size() + 1;
        user.setU_id(u_id);
        
        //set fullname
        fullname = "";
        do{
            fullname = JOptionPane.showInputDialog(null, "Please enter your name:", "Register", 0);
            user.setU_fullname(fullname);
        }
        while(fullname.equals(""));
        
        //set phone
        phone = "";
        do{
            phone = JOptionPane.showInputDialog(null, "Please enter your phone:\n(format:xxx-1234567):", "Register", 0);
            user.setU_phone(phone);
        }
        while(phone.matches(regex1) == false);
        
        //set password
        pwd = "";
        do{
            pwd = JOptionPane.showInputDialog(null, "Please set your password:\nPlease enter any 6 digits in length:", "Register", 0);
            user.setU_pwd(pwd);
        }
        while(pwd.matches(regex2) == false);
        
        
        
        //add user
        users.add(user);
//No data available       
//        for (User u : users){
//            if(u.getU_id() != id){//new user
//                user.setU_id(id);//add new user to arraylist of users
//                users.add(user);
//            }
//            else{//old user
//                JOptionPane.showMessageDialog(null, "You are already registered, please login.","Register", 0);
//                break;
//            }
//        }
       //output 
       JOptionPane.showMessageDialog(null, "Registered user info: " + user.toString(), "Register", 0);
        
//       //print all users in users' arraylist
//       for(User u : users){       
//           JOptionPane.showMessageDialog(null, "\n" + user.toString(), "Register", 0);
//       }
    
        

        

    } 
        

    //------------------------------Test Operations of Registration------------------------------------
    //add users
    public int addUser(int u_id, String u_fullname, String u_pwd, String u_phone) {
        
        boolean exists = false;
        
        for (User u : users) {
            if (u.getU_id() == u_id) {
                exists = true;
            }
        } 
        if (exists) {
            // if the user_id already exists, return -1
            return -1;
        } else {
           // if the user_id does not exist, create a new instance
           User newUser = new User(u_id, u_fullname, u_pwd, u_phone);
           // add the new user to the ArrayList of users
           users.add(newUser);
           // return the messages of the new user
           return newUser.getU_id();
        }
    }
    
    //delete users
    public int delUser(int u_id) {
        boolean exists = false;
        
        for (User u : users) {
            if (u.getU_id() == u_id) {
                exists = true;
            }
        }
        if (exists) {
            // delete the user to the ArrayList of users
            users.remove(u_id-1);
            return users.size();
            
        }else{
            return -1;
        }
    }     
    
    //Update fullname
    public String updateName(int u_id, String u_fullname){
        boolean exists = false;
        for (User u : users) {
            if (u.getU_id() == u_id) {
                exists = true;
            }
        } 
        if (exists) {
            users.get(u_id-1).setU_fullname(u_fullname);
            return users.get(u_id-1).getU_fullname();
        }else{
            return "fail";
        }
    }
    
    //Update phone
    public String updatePhone(int u_id, String u_phone){
        boolean exists = false;
        
        for (User u : users) {
            if (u.getU_id() == u_id) {
                exists = true;
            }
        }
        if (exists) {
            // set new phone for the user id to the ArrayList of users
            users.get(u_id-1).setU_phone(u_phone);
            return users.get(u_id-1).getU_phone();
            
        }else{
            return "fail";
        }
    }
    
    //Reset password
    public String resetPwd(int u_id, String u_pwd){
        boolean exists = false;
        
        for (User u : users) {
            if (u.getU_id() == u_id) {
                exists = true;
            }
        }
        if (exists) {
            // set new phone for the user id to the ArrayList of users
            users.get(u_id-1).setU_pwd(u_pwd);
            return users.get(u_id-1).getU_pwd();
            
        }else{
            return "fail";
        }
    }
    
    //View password
    public String viewUserPwd(int u_id){
        boolean exists = false;
        
        for (User u : users) {
            if (u.getU_id() == u_id) {
                exists = true;
            }
        }
        if (exists) {
            // get info
            return users.get(u_id-1).getU_pwd();
        }else{
            return "fail";
        }
    }
    
   
    
    public void printUsers() {
        for (User s : users)
             System.out.print(s + "\n");
    }
}    