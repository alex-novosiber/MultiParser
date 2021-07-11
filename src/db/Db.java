package db;

import JsoupStaff.JsoupMethods;

import java.util.ArrayList;
import java.util.Map;

public class Db {


    public static ArrayList<String> tableCol1 = new ArrayList<String>();
    public static ArrayList<String> tableCol2 = new ArrayList<String>();
    public static ArrayList<String> tableCol3 = new ArrayList<String>();
    public static ArrayList<String> tableCol4 = new ArrayList<String>();
    public static ArrayList<String> tableCol5 = new ArrayList<String>();
    public static ArrayList<String> tableCol6 = new ArrayList<String>();
    public static ArrayList<String> tableCol7 = new ArrayList<String>();
    public static ArrayList<String> tableCol8 = new ArrayList<String>();
    public static ArrayList<String> tableCol9 = new ArrayList<String>();
    public static ArrayList<String> tableCol10 = new ArrayList<String>();
    public static ArrayList<String> tableCol11 = new ArrayList<String>();
    public static ArrayList<String> tableCol12 = new ArrayList<String>();
    public static ArrayList<String> tableCol13 = new ArrayList<String>();
    public static ArrayList<String> tableCol14 = new ArrayList<String>();
    public static ArrayList<String> tableCol15 = new ArrayList<String>();
    public static ArrayList<String> tableCol16 = new ArrayList<String>();
    public static ArrayList<String> tableCol17 = new ArrayList<String>();
    public static ArrayList<String> tableCol18 = new ArrayList<String>();
    public static ArrayList<String> tableCol19 = new ArrayList<String>();
    public static ArrayList<String> tableCol20 = new ArrayList<String>();
    public static Map<String, String> confMap;
    public static String currentDateAndTime;


    public static void clearCols() {
        tableCol1.clear();
        tableCol2.clear();
        tableCol3.clear();
        tableCol4.clear();
        tableCol5.clear();
        tableCol6.clear();
        tableCol7.clear();
        tableCol8.clear();
        tableCol9.clear();
        tableCol10.clear();
        tableCol11.clear();
        tableCol12.clear();
        tableCol13.clear();
        tableCol14.clear();
        tableCol15.clear();
        tableCol16.clear();
        tableCol17.clear();
        tableCol18.clear();
        tableCol19.clear();
        tableCol20.clear();
    }


    public static void addToDbCOls() {

        tableCol1.addAll(JsoupMethods.getColContent("col1"));
//            System.out.println(" col1 in App class = " + tableCol1.size() + " " + tableCol1);
        tableCol2.addAll(JsoupMethods.getColContent("col2"));
//            System.out.println(" col2 in App class = " + tableCol2.size() + " " + tableCol2);
        tableCol3.addAll(JsoupMethods.getColContent("col3"));
//            System.out.println(" col3 in App class = " + tableCol3.size() + " " + tableCol3);
        tableCol4.addAll(JsoupMethods.getColContent("col4"));
//            System.out.println(" col4 in App class = " + tableCol4.size() + " " + tableCol4);
        tableCol5.addAll(JsoupMethods.getColContent("col5"));
//            System.out.println(" col5 in App class = " + tableCol5.size() + " " + tableCol5);
        tableCol6.addAll(JsoupMethods.getColContent("col6"));
//            System.out.println(" col6 in App class = " + tableCol6.size() + " " + tableCol6);
        tableCol7.addAll(JsoupMethods.getColContent("col7"));
//            System.out.println(" col7 in App class = " + tableCol7.size() + " " + tableCol7);
        tableCol8.addAll(JsoupMethods.getColContent("col8"));
//            System.out.println(" col8 in App class = " + tableCol8.size() + " " + tableCol8);
        tableCol9.addAll(JsoupMethods.getColContent("col9"));
//            System.out.println(" col9 in App class = " + tableCol9.size() + " " + tableCol9);
        tableCol10.addAll(JsoupMethods.getColContent("col10"));
//            System.out.println(" col10 in App class = " + tableCol10.size() + " " + tableCol10);
        tableCol11.addAll(JsoupMethods.getColContent("col11"));
//            System.out.println(" col11 in App class = " + tableCol11.size() + " " + tableCol11);
        tableCol12.addAll(JsoupMethods.getColContent("col12"));
//            System.out.println(" col12 in App class = " + tableCol12.size() + " " + tableCol12);
        tableCol13.addAll(JsoupMethods.getColContent("col13"));
//            System.out.println(" col13 in App class = " + tableCol13.size() + " " + tableCol13);
        tableCol14.addAll(JsoupMethods.getColContent("col14"));
//            System.out.println(" col14 in App class = " + tableCol14.size() + " " + tableCol14);
        tableCol15.addAll(JsoupMethods.getColContent("col15"));
//            System.out.println(" col15 in App class = " + tableCol15.size() + " " + tableCol15);

    }

}
