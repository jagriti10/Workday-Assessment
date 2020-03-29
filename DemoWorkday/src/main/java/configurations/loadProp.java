package configurations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class loadProp {
	static Properties prop=new Properties();

	public static Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		loadProp.prop = prop;
	}
	
	public static void loadProperties() throws IOException {
		FileInputStream ip=new FileInputStream("C:\\Users\\jagriti.sharma\\"
				+ "eclipse-workspace\\DemoWorkday\\src\\main\\"
				+ "java\\configurations\\config.properties");
		prop.load(ip);
		
	}
	
	

}
