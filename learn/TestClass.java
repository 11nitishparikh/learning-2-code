package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int A_size = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().trim().split(" ");
        int[] A = new int[A_size];
        for (int i_A = 0; i_A < arr_A.length; i_A++) {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        int[] out_ = BS(A);
        wr.print(out_[0]);
        for (int i_out_ = 1; i_out_ < out_.length; i_out_++) wr.print(" " + out_[i_out_]);


        wr.close();
        br.close();
    }

    static int[] BS(int[] A) {
    	List<Integer> arrayToList = new ArrayList<Integer>();
    	List<Integer> resultList = new ArrayList<Integer>();
    	List<Integer> tempList = new ArrayList<Integer>();
    	List<Integer> tempList1 = new ArrayList<Integer>();
    	
    	if(A.length==1) {
    		arrayToList.add(1);
    		return arrayToList.stream().mapToInt(i->i).toArray();
    	}
    	for(Integer numbr: A) {
    		arrayToList.add(numbr);
    		int max = 0;
    		if(arrayToList.size()>1) {
	    		for(int i=0; i < arrayToList.size()-1; i++) {
		    		for(int j=i+1; j < arrayToList.size(); j++) {
		    			if(arrayToList.get(i) <= arrayToList.get(j)) {
		    				if(tempList.size() > 0) {
		    					boolean flag = true;
		    					for(int z=0; z < tempList.size(); z++) {
		    						if(arrayToList.get(j) < tempList.get(z)) {
		    							flag = false;
		    							break;
		    						}
		    					}
		    					if(flag) {
		    						tempList.add(arrayToList.get(j));
		    					}
		    					tempList1.add(tempList.size());
		    				} else if (tempList.size() == 0) {
		    					tempList.add(arrayToList.get(i));
		    					tempList.add(arrayToList.get(j));
		    					tempList1.add(tempList.size());
		    				}
		    			}
		    		}
		    		if(tempList.size() == 0) {
		    			tempList.add(1);
		    		}
		    		tempList.clear();
	    		}
	    	}
    		for(Integer l:tempList1) {
    			if(max<l) {
    				max = l;
    			}
    		}
    		if(tempList1.size()==0) {
    			resultList.add(1);
    		} else {
    			resultList.add(max);
    		}
    		tempList.clear();
    		tempList1.clear();
    	}
		return resultList.stream().mapToInt(i->i).toArray();
    }
}