
public class Ucgen extends Sekil{
private int dikKenar;
private int tabanKenar;
    public Ucgen(String isim,int dikKenar,int tabanKenar) {
        super(isim);
        this.dikKenar = dikKenar;
        this.tabanKenar = tabanKenar;
    }

    @Override
    void alan_hesapla() {
        
        System.out.println(getIsim() + " alani: " + (dikKenar * tabanKenar / 2));
        
    }
    
    
}
