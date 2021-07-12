import java.util.Scanner;

public class While_loop {
        public static void main(String []e){
            Scanner x = new Scanner(System.in);
            System.out.println("How many times you want to run the loop ");
            int n = x.nextInt();
            int number = 1;
            while(number<=n)
            {
                System.out.println(number);
            number++;
            }

        }


    }


