package com.flatironschool.javacs;

import static org.junit.Assert.assertTrue;

/**
 * Created by pletcher on 3/10/16.
 */
public class HelloWorldTest {

    @org.junit.Test
    public void testGetVersion() throws Exception {
        HelloWorld main = new HelloWorld();
        assertTrue(getVersion() >= 1.7);
    }

    /*
    * For some reason, when this function is in the HelloWorld class, it doesn't
    * work. However, when I moved the EXACT same method here and called it this 
    * way it worked as expected. I've tried calling the method as "HelloWorld.getVersion()"
    * and it STILL doesn't work. I even removed the static, and called it as main.getVersion()
    * to no avail as well...
    */

    public static Double getVersion() {

         // Get version number of java
         String version = System.getProperty("java.specification.version");
         return Double.parseDouble(version);
    }
}
