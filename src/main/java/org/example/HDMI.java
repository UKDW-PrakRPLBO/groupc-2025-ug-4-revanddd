package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwith, String merk) {
        super(harga, promisedBandwith, merk);
    }

    public double getRealBandwith() {
        if (getHarga() < 50000) {
            double persen = (double) getHarga() / (double) 50000;
            return getPromisedBandwith() * persen;
        }
        return getPromisedBandwith();
    }
}
