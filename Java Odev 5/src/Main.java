/*
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi=3.14;
        int r,merkezAci;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yaricapi Giriniz : ");
        r = inp.nextInt();
        System.out.print("Merkez Acisinin Olcusunu Giriniz : ");
        merkezAci = inp.nextInt();
        double alan = (pi*(r*r)*merkezAci)/360.0;
        System.out.print("Alan : "+alan);
    }
}