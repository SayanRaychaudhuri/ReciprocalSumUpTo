
public class SumUpTo {

	public static void main(String[] arg) {
		System.out.println(sumUpTo(2)); // 1+1/2
		System.out.println(sumUpTo(4)); // 1+1/2+1/3+1/4
	}
	
	public static double sumUpTo(int n) {
		if (n<0) {
			throw new IllegalArgumentException("n must be positive");
		}
		if (n==0) {
			return 0.0;
		} else {
			return 1.0/n + sumUpTo(n-1);
		}
	}
}
