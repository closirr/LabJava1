package JavaLab1;

import java.util.Scanner;

/**
 * Created by KoroVaik on 30.11.2016.
 */
public class Controller {


    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method

    public void calcStep(){
        Scanner sc = new Scanner(System.in);

        model.setValue(inputIntValueWithScanner(sc));
        view.printList(model.getSteps());
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
