package learn;

import java.io.*;
import java.util.*;

public class MinParkingSpaceProblem {
	
	static int minParkingSpaces(int[][] reservationStartEndTimes) {
		if(reservationStartEndTimes.length<=1)
            return reservationStartEndTimes.length;
        Arrays.sort(reservationStartEndTimes, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int max=0, cur=1, end=reservationStartEndTimes[0][1];
        for(int i=0; i<reservationStartEndTimes.length-1; i++){
            if(end>reservationStartEndTimes[i+1][0]){
                cur++;
                max = cur>max?cur:max;
            }else {
                cur--;
            }
            end = Math.max(end, reservationStartEndTimes[i+1][1]);
        }
        return max;
	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		//int n = Integer.parseInt(br.readLine().trim());
		int n=4;
		  
		//int[][] parkingStartEndTimeList = new int[n][2];
		 
		int[][] parkingStartEndTimeList = {{5,10}, {0,20}, {25,40}, {35,45}}; 
		/*String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}*/

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}
}




