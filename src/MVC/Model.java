package MVC;

public class Model {
    private ContainerForWater container;
    private Drinking drinking;

    public Model(ContainerForWater container, Drinking drinking) {
        this.container = container;
        this.drinking = drinking;
    }

    public Drinking getDrinking() {
        return drinking;
    }

    public void setDrinking(Drinking drinking) {
        this.drinking = drinking;
    }

    public ContainerForWater getContainer() {
        return container;
    }

    public void setContainer(ContainerForWater container) {
        this.container = container;
    }
}
