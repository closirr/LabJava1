package JavaLab1;

import JavaLab1.Controller;

/**
 * Created by KoroVaik on 30.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller сontroller = new Controller(model, view);
        сontroller.calcStep();
    }
}
