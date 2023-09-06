package InternShipTasks01;

import java.util.Scanner;

public class Task01 {

    public static int rand(int init, int fin){
       return (int) (Math.random()*(fin-init)-init);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i=-1;
        while(i!=0) {
            System.out.println("Random Number is: "+ rand(1, 100));
            System.out.println("1.Again/2.Finsh");
            int ch = sc.nextInt();
            if (ch==2){
                i=0;
            }


        }

    }
}
