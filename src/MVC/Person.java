package MVC;

public class Person extends Character implements Drinking{
    private double sipVolume = 0.05;

    public Person(String name) {
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
