package InternShipTasks01;

import java.util.Scanner;

public class Task04 {
    public static int rand(int init, int fin){
        return (int) (Math.random()*(fin-init)-init);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=-1;
        int rnd=rand(1, 100);
        System.out.println(rnd);
        while(i!=0) {
            System.out.println("Enter Guse number: ");
            int guse = sc.nextInt();;

            if (guse==rnd) {
                System.out.println("Succefulled Gused: ");
                i = 0;
            }else if(guse >rnd) {
                System.out.println("Sorry Your guse is Wrong the Guse is every High: ");
                i=-1;
                System.out.println("Try Agian");

            }else {
                System.out.println("Sorry Your guse is Wrong the Guse is every low: ");
                i=-1;
                System.out.println("Try Agian");
            }

            }
    }
}
