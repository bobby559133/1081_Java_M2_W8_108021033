import java.util.Scanner;

public class bobby01 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0,b=0,c=0;
        while (n!=-999){
            if(n>0){
                a+=1;
            }
            else if (n==0){
                b+=1;
            }
            else {
                c+=1;
            }
            n=scn.nextInt();
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}