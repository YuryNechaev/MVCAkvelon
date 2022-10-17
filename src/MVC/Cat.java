package MVC;

public class Cat extends Character implements Drinking{
    private double sipVolume = 0.005;

    public Cat(String name) {
        super(name);
    }

    @Override
    public double drink(double volume) {
        System.out.println(getName()+" drink");
        return volume-sipVolume;
    }

    public double getSipVolume() {
        return sipVolume;
    }

    public void setSipVolume(double sipVolume) {
        this.sipVolume = sipVolume;
    }
}
