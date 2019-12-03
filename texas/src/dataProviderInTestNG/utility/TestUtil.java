package utility;

import java.util.ArrayList;

import javax.sql.rowset.spi.XmlReader;

public class TestUtil {
	
	


	XmlReader reader;

	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]>myData = new ArrayList<Object[]>();
		try {
//			reader = new Xlm_Reader("C:\\Users\\Manoj Adhikari\\eclipse-workspace\\texas\\src\\dataProviderInTestNG\\HalfEbayTestData.xlsx");
		} catch (Exception e){
			e.printStackTrace();
//		
//		}
//		
//		for (int rowNum =2; rowNum<= reader.getRowCount("Sheet1"); rowNum++) {
//			
//			String firstName = reader.getCellData("Sheet1", "firstname", rowNum);
//			String lastName = reader.getCellData("Sheet1", "lasttname", rowNum);
//			String  email = reader.getCellData("Sheet1", "email", rowNum);
//			String password = reader.getCellData("Sheet1", "password", rowNum);
			
	//		Object ob[] = {firstName, lastName, email, password};
		//	myData.add(ob);


		}
		return myData;

	}

}
