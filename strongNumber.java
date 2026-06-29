package numberprogram;

public class strongNumber {

    public static int fact(int num) {
        int factorial = 1;
        while (num > 1) {
            factorial = factorial * num;
            num--;
        }
        return factorial;
    }

    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + fact(digit);
            temp = temp / 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {

        int num = 145;

        if (isStrong(num))
            System.out.println(num + " is a Strong Number");
        else
            System.out.println(num + " is Not a Strong Number");
    }
}