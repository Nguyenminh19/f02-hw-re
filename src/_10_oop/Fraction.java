package _10_oop;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }


    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator == 0 ? 1 : denominator;
    }

    public void simplify() {
        int gcd = greatestCommonDivisor(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction add(Fraction f) {
        Fraction rs = new Fraction();
        rs.numerator = this.numerator * f.denominator + f.numerator * this.denominator;
        rs.denominator = f.denominator * this.denominator;
        rs.simplify();
        return rs;
    }

    public Fraction subtract(Fraction f) {
        Fraction rs = new Fraction();
        rs.numerator = this.numerator * f.denominator - f.numerator * this.denominator;
        rs.denominator = this.denominator * f.denominator;
        rs.simplify();
        return rs;
    }

    public Fraction multiply(Fraction f) {
        Fraction rs = new Fraction();
        rs.numerator = this.numerator * f.numerator;
        rs.denominator = this.denominator * f.denominator;
        rs.simplify();
        return rs;
    }

    public Fraction divide(Fraction f) {
        Fraction rs = new Fraction();
        rs.numerator = this.numerator * f.denominator;
        rs.denominator = this.denominator * f.numerator;
        rs.simplify();
        return rs;
    }

    private int greatestCommonDivisor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(2, 5);
        System.out.println("Before simplify");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println("After simplify");
        f1.simplify();
        f2.simplify();
        System.out.println(f1);
        System.out.println(f2);
        Fraction f3 = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + f3);
        Fraction f4 = f1.subtract(f2);
        System.out.println(f1 + " - " + f2 + " = " + f4);
        Fraction f5 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + f5);
        Fraction f6 = f1.divide(f2);
        System.out.println(f1 + " / " + f2 + " = " + f6);
    }
}
