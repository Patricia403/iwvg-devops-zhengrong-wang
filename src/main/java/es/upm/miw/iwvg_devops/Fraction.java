package es.upm.miw.iwvg_devops;

public class Fraction {

    private int numerator;
    private int denominator;
    public double decimal = numerator / denominator;


    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 2);
        }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //public void decimal(){ this.decimal = numerator / denominator;}

    public double getDecimal(){ return decimal;}

    public boolean isNegativeSign(double decimal){
        if (decimal < 0){
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public static boolean isProper(int numerator, int denominator) {
        if(numerator > denominator){
            return false;
        }else return true;
    }

    public boolean isImproper(int numerator, int denominator) {
        if(numerator < denominator){
            return false;
        }else return true;
    }

    public boolean isEquivalent(int numerator,int denominator) {
        if(numerator == denominator){
            return true;
        }else return false;
    }

    public Fraction add(Fraction fraction){
        int newNumerator = numerator * fraction.getDenominator() + denominator * fraction.getNumerator();
        int newDenominator = denominator * fraction.getDenominator();
        Fraction newFraction = new Fraction(newNumerator,newDenominator);
        return newFraction;
    }

    public Fraction multiply(Fraction fraction){
        int newNumerator = numerator * fraction.getNumerator();
        int newDenominator = denominator * fraction.getDenominator();
        Fraction newFraction = new Fraction(newNumerator,newDenominator);
        return newFraction;
    }

    public Fraction divide(Fraction fraction){
        int newNumerator = numerator * fraction.getDenominator();
        int newDenominator = denominator * fraction.getNumerator();
        Fraction newFraction = new Fraction(newNumerator,newDenominator);
        return newFraction;
    }

}
