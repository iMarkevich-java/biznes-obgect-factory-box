package businessObjectFactoryBox;

import java.math.BigInteger;

public class Client {
    private BigInteger id;
    private String companyName;
    private String address;
    private String legalData;
    private String manager;

    public Client() {
    }

    public Client(String companyName, String address, String legalData, String manager, String id) {
        this.id = new BigInteger(id);
        this.companyName = companyName;
        this.address = address;
        this.legalData = legalData;
        this.manager = manager;
    }

    public String getId() {
        return id.toString();
    }

    public BigInteger getIdBigInteger() {
        return id;
    }

    public void setId(String id) {
        this.id = new BigInteger(id);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLegalData() {
        return legalData;
    }

    public void setLegalData(String legalData) {
        this.legalData = legalData;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return  "Client \n" +
                "CompanyName = " + companyName + ".\n" +
                "Address = " + address + ".\n" +
                "Legal data = " + legalData + ".\n" +
                "Manager = " + manager + ".\n" +
                "Id=" + id + ".\n" ;
    }
}
