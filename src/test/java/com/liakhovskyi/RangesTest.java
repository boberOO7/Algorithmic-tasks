package com.liakhovskyi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class RangesTest {

    @Test
    public void testRanges() {
        Ranges ranges = new Ranges();

        int[] testArray = {1, 2, 3, 4, 6, 9, 10, 11, 15};

        String expectedResult = "[1 4][6][9 11][15]";
        String actualResult = ranges.ranging(testArray);

        assertEquals(expectedResult, actualResult);
    }
}