import java.util.Scanner;

public class uzduotis2 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("iveskite skaiciu X : ");
        x = skaitytuvas.nextInt();
        System.out.println("x = " + x);
        Scanner skaitytuvas1 = new Scanner(System.in);
        System.out.println("iveskite skaiciu Y : ");
        y = skaitytuvas1.nextInt();
        System.out.println("y = " + y);
        System.out.println(" arLyginis(int x, int y)= " + arLyginis(x,y));

    }

    public static int arLyginis(int x, int y) {
        if (x % 2 ==0) {
            return x * y;
        }

        else if (y > 100) {
            return y - x;
        }

        if (y<100) {
            return x - y;
        }

        else {
            y = 100;
            return 0;
        }


    }
}








