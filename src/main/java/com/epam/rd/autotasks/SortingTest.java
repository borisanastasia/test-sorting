package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
        sorting.sort(null);
    }

    @Test
    public void testEmptyCase(){
        int[] array = new int[0];

        sorting.sort(array);

        Assert.assertEquals(0, array.length);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array = new int[]{5};
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{5}, array);
    }

    @Test
    public void testSortedArraysCase() {
        int[] array = new int[]{1,2,3,4,5};
        sorting.sort(array);
        Assert.assertArrayEquals( new int[]{1,2,3,4,5}, array);
    }

    @Test
    public void testOtherCases() {
        int[] array = new int[]{2,5,1,6,3,0};
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{0,1,2,3,5,6},array);

    }

}