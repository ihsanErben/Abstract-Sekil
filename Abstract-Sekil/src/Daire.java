
public class Daire extends Sekil{
private int r;
private double pi = 3.14;
    public Daire(String isim, int r) {
        super(isim);
        this.r = r;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alani: " + (pi*r*r));
    }
    
    
}
