
package hengerprogram;

public class LyukasHenger extends TomorHenger{
    private double falvastagsag;
    
    public LyukasHenger(double sugar, double magassag, double fajsuly) {
        this(sugar,magassag,fajsuly,1);
        
    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag=falvastagsag;
    }
    
    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    public double terfogat() {
        Henger bel = new Henger(getSugar()-falvastagsag, getMagassag()) {};
        return super.terfogat()-bel.terfogat();
    }

    @Override
    public String toString() {
        return super.toString()+"falvastagsag=" + falvastagsag;
    }
    
    
}
