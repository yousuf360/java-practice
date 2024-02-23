package com.practice.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckStringAgainstDict {

    public static boolean check(String s, List<String> dict){
        Set<String> setOfFailures = new HashSet<>();
        return check(s, dict, setOfFailures);
    }
    private static boolean check(String s, List<String> dict, Set<String> setOfFailures){
        if(setOfFailures.contains(s)){
            return false;
        }
        if(s.isEmpty()){
            return true;
        }
        for(String eachWord: dict){
            if(s.startsWith(eachWord)){
                if(check(s.substring(eachWord.length()), dict)) {
                    return true;
                }
            }
        }
        setOfFailures.add(s);
        return false;
    }

    public static boolean checkOld(String s, List<String> dict){

        for(String eachWord: dict){
            if(s.startsWith(eachWord)){
                if(checkOld(s.replaceFirst(eachWord, ""), dict)) {
                    return true;
                }
            }
        }
        return s.isEmpty();
    }
}
