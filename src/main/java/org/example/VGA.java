package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwith, String merk) {
        super(harga, promisedBandwith, merk);
    }

    @Override
    public double getRealBandwith() {
        if (getHarga() < 30000) {
            double persen = (double)getHarga() / (double)30000;
            return getPromisedBandwith() * persen;
        }
        return getPromisedBandwith();
    }
}
