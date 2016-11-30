package JavaLab1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KoroVaik on 30.11.2016.
 */
public class Model {
    private int value;

    // The Program logic

    /**
     * in this method add valueInt with this.value
     * @return list
     */


    public ArrayList<Integer> getSteps() {
        int first, last;
        ArrayList<Integer> list = new ArrayList<Integer>();

        first = value * value;   //A2
        list.add(first);
        last = first * value;    //A3
        list.add(last);
        first = last * first;    //A5
        list.add(first);
        last = first * first;    //A10
        list.add(last);
        first = first * last;    //A15
        list.add(first);

        return list;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
