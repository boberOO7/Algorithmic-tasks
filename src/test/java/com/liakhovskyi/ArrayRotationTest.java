package com.liakhovskyi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ArrayRotationTest {

        @Test
        public void testArrayRotation() {
                ArrayRotation arrayRotation = new ArrayRotation();

                int[] testArray = {1, 2, 3, 4, 5};
                int rotateIteration = 3;

                int[] expectedArray = {4, 5, 1, 2, 3};
                int[] actualArray = arrayRotation.rotate(testArray, rotateIteration);
                assertArrayEquals(expectedArray,actualArray);
        }
}
