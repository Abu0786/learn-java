package designPattern.prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("creating prototype object");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("172.18.255.255");
        networkConnection.loadImportantData();
        System.out.println(networkConnection);
     // we want object of network connection

        try {
          NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
          NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
          networkConnection.getDomains().remove(0);
          System.out.println(networkConnection);
          System.out.println(networkConnection1);
          System.out.println(networkConnection2);
        }
        catch (CloneNotSupportedException cloneNotSupportedException){
            cloneNotSupportedException.printStackTrace();
        }
    }
}
