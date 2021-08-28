import JsoupStaff.JsoupMethods;
import csvToXlsx.CsvToXLSX;
import dateAndTime.DateAndTime;
import db.Db;
import printReadme.PrintReadme;
import writeToFiles.TempFileWriter;
import writeToFiles.WriteColNames;
import writeToFiles.WriteRows;

import java.io.IOException;

import static JsoupStaff.JsoupMethods.document;
import static confData.ConfigRW.addConfigToMap;


public class App {


    public static void main(String[] args) throws IOException, InterruptedException {


        Db.currentDateAndTime = DateAndTime.getDateTime();


        // Fill Map keys and values from config
        Db.confMap = addConfigToMap();

        // Create CSV file and WRITE first row with columnNames
        WriteColNames.createCsvAndWriteColNames();

        // Getting sleeping time
        int threadSleep = Integer.parseInt(Db.confMap.get("threadSleep"));

        // Getting first page for searching PagesCount
        JsoupMethods.getFirstPage();

//        //  TEMP write page to tempOutput.txt
//        String hhh = JsoupMethods.document.toString();
//        TempFileWriter.write(hhh);
//        System.exit(0);


        // Getting quantity of founded pages
        int pagesTotal = JsoupMethods.findPagesCount();


        //****************************   Перебираем страницы   ****************************

        for (int counterOfPages = 1; counterOfPages <= pagesTotal; ) {

            // getting page №[ counterOfPages ]
            JsoupMethods.getPage(counterOfPages);

            System.out.println("Обработка страницы № " + counterOfPages);

            // getting ALL(adsPerPageLimit) Ad blocks by css selector div._main (e.c. 25 Ad blocks)
            JsoupMethods.getPageBlocks();

            // clear tableCols from previous loaded data
            Db.clearCols();

            Db.addToDbCOls();

            WriteRows.writeToCSV();
            counterOfPages++;
            Thread.sleep(threadSleep * 1000);
        }

        CsvToXLSX.csvToXLSX(Db.currentDateAndTime);
        PrintReadme.print();

    }
}


