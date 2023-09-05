package main;

import main.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private List<Integer> numArr1;
    private List<Integer> numArr2;
    @BeforeEach
    void setUp() {

        numArr1 = Arrays.asList(1, 2, 3, 4);
        numArr2 = Arrays.asList(5, 2, 3, 8);
    }

    @Test
    void yesOrNoNumberValidTest() {
        List<String> expected = Arrays.asList("No","Yes","Yes","No");
        List<String> strRes = Main.yesOrNoNumber(numArr1, numArr2);
        assertEquals(expected, strRes);
    }
    @Test
    void yesOrNoNumberInValidTest(){
        List<String> expected = Arrays.asList("No","Yes","No","No");
        assertNotEquals(expected,Main.yesOrNoNumber(numArr1, numArr2));
    }
    @Test
    void lessNumberArrTest(){
        List<Integer> expected = Arrays.asList(1,2,3);
        assertEquals(expected,Main.lessNumberArr(numArr1,3));

    }

}