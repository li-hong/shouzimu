package com.dh.leetcode.zero;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * <p>
 * 17. Letter Combinations of a Phone Number
 * <p>
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class _17_LetterCombinationsofaPhoneNumber {

    public List<String> letterCombinations(String digits) {
        String [] arry = {"_","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


        return new ArrayList<>();
    }

    @Test
    public void testLetterCombinations() {
        List<String> strings = letterCombinations("222");
        for (String string : strings) {
            System.out.println(string + " ");
        }
    }
}
