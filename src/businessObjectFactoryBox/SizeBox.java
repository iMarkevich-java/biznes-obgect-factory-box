package businessObjectFactoryBox;

public enum SizeBox {
    Maximum("maximum", 100.0, 200.0, 300.0),
    Middle("middle", 50.0, 100.0, 150.0),
    Minimum("minimum", 25.0, 50.0, 75.0);

    private String size;
    private Double height;
    private Double width;
    private Double length;

    SizeBox(String size, Double height, Double width, Double length) {
        this.size = size;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public String getSize() {
        return size;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    public Double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "" + height + 'x' + width + 'x' + length ;
    }
}
