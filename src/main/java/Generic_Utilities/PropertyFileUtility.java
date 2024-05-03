package Generic_Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
public FileInputStream fisp;
public String readDataFromPropertyFile(String key)throws Throwable{
 FileInputStream fisp=new FileInputStream("C:\\Users\\khasi\\OneDrive\\Desktop\\java programings\\HybridSwagLabsFrameWork\\src\\test\\resources\\Commondata.properties");
 Properties p=new Properties();
 p.load(fisp);
 return p.getProperty(key);
}
}
