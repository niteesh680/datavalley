import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Client implements Serializable {
    private int clientId;
    private String clientName;
    private String clientPhone;
    private String clientAddress;

    public Client(int id, String name, String phone, String address) {
        this.clientId = id;
        this.clientName = name;
        this.clientPhone = phone;
        this.clientAddress = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                '}';
    }
}

public class ClientSerialization {
    public static void main(String[] args) {
        Client client = new Client(1, "John Smith", "1234567890", "123 Elm Street");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("SerializedClient.txt"))) {
            outputStream.writeObject(client);
            System.out.println("Client object serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
