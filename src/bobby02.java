import java.util.Scanner;

public class bobby02 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=0,b=0,c=0;
        while (true){
          int  n=scn.nextInt();
            if(n==-999){
                break;
            }
            else if (n>0){
                a+=1;
            }
            else if (n==0){
                b+=1;
            }
            else {
                c+=1;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}