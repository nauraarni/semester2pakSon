package notifikasi;

public class smsNotification implements InterfaceNotifikasi {

    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim SMS ke " + receiver + " dengan isi : ");
        System.out.println(content);
    }

}
