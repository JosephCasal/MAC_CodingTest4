package com.example.joseph.codingtestweek4;

/**
 * Created by joseph on 10/20/17.
 */

public class SubstringCopies {

    /*
    2. Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
xaxax, xax, 2 = true
     */

    public static void main(String[] args) {

        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies("catcowcat", "cow", 1));
        System.out.println(strCopies("xaxax", "xax", 2));

    }

    public static boolean strCopies(String string, String sub, int count){
        return (recursiveSubstringCount(string, sub) >= count) ? true : false;
    }

    private static int recursiveSubstringCount(String string, String sub){

        if(sub.length() > string.length()){
            return 0;
        }

        boolean check = true;
        for (int i = 0; i < sub.length(); i++) {
            if(string.charAt(i) != sub.charAt(i)){
                check = false;
                break;
            }
        }

        if(check)
            return 1 + recursiveSubstringCount(string.substring(1, string.length()), sub);
        else
            return 0 + recursiveSubstringCount(string.substring(1, string.length()), sub);

    }

}
