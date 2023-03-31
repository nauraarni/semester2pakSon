package game;


public class player {
    //definisi atribut
    String name;
    int speed;
    int healthPoin;
    
    //definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed "+ speed);
    }
    
    //definisi method isDead untuk mengecek nilai kesehatan (health poin)
    boolean isDead(){
    if(healthPoin <= 0) return true;
    return false;
    }
}
