package writeToFiles;

import confData.ConfigRW;
import dateAndTime.DateAndTime;
import db.Db;

import java.io.FileWriter;
import java.io.IOException;

public class WriteRows {

    static String currentDateAndTime = DateAndTime.currentDateAndTime;
    static String outputFileName = ConfigRW.propsMap.get("outputFileName").toString();


    static boolean col1Use = ConfigRW.getBool("col1Use");
    static boolean col2Use = ConfigRW.getBool("col2Use");
    static boolean col3Use = ConfigRW.getBool("col3Use");
    static boolean col4Use = ConfigRW.getBool("col4Use");
    static boolean col5Use = ConfigRW.getBool("col5Use");
    static boolean col6Use = ConfigRW.getBool("col6Use");
    static boolean col7Use = ConfigRW.getBool("col7Use");
    static boolean col8Use = ConfigRW.getBool("col8Use");
    static boolean col9Use = ConfigRW.getBool("col9Use");
    static boolean col10Use = ConfigRW.getBool("col10Use");
    static boolean col11Use = ConfigRW.getBool("col11Use");
    static boolean col12Use = ConfigRW.getBool("col12Use");
    static boolean col13Use = ConfigRW.getBool("col13Use");
    static boolean col14Use = ConfigRW.getBool("col14Use");
    static boolean col15Use = ConfigRW.getBool("col15Use");
    static boolean col16Use = ConfigRW.getBool("col16Use");
    static boolean col17Use = ConfigRW.getBool("col17Use");
    static boolean col18Use = ConfigRW.getBool("col18Use");
    static boolean col19Use = ConfigRW.getBool("col19Use");
    static boolean col20Use = ConfigRW.getBool("col20Use");


    public static void writeToCSV() {

        int iterator = 0;
        for (int i = 0; i < Db.tableCol1.size(); i++) {
            try {
                FileWriter writer = new FileWriter(outputFileName + currentDateAndTime + ".csv", true);
                if (col1Use) {
                    writer.write(Db.tableCol1.get(iterator) + "\t");
                }        //  1-к      2-к
                if (col2Use) {
                    writer.write(Db.tableCol2.get(iterator) + "\t");
                }        //  Вилюйская, 5/2
                if (col3Use) {
                    writer.write(Db.tableCol3.get(iterator) + "\t");
                }        //  Новосибирск,
                if (col4Use) {
                    writer.write(Db.tableCol4.get(iterator) + "\t");
                }        //  Жилой комплекс «Оазис»
                if (col5Use) {
                    writer.write(Db.tableCol5.get(iterator) + "\t");
                }        //  105 м2
                if (col6Use) {
                    writer.write(Db.tableCol6.get(iterator) + "\t");
                }        //  Студенческая 6 мин
                if (col7Use) {
                    writer.write(Db.tableCol7.get(iterator) + "\t");
                }        //  Октябрьский район Ключ-Камышенское плато,
                if (col8Use) {
                    writer.write(Db.tableCol8.get(iterator) + "\t");
                }        //  17 этаж     (из 17/25 )
                if (col9Use) {
                    writer.write(Db.tableCol9.get(iterator) + "\t");
                }        //  25     (из 17/25 )  этажность
                if (col10Use) {
                    writer.write(Db.tableCol10.get(iterator) + "\t");
                }      //  4 250 000
                if (col11Use) {
                    writer.write(Db.tableCol11.get(iterator) + "\t");
                }       // 160.000 кв/м
                if (col12Use) {
                    writer.write(Db.tableCol12.get(iterator) + "\t");
                }       // https://novosibirsk.n1.ru/view/72695399/
                if (col13Use) {
                    writer.write(Db.tableCol13.get(iterator) + "\t");
                }       // https://novosibirsk.n1.ru/view/72695399/
                if (col14Use) {
                    writer.write(Db.tableCol14.get(iterator) + "\t");
                }       // https://novosibirsk.n1.ru/view/72695399/
                if (col15Use) {
                    writer.write(Db.tableCol15.get(iterator) + "\t");
                }       //  https://novosibirsk.n1.ru/view/32746788/
                if (col16Use) {
                    writer.write(Db.tableCol16.get(iterator) + "\t");
                }
                if (col17Use) {
                    writer.write(Db.tableCol17.get(iterator) + "\t");
                }
                if (col18Use) {
                    writer.write(Db.tableCol18.get(iterator) + "\t");
                }
                if (col19Use) {
                    writer.write(Db.tableCol19.get(iterator) + "\t");
                }       //
                if (col20Use) {
                    writer.write(Db.tableCol20.get(iterator) + "\t");
                }       //
                writer.write("\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            iterator++;
        }

    }


}
