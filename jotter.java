import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
       
       a = a.toLowerCase();
       b = b.toLowerCase();
       boolean results;

       char [] a_arr = a.toCharArray();
       char [] b_arr = b.toCharArray();
       sort(a_arr);
       sort(b_arr);
       String a_str = "", b_str = "";
    

       for(int i = 0; i<a_arr.length;i++){
            a_str += a_arr[i];
            b_str += b_arr[i];
       }

return results = a_str.equals(b_str)?true:false;

    }

    public static void sort(char [] arr){
        char temp =  ' ';
        for (int i = 0; i<arr.length; i++){
            for(int j=1; j<arr.length;j++){
               if(arr[i]>arr[j]){
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               } 
            }
        }
    }



    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}