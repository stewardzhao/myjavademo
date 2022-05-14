package test;

import demo2.Clac;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ClacTest {
    /*@Before
    public void init(){
        System.out.println("run init......");
    }

    @After
    public void close(){
        System.out.println("run colse....");
    }*/

    /**
     *
     */
//    @org.junit.Test
    @Test
    public void testAdd(){
        Clac c = new Clac();
        int result = c.add(6,3);
        System.out.println("The calculate result is " + result);
        // panduan
        Assert.assertEquals(result, 9);

    }

    @Test
    public void testSub(){
        Clac c = new Clac();
        int result = c.sub(1,3);
        System.out.println("The calculate result is " + result);
        // panduan
        Assert.assertEquals(result, 5);

    }


}
