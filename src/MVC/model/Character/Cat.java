package MVC.model.Character;

public class Cat extends Character implements Drinking {
    private int sipVolume = 5;

    public Cat(String name) {
        super(name);
    }

    @Override
    public int drink(int volume) {
    int result=volume;
        if(volume>=sipVolume) {
            System.out.println(getName() + " drink "+ sipVolume + " ml of water");
            result = volume - sipVolume;
        }else {
            System.out.println("There is not enough water");
        }
        return result;
    }

    public double getSipVolume() {
        return sipVolume;
    }

    public void setSipVolume(int sipVolume) {
        this.sipVolume = sipVolume;
    }
}
