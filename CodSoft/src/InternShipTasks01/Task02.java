package InternShipTasks01;

import java.util.Scanner;

public class Task02 {
    public static int rand(int init, int fin){
        return (int) (Math.random()*(fin-init)-init);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your Gase Number: ");
        int gase = sc.nextInt();

        System.out.println("Random Number is: "+ rand(1, 100));
        System.out.println("Your Guse is: "+ gase);


    }
}
