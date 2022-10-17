package MVC;


public class MVCStarter {
    public static void main(String[] args) {

        ContainerForWater container = new Bowl(2.0, "Bowl");
        Drinking person = new Person("Person");
        Drinking cat = new Cat("Cat");
        Model model = new Model(container, person);
        View view = new View();
        Controller controller = new Controller(view, model);
        controller.updateView();





    }
}
