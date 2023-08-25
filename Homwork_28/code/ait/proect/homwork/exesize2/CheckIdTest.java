package ait.proect.homwork.exesize2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIdTest {
    PAddress checkId = new PAddress();

    @BeforeEach
    void setUp() {

    }

    @Test
    void check1() {
        String validId = "192.168.25.1";
        assertTrue(checkId.idCheck(validId));
    }

    @Test
    void check2() {
        String inValidId = "192.168.1";
        assertFalse(checkId.idCheck(inValidId));
    }

    @Test
    void check3() {
        String inValidId = "192.168.256.1";
        assertFalse(checkId.idCheck(inValidId));
    }

    @Test
    void check4() {
        String inValidId = "192.168.25.-1";
        assertFalse(checkId.idCheck(inValidId));
    }


}