package numberprogram;

public class OctalConversion {
	public static void octalConversion(int num) {
		String bin = "";
		while(num!=0) {
			int ld = num % 8;
			bin = ld + bin;
			num = num / 8;
		}
		
		System.out.println(bin);
	}
	public static void main(String [] args) {
		octalConversion(123);
	}
}
