package Volume;

public class Balok extends MenghitungRuang{
    int panjang;
    int lebar;
    int tinggi;
    
    MenghitungRuang menghitungRuang = new MenghitungRuang();
    
    float volume(){
        System.out.println("Voulme Balok = " + menghitungRuang.volume(panjang, lebar, tinggi));
        return 0;
    }
}
