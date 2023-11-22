
package hengerprogram;

public class LyukasHenger extends TomorHenger{
    private double falvastagsag;
    
    public LyukasHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag, fajsuly);
        
    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag=falvastagsag;
    }
    
    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    public double terfogat() {
        
        return 1;
    }
}
