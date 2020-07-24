package biznesObgectFactory;

import java.math.BigInteger;
import java.util.Objects;

public class Product {

    private BigInteger id;
    private BigInteger orderId;
    private String material;
    private String color;
    private String texture;
    private String image;
    private SizeBox sizeBox;

    public Product() {
    }

    public String getOrderId() {
        return orderId.toString();
    }

    public void setOrderId(String orderId) {
        this.orderId = new BigInteger(orderId);
    }

    public String getDimensions() {
        switch (getSizeBox()) {
            case "maximum": {
                return "" + SizeBox.Maximum.getHeight() + "x" + SizeBox.Maximum.getLength() +
                        "x" + SizeBox.Maximum.getWidth();
            }
            case "middle": {
                return "" + SizeBox.Middle.getHeight() + "x" + SizeBox.Middle.getLength() +
                        "x" + SizeBox.Middle.getWidth();
            }
            case "minimum": {
                return "" + SizeBox.Minimum.getHeight() + "x" + SizeBox.Minimum.getLength() +
                        "x" + SizeBox.Minimum.getWidth();
            }
        }
        return "0";
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSizeBox() {
        return this.sizeBox.getSize();
    }

    public void setSizeBox(String sizeBox) {
        switch (sizeBox) {
            case "maximum": {
                this.sizeBox = SizeBox.Maximum;
            }
            break;
            case "middle": {
                this.sizeBox = SizeBox.Middle;

            }
            break;
            case "minimum": {
                this.sizeBox = SizeBox.Minimum;

            }
            break;
        }
    }

    @Override
    public String toString() {
        return "material: \n" + material + "\n" +
                "color: \n" + color + "\n" +
                "sizeBox: \n" + sizeBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(orderId, product.orderId) &&
                Objects.equals(material, product.material) &&
                Objects.equals(color, product.color) &&
                Objects.equals(texture, product.texture) &&
                Objects.equals(image, product.image) &&
                sizeBox == product.sizeBox;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, material, color, texture, image, sizeBox);
    }
}

