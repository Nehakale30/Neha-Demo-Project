package GlobalEnvVariables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

 public class GlobalValuesDrive {

     public static void main(String[]args) throws IOException {

        Properties pro=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\nkale\\eclipse-workspace\\seleniumSample\\src\\GlobalEnvVariables\\data.properties");
        pro.load(fis);
        System.out.println(pro.getProperty("browser"));
        System.out.println(pro.getProperty("url"));
        pro.setProperty("browser" , "firefox");
        System.out.println(pro.getProperty("browser"));
        FileOutputStream fos=new FileOutputStream("C:\\Users\\nkale\\eclipse-workspace\\seleniumSample\\src\\GlobalEnvVariables\\data.properties");
        pro.store(fos , null);
     }
}
