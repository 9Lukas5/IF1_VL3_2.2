package de.wiest_lukas.hft_stuttgart.prog1.VL3;

public class AnlageRechner
{
    // global vars
    static final int LAUFZEIT = 6;
    static final int MIN_EINLAGE = 250000;  // in Cent
    static final double[] ZINSSAETZE = new double[] {0.5d, 0.6d, 0.7d, 0.9d, 1.3d, 1.8d};

    public static void main(String[] args)
    {
        System.out.println(calculateInterest(1000, 5));
    }

    public static double calculateInterest(double fund, double rate)
    {
        fund += fund * rate / (double) 100;
        return fund;
    }
}
