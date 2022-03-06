package Volume;

public class Tabung extends MenghitungRuang{
    int r;
    int tinggi;
    
    MenghitungRuang menghitungRuang = new MenghitungRuang();
    
    float volume(){
        System.out.println("Voulme Tabung = " + menghitungRuang.volume(r, tinggi));
        return 0;
    }

}
