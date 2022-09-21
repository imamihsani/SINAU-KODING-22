import java.util.Scanner;
public class Main {
public static void main(String[] args) {
       System.out.println("Menghitung Rumus Bangun Datar");
       Main bangundatar = new Main();
       bangundatar.persegi();
       bangundatar.persegi_panjang();
       bangundatar.segitiga();
       bangundatar.lingkaran();
}
public void persegi() 
{
       Scanner input = new Scanner(System.in);
   
       double s,luas,keliling;
       System.out.println("\n-> Persegi <-");
       System.out.println("Masukkan Sisi : ");
       s=input.nextInt();
       System.out.println("=>");
       luas = s * s;
       keliling = 4*s;
       System.out.print("Luas = " + (int)luas + "\nKeliling  = "+ (int)keliling);
       System.out.println("");
}
public void persegi_panjang()
 {
        Scanner input = new Scanner(System.in);
        double p,l,luas,keliling;
        System.out.println("\n–> Persegi Panjang <–");
        System.out.print("Masukkan Panjang : ");
        p = input.nextDouble();
         System.out.print("Masukkan Lebar : ");
        l = input.nextDouble();
        System.out.println("=>");
        luas = p*l;
        keliling =  2*(p + l);
        System.out.print("Luas  = " + (int)luas + "\nKeliling  = "+ (int)keliling);
        System.out.println("");
        }
public void segitiga()
{
       Scanner input = new Scanner(System.in);
       double a,t,luas,keliling;
       System.out.println("\n->Segitiga<-");
       System.out.print("Masukkan Alas: ");
       a = input.nextDouble();
       System.out.print("Masukkan tinggi :");
       t = input.nextDouble();
       System.out.println("=>");
       luas = 0.5*a*t;
       keliling = 3*t;
       System.out.print("Luas = " + (int)luas + "\nKeliling = " + (int)keliling);
       System.out.print("");
}
public void lingkaran()
{
       Scanner input = new Scanner(System.in);
       double r, luas,keliling;
       double phi = 3.14;
       System.out.println("\n->Lingkaran<-");
       System.out.print("Masukkan Jari-jari : ");
       r = input.nextDouble();
       System.out.println("=>");
       luas = phi*r*r;
       keliling = 2*phi*r;
       System.out.print("Luas = " + (int)luas +"\nKeliling = " + (int)keliling);
       System.out.print("");
}
}