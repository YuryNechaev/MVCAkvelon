package MVC;


import MVC.controller.Controller;
import MVC.model.*;
import MVC.model.Character.Cat;
import MVC.model.Character.Drinking;
import MVC.model.Character.Person;
import MVC.model.ContainerForWater.Bottle;
import MVC.model.ContainerForWater.Bowl;
import MVC.model.ContainerForWater.ContainerForWater;
import MVC.view.View;

public class MVCStarter {
    public static void main(String[] args) {

        ContainerForWater bowl = new Bowl(200, "Bowl");
        ContainerForWater bottle = new Bottle(25, "Bottle");
        Drinking person = new Person("Person");
        Drinking cat = new Cat("Cat");
        Model catModel = new Model(bowl, cat);
        Model personModel = new Model(bottle, person);
        View view = new View();
        Controller catController = new Controller(view, catModel);
        catController.updateView();
        catController.doAction();
        catController.updateView();
        System.out.println("------------------------");
        Controller personController = new Controller(view, personModel);
        personController.updateView();
        personController.doAction();
        personController.updateView();





    }
}
