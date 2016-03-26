public class blah {  
    public static Double getVersion() {
        //System.out.println("Hi");
        String version = System.getProperty("java.specification.version");
        //System.out.println(version);
        //String number = version.substring(0,2);
        return Double.parseDouble(version);
    }

    public static void main(String[] args) {
        // you can test the output of getVersion() here
        System.out.println(getVersion());
    }
}
