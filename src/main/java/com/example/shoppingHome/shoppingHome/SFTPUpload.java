package com.example.shoppingHome.shoppingHome;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

@Component
public class SFTPUpload {

    static Logger logger = LogManager.getLogger(SFTPUpload.class);


    //File excelFile = new File("Users/aniket/Desktop/RegisterData.xlsx");
    FileInputStream fis;
    File excelFile;

    @Scheduled(fixedRate = 1000)
    public void bulkUpload(){
        try {

            System.out.println("in Scheduler");

            excelFile = new ClassPathResource("/sftp/RegisterData.xlsx").getFile();
            fis = new FileInputStream(excelFile);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Data");

            // we iterate on rows
            Iterator<Row> rowIt = sheet.iterator();
            while(rowIt.hasNext()) {
                Row row = rowIt.next();

                // iterate on cells for the current row
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    System.out.print(cell.getStringCellValue() + ";");
                    
                }
            }

        } catch (FileNotFoundException e) {
            logger.debug(e.getMessage());
            e.printStackTrace();


        }catch(Exception e)
        {
            logger.debug(e.getMessage());
            e.printStackTrace();

        }finally {
            excelFile = null;
            fis = null;

        }
    }




}
