package jieun.test.string;
import java.io.*;
public class Test2941_croatian_alphabet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String input;
		String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		while((input = br.readLine()) != null && input.length() != 0) {
			for(int i = 0; i < croatiaAlphabet.length; i++) {
				if(input.contains(croatiaAlphabet[i])) {
					input = input.replace(croatiaAlphabet[i], "a");
					i--;
				}
			}
			sb.append(input.length()).append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
