
public class Dikdortgen extends Sekil{

    @Override
    void alan_hesapla() {
        
        System.out.println(getIsim() + " alani: " + (en*boy));
    }
    private int en;
    private int boy;

    public Dikdortgen( String isim,int en, int boy) {
        super(isim);
        this.en = en;
        this.boy = boy;
    }

    

    
    
    
}
