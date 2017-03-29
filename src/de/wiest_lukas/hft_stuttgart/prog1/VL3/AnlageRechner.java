package de.wiest_lukas.hft_stuttgart.prog1.VL3;

import java.util.Scanner;

public class AnlageRechner
{
    // global vars
    static final int LAUFZEIT = 6;
    static final int MIN_EINLAGE = 250000;  // in Cent
    static final double[] ZINSSAETZE = new double[] {0.5d, 0.6d, 0.7d, 0.9d, 1.3d, 1.8d};

    public static void main(String[] args)
    {
        // vars
        double fund = 0;
        Scanner in = new Scanner(System.in);

        getFund:
        do
        {
            try
            {
                System.out.println("Please insert fund. Minimum: 2500 EUR");
                fund = in.nextDouble();
                in.nextLine();          // catch flying enter
            }
            catch (Exception e)
            {
                System.out.println("That's not a valid fund, please re-enter program");
                continue getFund;
            }

            fund *= (double) 100;       // make the entered fund a Cent value

            if (fund < MIN_EINLAGE)
            {
                System.out.println("you have to insert a fund higher or atleast 2500 EUR!");
            }
            else
            {
                break getFund;
            }
        } while (true);
    }

    public static double calculateInterest(double fund, double rate)
    {
        fund += fund * rate / (double) 100;
        return fund;
    }
}
