package MVC.controller;

import MVC.model.Model;
import MVC.model.Character.Drinking;
import MVC.view.View;

public class Controller {

    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void doAction(){
        Drinking drinking = model.getDrinking();
        int left = drinking.drink(model.getContainer().getCapacity());
        model.getContainer().setCapacity(left);
    }

    public void updateView(){

        view.printInfo(model.getContainer().getName(), model.getContainer().getCapacity());
    }

}
