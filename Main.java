import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main{
    public static  void main(String[] args){
    Scanner input = new Scanner(System.in);

    List<Superhero> daftarSuperhero = new ArrayList<>();
    System.out.println("Masukkan jumlah superhero : ");
    int jumlahSuperhero = input.nextInt();

    for (int i = 0; i < jumlahSuperhero; i++){
        Superhero superhero = new Superhero();
        System.out.println("Masukkan data superhero ke-" + (i+1));

        System.out.println("Nama Hero : ");
        superhero.setNamahero(input.next());

        System.out.println("Nama Asli : ");
        superhero.setNamaasli(input.next());
        
        System.out.println("Usia : ");
        superhero.setUsia(input.nextInt());

        System.out.println("Kekuatan : ");
        superhero.setKekuatan(input.next());

        System.out.println("Nilai Ujian : ");
        superhero.setNilaiujian(input.nextInt());

        System.out.println("*************************************");

        daftarSuperhero.add(superhero);
    }

    int no=1;
    System.out.println("****************** Daftar Kelulusan Nilai Tes Superhero ****************");
    for (Superhero data : daftarSuperhero){
        System.out.println("Data Superhero " + no);
        System.out.println("Nama Hero : "+ data.getNamahero());
        System.out.println("Nama Asli : "+ data.getNamaasli());
        System.out.println("Usia : "+ data.getUsia());
        System.out.println("Kekuatan : "+ data.getKekuatan());
        System.out.println("Nilai Ujian : "+ data.getNilaiujian());
        System.out.println("*****************************************");
        no++;
    }
    
    for (Superhero data : daftarSuperhero){
        System.out.println("\nNama Hero : "+ data.getNamahero());
        System.out.println("Nama Asli : "+ data.getNamaasli());
        System.out.println("Usia : "+ data.getUsia());
        System.out.println("Kekuatan : "+ data.getKekuatan());
        System.out.println("Nilai Ujian : "+ data.getNilaiujian());
        if(data.getNilaiujian() < 69){
            System.out.println("Hero ini tidak lulus");
        }
        else{System.out.println("Hero ini dinyatakan lulus");
    }
    }

    System.out.println("*********************************");
}
}