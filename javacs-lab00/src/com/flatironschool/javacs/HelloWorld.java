package com.flatironschool.javacs;

public class HelloWorld {

    public static Double getVersion() {

        // Get version number of java
        String version = System.getProperty("java.specification.version");
        return Double.parseDouble(version);
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
        System.out.println(getVersion());
    }
}
