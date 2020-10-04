package jieun.test.string;
import java.io.IOException;

// 단어의 개수를 구하는 문제
// space 2번일 때 버그 수정
public class Test1152_NumberOfWords2 {
	public static void main(String[] args) throws IOException {
		int cnt = 0;
		int pre = ' ';
		while (true) {
			int ch = System.in.read();
			if (ch == '\n') {
				if (pre != ' ') cnt ++;
				break;
			}
			if (ch == ' ') {
				if (pre != ' ') cnt ++;
			}
			pre = ch;
		}
		System.out.println(cnt);
	}
}
