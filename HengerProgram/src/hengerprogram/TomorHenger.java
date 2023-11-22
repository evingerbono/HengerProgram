package hengerprogram;

public class TomorHenger extends Henger{
    private double fajsuly;
    
    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
        
    }
    
    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        
        return 1;
    }
    
}
