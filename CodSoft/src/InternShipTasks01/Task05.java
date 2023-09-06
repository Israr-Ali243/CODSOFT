package InternShipTasks01;

import java.util.Scanner;

public class Task05 {
    public static int rand(int init, int fin){
        return (int) (Math.random()*(fin-init)-init);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int count=0;
        int rnd=rand(1, 100);


        while(count!=3) {
            System.out.println("Enter Guse number: ");
            int guse = sc.nextInt();
            ;

            if (guse == rnd) {
                System.out.println("Succefulled Gused: ");
               break;
            } else if (guse > rnd) {
                System.out.println("Sorry Your guse is Wrong the Guse is every High, Please  Try Agian ");
                count++;
                System.out.println("Reaning Attempts: "+(3-count));

            } else {
                System.out.println("Sorry Your guse is Wrong the Guse is every low, Please  Try Agian ");
                count++;
                System.out.println("Reaning Attempts: "+(3-count));
            }


        }

        }
}
