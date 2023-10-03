import java.util.Scanner;

public class Pemilihan2Percobaan214_1 {
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
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");} 
            
             else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if ((sudut1 == 70) && (sudut2 == 70) && (sudut3 == 40)) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki ");
            } else if ((sudut1 == 70) && (sudut2 == 60) && (sudut3 == 50)) {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            } 
        }else{
        System.out.println("Bukan Segitiga");

}
}
}