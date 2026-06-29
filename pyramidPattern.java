package patternProgram;

public class pyramidPattern {
    public static void star(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        star(4);
    }
}
