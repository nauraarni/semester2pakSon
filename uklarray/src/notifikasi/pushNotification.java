package notifikasi;

public class pushNotification implements InterfaceNotifikasi {

    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim push ke " + receiver + " dengan isi : ");
        System.out.println(content);
    }

}
