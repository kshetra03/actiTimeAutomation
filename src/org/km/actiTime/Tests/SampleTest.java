package org.km.actiTime.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Admin on 22-01-2017.
 */
public class SampleTest {

    @Test
    public void test1(){
        Assert.assertEquals(false, true);
    }

    @Test
    public void test2(){
        Assert.assertEquals(true, true);
    }

    @Test
    public void test3(){
        Assert.assertEquals(false, true);
    }
}
