package InternShipTasks01;


import java.util.Scanner;

public class Task06 {

    public static int rand(int init, int fin){
        return (int) (Math.random()*(fin-init)-init);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count=0, i=-1, round=1, completedRound=0, Scoure=0;
        boolean flag=true;
        int rnd=rand(1, 100);

       do {

                System.out.println("Enter Guse number: ");
                int guse = sc.nextInt();


                if (guse == rnd) {
                    System.out.println("Succefulled Gused: ");

                } else if (guse > rnd) {
                    System.out.println("Sorry Your guse is Wrong the Guse is every High, Please  Try Agian ");
                    count++;
                    System.out.println("Reaning Attempts: " + (3 - count));


                } else {
                    System.out.println("Sorry Your guse is Wrong the Guse is every low, Please  Try Agian ");
                    count++;
                    System.out.println("Reaning Attempts: " + (3 - count));


                }

                if (count==3){
                    System.out.println("1.Play Again\n2.Exit");
                    int choice = sc.nextInt();

                    if (choice==1)
                        count=0;
                    else
                        System.out.println("Well Played Best Luck for next Time: ");
                }


            }     while (count != 3);






    }
}
