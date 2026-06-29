package numberprogram;

public class HexConversion {
	public static void hexConversion(int num) {
		String bin = "";
		while(num!=0) {
			int ld = num % 16;
			if(num<10)
			bin = ld + bin;
			else {
				bin = (char)(ld+55)+bin;
			}
			num = num / 16;
		}
		
		System.out.println(bin);
	}
	public static void main(String [] args) {
		hexConversion(15);
	}
}
