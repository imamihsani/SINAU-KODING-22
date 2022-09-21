import java.util.Scanner;
public class Main {
public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int menu = 0;

        while (menu != 5) {

            System.out.println("============MENU============");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");

            System.out.print("Masukan pilihan menu : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    persegi();
                    break;
                case 2:
                    persegi_panjang();
                    break;
                case 3:
                    segitiga();
                    break;
               case 4:
                     lingkaran();
                     break;
              
                default:
                    System.out.println("Pilihan tidak sesuai!!");
                    break;
            }
        }
    
}


public static void persegi() 
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
public static void persegi_panjang()
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
public static void segitiga()
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
       System.out.println("Luas = " + (int)luas + "\nKeliling = " + (int)keliling);
       System.out.print("");
}
public static void lingkaran()
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