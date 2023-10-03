import java.util.Scanner;

public class Pemilihan2Percobaan214 {
    public static void main(String[] args) {
        Scanner Input14 = new Scanner (System.in);

        System.out.print("Nilai sudut 1 : ");
        float sudut1 = Input14.nextFloat();
        System.out.print("Nilai sudut 2 : ");
        float sudut2 = Input14.nextFloat();
        System.out.print("Nilai sudut 3 : ");
        float sudut3 = Input14.nextFloat();

        float totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan siku-siku");
        } else
            System.out.println("Bukan Segitiga");
    }
}
