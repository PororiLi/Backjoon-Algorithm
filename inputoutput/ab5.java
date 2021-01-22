import java.util.Scanner;

public class ab5 {
    public static void main(String argv[]){
        int a, b;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            a = scan.nextInt();
            b = scan.nextInt();
            if(a==0 && b==0){
                System.exit(0);
            }else{
                System.out.println(a+b);
            }
        }
    }
}