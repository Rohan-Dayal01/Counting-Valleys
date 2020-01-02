import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int vcount = 0;
        int curelvtion = 0;
        int prelvtion;
        /*Dictionary elkey = new Hashtable();
        elkey.put("U",int(1));
        elkey.put("D",int(-1));*/
        //System.out.println(s.substring(0,1));
        for(int x=0;x<n;x++){
            //System.out.println(s.substring(x,x+1));
            prelvtion=curelvtion; 
            if(s.substring(x,x+1).equals("U")){
                curelvtion++;
            }
            else if(s.substring(x,x+1).equals("D")){
                curelvtion--;
            }
            //System.out.println(curelvtion);
            if(prelvtion<0 && curelvtion==0){
                vcount++;
            }
        }
        return vcount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
