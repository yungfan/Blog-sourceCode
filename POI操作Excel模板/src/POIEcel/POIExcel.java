package POIEcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIExcel {

	public static void main(String[] args) throws IOException, InvalidFormatException {

		// 获取excel模板路径
		File file = new File("D:\\座位分布图模板.xlsx");
		// 读取excel模板
		XSSFWorkbook wb = new XSSFWorkbook(file);
		// 读取了模板内sheet的内容
		XSSFSheet sheet = wb.getSheetAt(0);
		// 在相应的单元格进行赋值 行列分别从0开始
		XSSFCell cell = sheet.getRow(14).getCell(8);
		cell.setCellValue("张三");
		// 修改模板内容导出新模板
		FileOutputStream out = new FileOutputStream("D:/座位分布图.xlsx");
		// 关闭相应的流
		wb.write(out);
		out.close();
		wb.close();
	}
}