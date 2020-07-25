package businessObjectFactoryBox;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class Material {

    private BigInteger id;
    private BigInteger supplierId;
    private String materialName;
    private BigDecimal price;
    private BigDecimal amount;
    private String unit;
    private String size;
    private String pathImage;

    public Material() {
    }

    public BigInteger getIdBigInteger() {
        return id ;
    }

    public String getId() {
        return id.toString();
    }

    public void setId(String id) {
        this.id = new BigInteger(id);
    }

    public String getSupplierId() {
        return supplierId.toString();
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = new BigInteger(supplierId);
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public BigDecimal getPriceBigDecimal() {
        return price;
    }

    public String getPrice() {
        return price.toString();
    }

    public void setPrice(String price) {
        this.price = new BigDecimal(price);
    }

    public BigDecimal getAmountBigDecimal() {
        return amount;
    }

    public String getAmount() {
        return amount.toString();
    }

    public void setAmount(String amount) {
        this.amount = new BigDecimal(amount);
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Objects.equals(id, material.id) &&
                Objects.equals(supplierId, material.supplierId) &&
                Objects.equals(materialName, material.materialName) &&
                Objects.equals(price, material.price) &&
                Objects.equals(amount, material.amount) &&
                Objects.equals(unit, material.unit) &&
                Objects.equals(size, material.size) &&
                Objects.equals(pathImage, material.pathImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, supplierId, materialName, price, amount, unit, size, pathImage);
    }

    @Override
    public String toString() {
        return "Price: \n" + price + "\n" +
                "Amount: \n" + amount + "\n" +
                "Unit: \n" + unit + "\n" +
                "Size: \n" + size;
    }
}

