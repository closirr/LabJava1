package JavaLab1;

import java.util.ArrayList;

/**
 * Created by KoroVaik on 30.11.2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_INT = "INT value = ";

    public void printMessage(String message){
        System.out.println(message);
    }



    public void printList(ArrayList<Integer> list){
        for( Integer item : list)
        {

            System.out.println(item);
        }
    }
}
