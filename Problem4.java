import java.util.*;

public class Problem4{
    public static void main(String[] args) {

        int[] dict = {1,2,3,4,5,6,7,8,9};
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};

        for(int d : dict) {
            int count = 0;
            for(int num : arr) {
                if(num % d == 0) {
                    count++;
                }
            }
            System.out.println(d + ": " + count);
        }
    }
}
