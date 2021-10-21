package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Solution12 {
	/**
	 * Iterate through each line of input.
	 */
	static class Point  
	{ 
	    int x, y; 
	        public Point(int x, int y)  
	        { 
	            this.x = x; 
	            this.y = y; 
	        } 
	}; 
	
	static int distSq(Point p, Point q) 
	{ 
	    return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y); 
	}
	
	static boolean isSquare(Point p1, Point p2, Point p3, Point p4) 
	{ 
	    int d2 = distSq(p1, p2); 
	    int d3 = distSq(p1, p3); 
	    int d4 = distSq(p1, p4); 
	  
	    if (d2 == 0 || d3 == 0 || d4 == 0)     
	        return false; 
	  
	    if (d2 == d3 && 2 * d2 == d4 
	        && 2 * distSq(p2, p4) == distSq(p2, p3)) 
	    { 
	        return true; 
	    } 
	    if (d3 == d4 && 2 * d3 == d2 
	        && 2 * distSq(p3, p2) == distSq(p3, p4))  
	    { 
	        return true; 
	    } 
	    if (d2 == d4 && 2 * d2 == d3 
	        && 2 * distSq(p2, p3) == distSq(p2, p4)) 
	    { 
	        return true; 
	    } 
	    return false; 
	} 
	
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line = in.readLine();
		line = line.replace('(',' ');
		line = line.replace(')','#');
		line.trim();
		line = line.replaceAll(", ","");
		line = line.replaceAll(" ","");
		line.trim();
		System.out.println(line);
	    String[] tokens = line.split("#");
	    System.out.println(tokens[0]+"_"+tokens[1]+"_"+tokens[2]+"_"+tokens[3]);
	    String[] points0 = tokens[0].split(",");
	    System.out.println(Integer.parseInt(points0[0]));
	    System.out.println(Integer.parseInt(points0[1]));
	    String[] points1 = tokens[1].split(",");
	    String[] points2 = tokens[2].split(",");
	    String[] points3 = tokens[3].split(",");
	    
		Point p1 = new Point(Integer.parseInt(points0[0]), Integer.parseInt(points0[1])), 
				p2 = new Point(Integer.parseInt(points1[0]), Integer.parseInt(points1[1])), 
				p3 = new Point(Integer.parseInt(points2[0]), Integer.parseInt(points2[1])), 
				p4 = new Point(Integer.parseInt(points3[0]), Integer.parseInt(points3[1])); 
		System.out.println(isSquare(p1, p2, p3, p4)==true ? "true" : "false");
	}
}