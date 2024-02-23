package com.practice;


import com.practice.practice.CheckStringAgainstDict;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args){
        //		SpringApplication.run(PracticeApplication.class, args);
//		System.out.println("hello world");

        //Given a string s and a dictionary of strings wordDict,
        // return true if s can be segmented into a
        // space-separated sequence of one or more dictionary words.
        //Note that the same word in the dictionary
        // may be reused multiple times in the segmentation.

        // ["and","band"]

        // ["band", "and"]
        // ["and", "band"]

//		System.out.println(check("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
//		System.out.println(check("applepenapple", Arrays.asList("apple", "pen")));

//        String s = "catsandog";
//        List<String> dict = Arrays.asList("cats","dog","sand","and","cat");

//        String s = "applepenapple";
//        List<String> dict = Arrays.asList("apple", "pen");


        String s = "eeeeeeeeeeeeeeeeeeeeeeeeeeef";
        List<String> dict = Arrays.asList(
                "e",
                "ee",
                "eee",
                "eeee",
                "eeeee",
                "eeeeee",
                "eeeeeee",
                "eeeeeeee",
                "eeeeeeeee",
                "eeeeeeeeee",
                "eeeeeeeeeee",
                "eeeeeeeeeeee",
                "eeeeeeeeeeeee"
        );

        long startTime, endTime, duration;
        boolean result;
        startTime = System.nanoTime();
        result = CheckStringAgainstDict.checkOld(s, dict);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("result:\t"+ result);
        System.out.println("Time for old approach:\t"+ duration + " ns, " + duration/1000000 + " ms");
        System.out.println();
        startTime = System.nanoTime();
        result = CheckStringAgainstDict.check(s, dict);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("result:\t"+ result);
        System.out.println("Time for old approach:\t"+ duration + " ns, " + duration/1000000 + " ms");

    }

}