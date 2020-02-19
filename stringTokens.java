import java.io.*;
import java.util.*;

public class Solution {

    /**
     * 
     * 
     * Given a string, , matching the regular expression 
     * [A-Za-z !,?._'@]+, split the string into tokens. 
     * We define a token to be one or more consecutive
     *  English alphabetic letters. Then, print the 
     * number of tokens, followed by each token on 
     * a new line. 
     */

    public static void main(String[] args) {

        //scanner object for taking inputs
    Scanner scan = new Scanner(System.in);

    //taking string input
    String s = scan.nextLine();

    //trimming whitespaces off string input
    s = s.trim();

    //check if the input is not empty
    if(!(s.length()==0)){

        //declare array of type string
    String [] arr_str = {};

    //split input into tokens and save in array
    arr_str = s.split("[\\s\\-\\.\\'\\?\\,\\_\\@\\!\\t]+");
    System.out.println(arr_str.length);

    //loop through array and output tokens on newlines
    for(int i = 0;i<arr_str.length;i++){
    System.out.println(arr_str[i]);
    }

    }else{
        //if input is empty, output 0
        System.out.println(s.length());
    }
        scan.close();
    }
}