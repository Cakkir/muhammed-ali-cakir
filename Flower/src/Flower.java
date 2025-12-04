public class Flower {
    String name;
    String color;
    Double unitPrice;

    public Flower(String name, String color, Double unitPrice) {
        this.name = name;
        this.color = color;
        this.unitPrice = unitPrice;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;

    }

}
