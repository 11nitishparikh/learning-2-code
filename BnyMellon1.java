package arrays;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import org.json.JSONObject;

import com.google.gson.*;
import java.net.*;
import java.lang.*;



class Result
{

    /*
     * Complete the 'getTopRatedFoodOutlets' function below.
     *
     * URL for cut and paste
     * https://jsonmock.hackerrank.com/api/food_outlets?city=<city>&page=<pageNumber>
     *
     * The function is expected to return an array of strings.
     * 
     * The function accepts only city argument (String).
     */

    public static List<String> getTopRatedFoodOutlets(String city)
    {
        String response;
        int startPage = 1;
        Integer totalPage = Integer.MAX_VALUE;
        List<String> names = new ArrayList<String>();
        HashMap<String, Float> map = new HashMap<String,Float>();
        while(startPage <= totalPage){
            try{
                URL obj = new URL("https://jsonmock.hackerrank.com/api/food_outlets?city="+city+"&page="+startPage);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("GET");
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while((response=in.readLine())!=null){
                    JSONObject conv = new JSONObject(response.toString());
                    totalPage = conv.get("total_pages").getAsInt();
                    JsonArray arr = conv.getAsJsonArray("data");
                    for(int i=0;i<arr.size();i++){
                        String name = arr.get(i).getAsJsonObject().get("name").getAsString();
                        String value = arr.get(i).getAsJsonObject().get("user_rating").getAsJsonObject().getAsJsonObject("average_rating").getAsString();
                        //String v = value.getAsJsonObject().get("average_rating").getAsString();
                        //names.add(name);
                        map.put(name, Float.parseFloat(value));
                    }
                }
                in.close();
                startPage = startPage + 1;
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        List<Map.Entry<String, Float> > list =
               new LinkedList<Map.Entry<String, Float> >(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Float> >() {
            public int compare(Map.Entry<String, Float> o1,
                               Map.Entry<String, Float> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
    
        int count =0 ;
        for (Map.Entry<String, Float> aa : list) {
            names.add(aa.getKey());
           count = count+1;
           if(count==5)
        	   break;
        }
        return names;
        //return ;
    }

}

public class BnyMellon1 {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String city = bufferedReader.readLine();
  
        List<String> result = Result.getTopRatedFoodOutlets("Denver");
        System.out.println(result);
        /*for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
