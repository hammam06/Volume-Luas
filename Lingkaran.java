package Volume;

public class Lingkaran implements MenghitungBidang{
    int r;
    int tinggi;
    
    @Override
    public float luas(){
       float luas = (float) (Math.PI * r * r);
       System.out.println("Luas Persegi Panjang = " + luas);
       return luas;
    }
    @Override
    public float keliling(){
       float keliling = (float) (2 * Math.PI * r);
       System.out.println("Keliling Persegi Panjang = " + keliling);
       return keliling;
    }
}
