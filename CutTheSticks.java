import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        for(int k = 0; k < arr.length; k++) {
            int sticksCut = 0;
            int lowestLength = 1000;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < lowestLength && arr[i] > 0) {
                    lowestLength = arr[i];
                }
            }

            for(int j = 0; j < arr.length; j++) {
                if(arr[j] != 0) {
                    arr[j] = arr[j] - lowestLength;
                    sticksCut++;
                }
            }
            if(sticksCut > 0) {
                System.out.println(sticksCut);
            }
        }
    }
}