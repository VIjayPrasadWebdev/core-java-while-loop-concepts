
import java.util.Scanner;
public class tables {
    public static void main(String []x){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value for tables");
        int i =1;
        int n=s.nextInt();
        while (i<=10){
            int table = i*n;
            System.out.println(n+ " *" + " " + i +  " " + " = " + table );
            i++;
        }
    }
}
