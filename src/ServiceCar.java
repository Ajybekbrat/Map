public class ServiceCar {
    private  int yearOfIssue;
    private String model;
    private String color;
    private long price;

    public ServiceCar() {
    }

    public ServiceCar(int yearOfIssue, String model, String color, long price) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }


    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ServiceCar{" +
                "yearOfIssue=" + yearOfIssue +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
