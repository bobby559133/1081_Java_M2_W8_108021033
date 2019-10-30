import java.util.Scanner;

public class M2Q2 {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n =scn.nextInt();
        for(int i=1;i<=n;i++){//i是幾行
            for(int j=1;j<=i;j++){//j是幾顆星星
                System.out.println("*"+"\t");
            }
            System.out.println();
        }

    }
}
