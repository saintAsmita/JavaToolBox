package junitest.leecode.zuochengyun.stackqueue;

import leetcode.stackqueue.TwoStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoStackTest {

    @Before
    public void setUp() {
    }

    @Test
    public void testTwoStack() {
        TwoStack twoStack = new TwoStack();
        int[] result = twoStack.twoStack(new int[]{287, 202, 151, 156, 0}, 5);
        Assert.assertArrayEquals(result, new int[]{287});
    }

}
