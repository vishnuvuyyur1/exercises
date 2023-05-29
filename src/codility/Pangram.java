package codility;

import java.util.List;

public class Pangram {
	public static String isPangram(List<String> strings) {
		// Write your code here
		String ans = "";
		for (int k = 0; k < strings.size(); k++) {
			boolean[] alphaList = new boolean[26];
			int index = 0;
			int flag = 1;
			String str = strings.get(k);
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					index = str.charAt(i) - 'a';
				}
				alphaList[index] = true;
			}
			for (int i = 0; i <= 25; i++) {
				if (alphaList[i] == false)
					flag = 0;
			}
			if (flag == 1)
				ans += "1";
			else
				ans += "0";
		}
		return ans;
	}
}