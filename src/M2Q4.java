import java.util.Scanner;

public class M2Q4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {//i是幾行
            for (int j = n; j > i; j--) {//j是幾個空格
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {//k是幾顆星星
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
