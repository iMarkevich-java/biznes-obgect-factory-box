package biznesObgectFactory;

import java.math.BigInteger;
import java.util.Objects;

public class Supplier {
    private BigInteger id;
    private String companyName;
    private String address;
    private String legalData;
    private String manager;

    public Supplier(String id, String companyName, String address, String legalData, String manager) {
        this.id = new BigInteger(id);
        this.companyName = companyName;
        this.address = address;
        this.legalData = legalData;
        this.manager = manager;
    }

    public Supplier() {
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
        return "Company name: \n" + companyName + "\n" +
                "Address: \n" + address + "\n" +
                "Legal data: \n" + legalData + "\n" +
                "Manager: " + manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(id, supplier.id) &&
                Objects.equals(companyName, supplier.companyName) &&
                Objects.equals(address, supplier.address) &&
                Objects.equals(legalData, supplier.legalData) &&
                Objects.equals(manager, supplier.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyName, address, legalData, manager);
    }
}
