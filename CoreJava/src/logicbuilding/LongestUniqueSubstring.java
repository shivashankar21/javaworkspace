package logicbuilding;
import java.util.HashSet;

/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:56:09 pm
* Email :paspunoori.shankar@coforge.com
*/


public class LongestUniqueSubstring {
 
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();
		int maxLength = 0, i = 0, j = 0;
 
		while (j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				maxLength = Math.max(maxLength, set.size());
			} else {
				set.remove(s.charAt(i++));
			}
		}
 
		return maxLength;
	}
 
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println("Longest unique substring length: " + lengthOfLongestSubstring(s));
	}
}
 

