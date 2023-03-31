package game;


public class game {
    public static void main(String[] args) {
        
        //membuat objek player
        player petani = new player();
        
        //mengisi atribut player
        petani.name = "Petani KOde";
        petani.speed = 78;
        petani.healthPoin = 0;
        
        //menjalankan method
        petani.run();
        
        if (petani.isDead()) {
             System.out.println("Game Over!");
        }
    }
    
}
