
package notifikasi;

public class Main {
    public static void main(String[] args) {
        String emailPenerima = "nauraarnii@gmail.com";
        String nomerHp = "+6281331919347";
        String mobileId = "android-123456";

        EmailNotification emailNotif = new EmailNotification();
        smsNotification smsNotif = new smsNotification();
        pushNotification pushNotif = new pushNotification();

        String message = "hellooooooo";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
    
}
