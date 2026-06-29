package numberprogram;

public class nPrime {
	public static boolean primeNumber(int num) {
		if (num <= 1) {
            return false;
        }
		for(int i = 2; i * i<=num;i++ ) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	   public static int nprime(int n) {
		   int count = 0;
		   int num= 2;
		   while(true) {
			  if (primeNumber(num)) {
				  count++;
				  if(count == n) {
					  return num;
				  }
			  }
			  num ++;
		   }

	       
	    }
	public static void main(String [] args) {
		System.out.println(nprime(5));
	}
}
