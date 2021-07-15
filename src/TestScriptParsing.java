import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class TestScriptParsing {

    File file = new File("tempOutput.txt");
    static Document dc;
    static Elements script;

    public static void main(String[] args) throws IOException {


        File input = new File("tempOutput.txt");
        Document dc = Jsoup.parse(input, "UTF-8");
//        System.out.println(" DC = " + dc);


        script = dc.select("script:containsData(blockFotoramaData)");
        String rrr = script.toString();
        String ttt = rrr.replaceAll("<script>blockFotoramaData = true;var rawData = ", "");
//        System.out.println(ttt);
        String scriptString = ttt.replaceAll("\\;var pageMeta \\= (.*?)\\<\\/script\\>", "");

//        System.out.println(" script patternParseTwoPatterns " + scriptString);


        JSONObject fff = new JSONObject(scriptString);
//        System.out.println("FFF ================== " + fff);

        //          Object           Object         Object    []    Object
        //  ['__INITIAL_STATE__']['OffersSearch']['offers']['result']['0']
        //  ['__INITIAL_STATE__']['OffersSearch']['offersCount']
        //  ['__INITIAL_STATE__']['OffersSearch']['params']['street']['name_ru']


        JSONObject root =  fff.getJSONObject("__INITIAL_STATE__")
                .getJSONObject("OffersSearch")
                .getJSONObject("offers");


        System.out.println(" ========================");




        System.out.println("++++++++++++++++++++++++++++    " );
        System.out.println();


        //  description     К продаже предлагается отличная просторная квартира
        String llll = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getString("description");
        System.out.println(" description      =  " + llll);


        //  contact_phones    +7 (958) 610-44-20
        String llll2 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONArray("contact_phones")
                .getJSONObject(0)
                .getString("formatted");
        System.out.println(" contact_phones  =  " + llll2);



        //  original_phones    +7 (958) 610-44-20
        String llll25 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONArray("original_phones")
                .getJSONObject(0)
                .getString("formatted");
        System.out.println(" original_phones =  " + llll25);


        //  housing estate => name     Жилой комплекс «Седьмое небо»
        String llll3 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("housing_estate")
                .getString("name");
        System.out.println(" housing estate => name  =  " + llll3);


        //  street  name_ru   Державина
        String llll400 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getJSONObject("street")
                .getString("name_ru");
        System.out.println(" street  name_ru  =  " + llll400);


        //  house_number_int    77/1
        String llll4 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getString("house_number");
        System.out.println(" house_number =  " + llll4);


        //  rooms_count    3
        int llll5 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getInt("rooms_count");
        System.out.println(" rooms_count  =  " + llll5);


        //  floor    11
        int llll6 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getInt("floor");
        System.out.println(" floor  =  " + llll6);

        //  microdistrict name_ru   Фрунзенский
        String llll62 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getJSONObject("microdistrict")
                .getString("name_ru");
        System.out.println(" microdistrict name_ru  =  " + llll62);


        //  price   17500000
        int llll63 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getInt("price");
        System.out.println(" price  =  " + llll63);
        System.out.println(new DecimalFormat( "###,###.##" ).format(llll63));


        //  floors_count    23
        int llll600 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getInt("floors_count");
        System.out.println(" floors_count  =  " + llll600);


        //  release_date  year   2008
        int llll608 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getJSONObject("release_date")
                .getInt("year");
        System.out.println(" release_date  year   =  " + llll608);


        //  house_material_type    кирпич - монолит
        String llll7 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getJSONObject("house_material_type")
                .getString("title");
        System.out.println(" house_material_type  =  " + llll7);


        //  condition_type   в отличном состоянии
        String llll70 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getJSONObject("condition_type")
                .getString("title");
        System.out.println(" condition_type  =  " + llll70);


        //  type    улучшенной планировки
        String llll8 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getJSONObject("type")
                .getString("title");
        System.out.println(" type  планировки  =  " + llll8);

        //  total_area    120
        int llll9 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getInt("total_area");
        System.out.println(" total_area  =  " + llll9/100 + " кв.м");


        //  developer   Застройщик - Стройхолдинг, ООО
        String llll10 = root.getJSONArray("result")
                .getJSONObject(0)
                .getJSONObject("params")
                .getString("developer");
        System.out.println(" developer =  " + llll10);

        //  contact_name   Семен
        String llll12 = root.getJSONArray("result")
                .getJSONObject(0)
                .getString("contact_name");
        System.out.println(" contact_name =  " + llll12);

        //  contact_email   petrenkosemen@gmail.com
        String llll14 = root.getJSONArray("result")
                .getJSONObject(0)
                .getString("contact_email");
        System.out.println(" contact_email =  " + llll14);


        //  url   //novosibirsk.n1.ru/view/72779300/
        String llll15 = root.getJSONArray("result")
                .getJSONObject(0)
                .getString("url")
                .replaceAll("\\/\\/", "");
        System.out.println(" url =  " + llll15);

















    }

    public static void checkJSONObject (String o){
        if (o != null) {
            String firstChar = String.valueOf(o.charAt(0));
            if (firstChar.equalsIgnoreCase("[")) {
                System.out.println(" input is JSONArray " + o.charAt(0));
            }else{
                System.out.println(" input is JSONObject " + o.charAt(0));
            }
        } else {
            System.out.println("  input = NULL ");
        }
    }
}
