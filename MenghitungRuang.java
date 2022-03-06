package Volume;

public class MenghitungRuang {
    float volume(int panjang, int lebar, int tinggi){
        return (panjang * lebar * tinggi);
    }
    float volume(int r, int tinggi){
        return ((float) (Math.PI * r * r * tinggi));
    }
}
