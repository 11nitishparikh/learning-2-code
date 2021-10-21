package learn;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result5 {

    /*
     * Complete the 'priceCheck' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY products
     *  2. FLOAT_ARRAY productPrices
     *  3. STRING_ARRAY productSold
     *  4. FLOAT_ARRAY soldPrice
     */

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
    	
    	int errorCount = 0;
    	LinkedHashMap<String,Float> actualProductPriceMap = new LinkedHashMap<String,Float>();
    	for(int i=0;i<products.size();i++) {
    		actualProductPriceMap.put(products.get(i), productPrices.get(i));
    	}
    	
    	for(int j=0;j<productSold.size();j++) {
    		if(actualProductPriceMap.containsKey(productSold.get(j))) {
    			if(!(soldPrice.get(j).equals(actualProductPriceMap.get(productSold.get(j))))) {
    				errorCount = errorCount + 1;
    			}
    		}
    	}
    	
    	return errorCount;
    }

}

public class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int productsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> products = new ArrayList<>();
     
        for (int i = 0; i < productsCount; i++) {
            String productsItem = bufferedReader.readLine();
            products.add(productsItem);
        }

        int productPricesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Float> productPrices = new ArrayList<>();
        for (int i = 0; i < productPricesCount; i++) {
            float productPricesItem = Float.parseFloat(bufferedReader.readLine().trim());
            productPrices.add(productPricesItem);
        }

        int productSoldCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> productSold = new ArrayList<>();
        for (int i = 0; i < productSoldCount; i++) {
            String productSoldItem = bufferedReader.readLine();
            productSold.add(productSoldItem);
        }

        int soldPriceCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Float> soldPrice = new ArrayList<>();
        for (int i = 0; i < soldPriceCount; i++) {
            float soldPriceItem = Float.parseFloat(bufferedReader.readLine().trim());
            soldPrice.add(soldPriceItem);
        }

        int result = Result5.priceCheck(products, productPrices, productSold, soldPrice);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}