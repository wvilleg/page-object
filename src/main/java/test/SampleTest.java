package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test(groups = {"unit"})

    public void first(){

        System.out.println("unit");

    }

    @Test (groups = {"web"})
    public void second(){
        System.out.println("web");
        Assert.assertEquals("1","2");
    }

    @Test(groups = {"db"})
    public void third(){
        System.out.println("db");
    }
}
