package JavaLab1;

import static org.junit.Assert.*;

public class ModelTest {

    @org.junit.Test
    public void testGetSteps() throws Exception {
        Model model = new Model();
        model.setValue(2);
        assertEquals( 8 , (int)model.getSteps().get(1));

    }
}