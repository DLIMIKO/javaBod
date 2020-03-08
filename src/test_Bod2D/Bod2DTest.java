package test_Bod2D;


import map.rovnica.Bod2D;
import sun.jvm.hotspot.utilities.Assert;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class Bod2DTest {

   private Bod2D Prvy=new Bod2D(1,2);
   private Bod2D Druhy=new Bod2D(0,0);
   private Bod2D Treti=new Bod2D(10,76);


    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {

    }

    @org.junit.jupiter.api.Test
    void getDistance()
    {
     DecimalFormat df=new DecimalFormat("#.##");

     assertEquals("2,24", df.format(Prvy.getDistance(Druhy)));
    }

    @org.junit.jupiter.api.Test
    void plus()
    {
     assertTrue(Prvy.Plus(Treti).equals(new Bod2D(11, 78)));
    }

    @org.junit.jupiter.api.Test
    void minus()
    {
     assertTrue(Prvy.Minus(Treti).equals(new Bod2D(-9, -74)));
    }
}