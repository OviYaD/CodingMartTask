package task16;

import java.util.*;
public class WildCardPattern {
    static boolean dp[][];

	static boolean check(String p, String s) {
		char[] str = s.toCharArray();
		char[] pattern = p.toCharArray();
		//replace multiple * with one *
		//e.g a**b***c --> a*b*c
		int writeIndex = 0;
		boolean isFirst = true;
		for (int i = 0; i < pattern.length; i++) {
			if (pattern[i] == '*') {
				if (isFirst) {
					pattern[writeIndex++] = pattern[i];
					isFirst = false;
				}
			} else {
				pattern[writeIndex++] = pattern[i];
				isFirst = true;
			}
		}
		boolean T[][] = new boolean[str.length + 1][writeIndex + 1];
		if (writeIndex > 0 && pattern[0] == '*') {
			T[0][1] = true;
		}
		T[0][0] = true;
		for (int i = 1; i < T.length; i++) {
			for (int j = 1; j < T[0].length; j++) {
				if (pattern[j - 1] == '?' || str[i - 1] == pattern[j - 1]) {
					T[i][j] = T[i - 1][j - 1];
				} else if (pattern[j - 1] == '*') {
					T[i][j] = T[i - 1][j] || T[i][j - 1];
				}
			}
		}
		return T[str.length][writeIndex];
	}
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String pattern = s.next();
        String st = s.next();
        dp = new boolean[pattern.length() + 1][st.length() + 1];
        System.out.println(check(pattern, st));
    }
}