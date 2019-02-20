package com.liakhovskyi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnit4.class)
public class RestoreArrayTest {

    @Test
    public void testArrayRotation() {
        RestoreArray restoreArray = new RestoreArray();

        int[] testArray = {1, 2, -1, 4, 5, 3, -2, 1};

        int[] expectedArray = {1, 2, 3, 4, 5, 3, 2, 1};
        int[] actualArray = restoreArray.restore(testArray);

        assertArrayEquals(expectedArray, actualArray);
    }
}
