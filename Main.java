public class Main {

public static void main(String[]args){
    PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
    persegiPanjang.kelilingPersegiPanjang(15, 10);
    persegiPanjang.luasPersegiPanjang(15,10);

    Persegi persegi = new Persegi(10);
    persegi.keliling();
    persegi.luas();
}
}