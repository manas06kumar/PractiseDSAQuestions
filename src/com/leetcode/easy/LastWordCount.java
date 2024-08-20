package com.leetcode.easy;

public class LastWordCount {

	public int lengthOfLastWord(String s) {
	    int i = s.length() - 1;
	    // skip trailing spaces
	    while (i >= 0 && s.charAt(i) == ' ') i--;
	    int len = 0;
	    // count last word
	    while (i >= 0 && s.charAt(i) != ' ') { len++; i--; }
	    return len;
	}

}
