package jieun.test.function;
// �Լ��� ������ ���ô�.
// Java: long sum(int[] a); (Ŭ���� �̸�: Test)
// a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 
// (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
// ���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
public class Test15596_sum {
	public long sum(int[] a) {
		long result = 0;
		for(int x : a) 
			result += x;
		return result;
	}
}
