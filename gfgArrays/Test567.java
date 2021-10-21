package gfgArrays;

import java.util.Arrays;

public class Test567 {
	
	
	public String solution(int[] T){
	    int index = 0, maxAmplitude = 0;

	    int[] winter = new int[(T.length/4)];
	    int[] spring = new int[(T.length/4)];
	    int[] summer = new int[(T.length/4)];
	    int[] autumn = new int[(T.length/4)];
	    int[] tempDiff = new int[4];

	    for(int j=0, i=0;j<(T.length/4); j++,i++){
	        winter[i] = T[j];
	    }

	    for(int j=(T.length/4),i=0;j<(T.length/4)*2; j++,i++){
	        spring[i] = T[j];
	    }

	    for(int j=(T.length/4)*2,i=0;j<(T.length/4)*3; j++,i++){
	        summer[i] = T[j];
	    }

	    for(int j=(T.length/4)*3,i=0;j<(T.length/4)*4; j++,i++){
	        autumn[i] = T[j];
	    }
	    
	    Arrays.sort(winter);
	    Arrays.sort(spring);
	    Arrays.sort(summer);
	    Arrays.sort(autumn);

	    tempDiff[0] = winter[(T.length/4)-1]-winter[0];
	    tempDiff[1] = spring[(T.length/4)-1]-spring[0];
	    tempDiff[2] = summer[(T.length/4)-1]-summer[0];
	    tempDiff[3] = autumn[(T.length/4)-1]-autumn[0];

	    maxAmplitude=tempDiff[0];

	    for(int k=1; k<4; k++){
	        if (tempDiff[k]>maxAmplitude){
	        	maxAmplitude = tempDiff[k];
	            index = k;
	        }
	    }

	    System.out.println(maxAmplitude);
	    System.out.println(index);
	    final String[] seasonName = { "WINTER", "SPRING", "SUMMER", "AUTUMN" };
	   
	    return seasonName[index];
	}
	


	public static void main(String[] args) {

		Test567 rotate = new Test567();
		int arr[] = {2,-3,3,1,10,8,2,5,13,-5,3,-18}; 
		System.out.println(rotate.solution(arr)); 
	}

}
