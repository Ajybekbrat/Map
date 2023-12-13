public class Car {
    private  int id;
    private  int gosNumber;

    public Car() {
    }

    public Car(int id, int gosNumber) {
        this.id = id;
        this.gosNumber = gosNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGosNumber() {
        return gosNumber;
    }

    public void setGosNumber(int gosNumber) {
        this.gosNumber = gosNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", gosNumber=" + gosNumber +
                '}';
    }
}
