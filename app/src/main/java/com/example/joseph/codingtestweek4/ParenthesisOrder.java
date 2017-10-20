package com.example.joseph.codingtestweek4;

import java.util.Stack;

/**
 * Created by joseph on 10/20/17.
 */

public class ParenthesisOrder {

    /*
1. Create a program which checks if the string has the correct order of parenthesis/brackets. ({})[] = true, []{]}[ = false
{a,b}(a,b,c) = true
     */

    public static void main(String[] args) {

        String s1 = "({})[]";
        String s2 = "[]{]}[";
        String s3 = "{a,b}(a,b,c)";
        System.out.println(checkParenthesis(s1));
        System.out.println(checkParenthesis(s2));
        System.out.println(checkParenthesis(s3));

    }

    public static boolean checkParenthesis(String s){

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(!stack.isEmpty()) {
                    Character c = stack.pop();
                    if (!c.equals('('))
                        return false;
                } else
                    return false;
            }else if(s.charAt(i) == '}'){
                if(!stack.isEmpty()) {
                    Character c = stack.pop();
                    if (!c.equals('{'))
                        return false;
                } else
                    return false;
            }else if(s.charAt(i) == ']'){
                if(!stack.isEmpty()) {
                    Character c = stack.pop();
                    if (!c.equals('['))
                        return false;
                } else
                    return false;
            }else{
                continue;
            }
        }

        return true;
    }

}
