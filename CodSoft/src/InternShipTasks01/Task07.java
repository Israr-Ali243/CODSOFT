package InternShipTasks01;

import java.util.Scanner;

public class Task07 {
    public static int rand(int init, int fin){
        return (int) (Math.random()*(fin-init)-init);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attempt=0, i=-1, round=1, Scoure=0;
        boolean flag=true;
        int rnd=rand(1, 100);


        do {
            System.out.println("Round: "+ round);
            System.out.println("You Have 3 Attempts: ");


            while (attempt != 3) {

                System.out.println("Enter Guse number: ");
                int guse = sc.nextInt();


                if (guse == rnd) {
                    System.out.println("Succefulled Gused: ");
                    Scoure+=5; round++; flag=true;
                    attempt=0;
                    break;
                } else if (guse > rnd) {
                    System.out.println("Sorry Your guse is Wrong the Guse is every High, Please  Try Agian ");attempt++;
                    System.out.println("Reaning Attempts: " + (3 -attempt));
                    flag=false;

                } else {
                    System.out.println("Sorry Your guse is Wrong the Guse is every low, Please  Try Agian ");attempt++;
                    System.out.println("Reaning Attempts: " + (3 - attempt));
                    flag=false;

                }


            }
            if(flag) {
                i = -1;  System.out.println("\nWelcome to next Round");
            }else
                i=0;

        }while(i!=0);

        System.out.println("RESULT:");
        System.out.println("\nPlayed Rounds: "+ round);
        System.out.println("Scoure: "+ Scoure);

    }
}
