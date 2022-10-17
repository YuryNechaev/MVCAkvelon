package MVC.model.Character;


public class Person extends Character implements Drinking {
    private int sipVolume = 50;

    public Person(String name) {
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


    public int getSipVolume() {
        return sipVolume;
    }

    public void setSipVolume(int sipVolume) {
        this.sipVolume = sipVolume;
    }
}
