

public class Even_sum {
    public static void main(String[]x){
        int i=1;
        int sum = 0;
        while(i<=20){
            i++;
            if(i % 2 == 0)
            {

                System.out.println(i);
                i++;

                sum = sum + i;
            }

        }
        System.out.println("The Answer is " + sum);

    }
}

