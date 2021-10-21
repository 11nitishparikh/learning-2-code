package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Solution11 {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line = in.readLine();
    String[] token = line.split(",");
    int start = Integer.parseInt(token[0]);
    int end = Integer.parseInt(token[1]);
    int flag, count = 0;
    for (int i = start; i <= end; i++) {
        if (i == 1 || i == 0)
            continue;
        flag = 1;

        for (int j = 2; j <= i / 2; ++j) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
        	count = count + 1;
    }
    System.out.println(count);
  }
}