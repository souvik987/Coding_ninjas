package Oops;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(20,30);
        f1.print();
        
        f1.setNumerator(12);
        int d = f1.getDenominator();
        System.out.println(d);
        f1.print();

        f1.setNumerator(10);
        try{
            f1.setDinominator(0);
        } catch(ZeroDominatorExceptions e){
           System.out.println("Hey do not input 0 as denominator");
        }
        f1.print();

        Fraction f2 = new Fraction(3, 4);
        f1.add(f2);
        f1.print();
        f2.print();

        Fraction f3 = new Fraction(4, 5);
        f1.multiply(f3);
        f1.print();
        f3.print();
    }
}
