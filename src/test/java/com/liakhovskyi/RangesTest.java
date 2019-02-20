package com.liakhovskyi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testRangesOneMore() {
        Ranges ranges = new Ranges();

        int[] testArray = {1, 2, 3, 5, 6, 8, 10};

        String expectedResult = "[1 3][5 6][8][10]";
        String actualResult = ranges.ranging(testArray);

        assertEquals(expectedResult, actualResult);
    }
}
