package designPattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;

    List<String> domains = new ArrayList<>();

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }
    public void loadImportantData() throws InterruptedException {
        this.importantData = "vary very important data";
        domains.add("www.google.com");
        domains.add("www.facebook.com");
        domains.add("www.thinkitive.com");
        domains.add("www.oracle.com");
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return this.ip+" : " + this.importantData + " : "+this.domains;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());
        for (String d:this.getDomains()){
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
    }
}
