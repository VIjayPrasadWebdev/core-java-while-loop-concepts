
import java.util.Scanner;
public class while_sum {
    public static void main(String []e){
        Scanner s = new Scanner(System.in);

        int i=1;
        int sum = 0;
        System.out.println("How many numbers you want");
        int n =s.nextInt();

        while(i<=n)
        {

            System.out.println(i);
            i++;

          sum=sum+i;

    }


        System.out.println("The total is " + sum);
    }

}

