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

		// ��ȡexcelģ��·��
		File file = new File("D:\\��λ�ֲ�ͼģ��.xlsx");
		// ��ȡexcelģ��
		XSSFWorkbook wb = new XSSFWorkbook(file);
		// ��ȡ��ģ����sheet������
		XSSFSheet sheet = wb.getSheetAt(0);
		// ����Ӧ�ĵ�Ԫ����и�ֵ ���зֱ��0��ʼ
		XSSFCell cell = sheet.getRow(14).getCell(8);
		cell.setCellValue("����");
		// �޸�ģ�����ݵ�����ģ��
		FileOutputStream out = new FileOutputStream("D:/��λ�ֲ�ͼ.xlsx");
		// �ر���Ӧ����
		wb.write(out);
		out.close();
		wb.close();
	}
}