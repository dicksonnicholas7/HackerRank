import java.util.Scanner;

public class Solution {

    
    //function that compares two strings to check for anagram
    static boolean isAnagram(String a, String b) {
       
//fi the length of a is not equal to the length og b, return false.
if(!(a.length() == b.length())){
    return false;
}else{
    //convert the strings to lowercases
       a = a.toLowerCase();
       b = b.toLowerCase();
    
    //declare variable to save results
       boolean results;

    //declare arrays of type character
       char [] a_arr = a.toCharArray();
       char [] b_arr = b.toCharArray();
    
    //call the sort funvtion to rearrange the letters/charaters in the array in ascending order
       sort(a_arr);
       sort(b_arr);
    
    //declare string variable
       String a_str = "", b_str = "";
    
    
    //loop through character array and save the results in a string variable
       for(int i = 0; i<a_arr.length;i++){
            a_str += a_arr[i];
            b_str += b_arr[i];
       }

    //return true if the values in both variables are the same
return results = a_str.equals(b_str)?true:false;

}


    }

    
    //function to sort charaters in ascending order
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
