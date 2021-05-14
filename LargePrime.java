import java.util.ArrayList;
public class LargePrime {
	public static void main (String []args) {
		int counter = 0;
		int numset = 1;
		while (counter < 10001) {
			numset++;
			if (isPrime(numset)) {
				counter++;
			}
		}
		System.out.println(numset);
		System.out.println(sumPrime(100));

		
	}
	
	public static boolean isPrime(int num) {
		for(int i = 2; i < num-1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int sumPrime(int num) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		int sum = 0;
		for (int t = 0; t < primes.size(); t++) {
			sum = sum + primes.get(t);
		}
		return sum;
	}
	
}
