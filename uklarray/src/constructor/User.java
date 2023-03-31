
package constructor;

public class User {
    public String username;
    public String password;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }  

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

//class DemoConstructor{
//    public static void main(String[] args) {
//        User petani = new User("Naura", "cookiesn'cream");
//        System.out.println("Username : " + petani.username);
//        System.out.println("Password : " + petani.password);   
//    }
//}
