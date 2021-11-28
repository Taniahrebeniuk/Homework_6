package task_1;


public class FractionNumber {

    private int num;
    private int den;


    public FractionNumber(int numerator, int denominator) {
        num = numerator;
        den = denominator;
    }

    public FractionNumber multiply(FractionNumber other) {
        return new FractionNumber(this.num * other.num, this.den * other.den);

    }

    public FractionNumber divide(FractionNumber other) {
        return new FractionNumber(this.num * other.den, this.den * other.num);
    }
    public FractionNumber minus(FractionNumber other) {
        int newNumerator = (num * den) - (other.num * den);
        int newDenominator = den * other.den;
        FractionNumber result = new FractionNumber(newNumerator, newDenominator);
        return result;
    }

    public FractionNumber plus(FractionNumber other) {
        int number = num * other.den + other.num * den;
        int newden = den * other.den;
        return new FractionNumber(number, newden);

}
        public String toString () {
            return num + "/" + den;
        }
    }
