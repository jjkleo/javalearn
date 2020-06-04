package learn.assemble;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws  Exception{
        Properties props=new Properties();
        props.setProperty("username","jizihan");
        props.setProperty("password","123");
        props.store(new FileOutputStream("a.ini"),"comment line");
        Properties props2=new Properties();
        props2.setProperty("gender","female");
        props2.load(new FileInputStream("a.ini"));
        System.out.println(props2);
    }
}
