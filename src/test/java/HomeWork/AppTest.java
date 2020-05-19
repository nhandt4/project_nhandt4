package HomeWork;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    // Test bai 1
    @Test
    public void checkResultBai1(){
        //Assume
        int[] input = {1, 2, 3, 1, 3, 4, 6, 7, 7, 9};
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(9);
        // Action
        ArrayList<Integer> actual = App.funcBai1(input);
        //Assert
        boolean check = false;
        if ((expected.size() == actual.size()) && (actual.containsAll(expected))){
            check = true;
        }
        assertTrue(check);

    }
    // Test bai 2
    @Test
    public void checkResultBai2(){
        //Assume
        int[] input = {1, 2, 3, 1, 3, 4, 6, 7, 7, 9,3};
        int expected = 3;
        // Action
        int actual = App.funcBai2(input);
        System.out.println(actual);
        //Assert
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void checkResultBai3() {
        //Assume
        int input = 10;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);

        // Action
        ArrayList<Integer> actual = App.funcBai3(input);
        System.out.println(actual);
        //Assert
        boolean check = false;
        if ((expected.size() == actual.size()) && (actual.containsAll(expected))){
            check = true;
        }
        assertTrue(check);
    }

    @Test
    public void checkResultBai4() {
        //Assume
        int input = 112;
        int expected = 4;
        // Action
        int actual = App.funcBai4(input);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void checkResultBai5() {
        //Assume
        int input = 196;
        String expected = "196=2*2*7*7";
        // Action
        String actual = App.funcBai5(input);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void checkResultBai6() {
        //Assume
        int input = 100;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(13);
        expected.add(89);
        // Action
        ArrayList<Integer> actual = App.funcBai6(input);
        //Assert
        boolean check = false;
        if ((expected.size() == actual.size()) && (actual.containsAll(expected))){
            check = true;
        }
        assertTrue(check);
    }
}
