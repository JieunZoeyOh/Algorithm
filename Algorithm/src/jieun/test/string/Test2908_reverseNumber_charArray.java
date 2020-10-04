package jieun.test.string;
import java.io.*;
public class Test2908_reverseNumber_charArray {
	public static void main(String[] args) throws IOException {
		int[] x = new int[3];
		int[] y = new int[3];
		for(int i = 0; i < x.length; i++) {
			x[i] = System.in.read() - '0';
		}
		System.in.read();
		for(int i = 0; i < x.length; i++) {
			y[i] = System.in.read() - '0';
		}
		int xInt = x[2]*100 + x[1]*10 + x[0];
		int yInt = y[2]*100 + y[1]*10 + y[0];
		
		System.out.println((xInt > yInt)? xInt : yInt);
	}
}
