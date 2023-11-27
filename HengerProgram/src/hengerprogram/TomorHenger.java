package hengerprogram;

public class TomorHenger extends Henger{
    private double fajsuly;
    
    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
        
    }
    
    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        
        return fajsuly;
    }
    
    public double terfogat() {
        
        return super.terfogat()*suly();
    }

    @Override
    public String toString() {
        return super.toString()+"fajsuly=" + fajsuly;
    }
    
    
}
