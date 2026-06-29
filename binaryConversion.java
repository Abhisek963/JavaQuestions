package numberprogram;

public class binaryConversion {
	public static void BinaryConversion(int num) {
		String bin = "";
		while(num!=0) {
			int ld = num % 2;
			bin = ld + bin;
			num = num / 2;
		}
		
		System.out.println(bin);
	}
	public static void main(String [] args) {
		BinaryConversion(123);
		BinaryConversion(12);
	}
}
