import java.util.Scanner;

public class Ab8 {
    public static void main(String[] agrs){
        int num;
        String a,b;
        int cnt = 1;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num !=0){
            a = sc.next();
            b = sc.next();
            
            System.out.print("Case #"+cnt+": "+a+" + "+b+" = "+(Integer.parseInt(a)+Integer.parseInt(b)));
            System.out.println();
            num--;
        }
    }
}