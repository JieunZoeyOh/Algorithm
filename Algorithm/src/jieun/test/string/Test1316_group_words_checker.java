package jieun.test.string;
import java.io.*;
import java.util.ArrayList;
public class Test1316_group_words_checker {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i < number; i++) {
			ArrayList<Character> store = new ArrayList<Character>();
			String input = br.readLine();
			boolean checker = true;
			for(int j = 0; j < input.length(); j++) {
				if(j == 0) {
					store.add(input.charAt(j));
				} else {
					if(input.charAt(j) != input.charAt(j - 1)) {
						if(!store.contains(input.charAt(j))){
							store.add(input.charAt(j));
						} else {
							checker = false;
							break;
						}
					}
				}
			}
			if(checker == true) count++;
		}
		System.out.println(count);
		br.close();
	}
}
