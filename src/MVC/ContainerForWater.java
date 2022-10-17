package MVC;

public abstract class ContainerForWater {

    private double capacity;
    private String name;

    public ContainerForWater(double capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
