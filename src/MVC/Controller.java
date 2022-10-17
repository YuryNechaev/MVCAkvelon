package MVC;


public class Controller {

    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void updateView(){
        Drinking drinking = model.getDrinking();
        double left = drinking.drink(model.getContainer().getCapacity());
        view.printInfo(model.getContainer().getName(), left);
    }

}
