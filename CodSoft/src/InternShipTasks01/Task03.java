package InternShipTasks01;

import java.util.Scanner;

public class Task03 {
    public static int rand(int init, int fin){
        return (int) (Math.random()*(fin-init)-init);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Gase Number: ");
        int guse = sc.nextInt();
        int rnd =rand(1, 100);

        if (guse==rnd)
            System.out.println("Your Gase Is Right");
        else if(guse >rnd)
            System.out.println("Sorry Your guse is Wrong the Guse is every High: ");
        else
            System.out.println("Sorry Your guse is Wrong the Guse is every low: ");

        System.out.println("Random Number is : "+rnd);
    }
}
