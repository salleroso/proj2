package ru.rt.client;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {


    @Test
    public void testarea(){
        Square s=new Square(5);
        Assert.assertEquals(s.area(),25);
    }

}
