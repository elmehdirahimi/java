package partie2;
import java.math.BigInteger;

public class Fraction {
	 private BigInteger num;
	    private BigInteger den;

	    public Fraction(BigInteger num, BigInteger den) {
	        this.num = num;
	        this.den = den;
	    }

	    public Fraction(int n, int d) {
	        this.num = BigInteger.valueOf(n);
	        this.den = BigInteger.valueOf(d);
	    }

	    public Fraction(int num) {
	        this.num = BigInteger.valueOf(num);
	        this.den = BigInteger.valueOf(1);
	    }

	    public Fraction add(Fraction frac) {
	        return new Fraction(
	                (num.multiply(frac.den)).add(den.multiply(frac.num)),
	                den.multiply(frac.den));
	    }

	    public Fraction sub(Fraction frac) {
	        return new Fraction(
	                (num.multiply(frac.den)).subtract(den.multiply(frac.num)),
	                den.multiply(frac.den));
	    }

	    public Fraction mult(Fraction f) {
	        return new Fraction(
	                num.multiply(f.num),
	                den.multiply(f.den));
	    }

	    public Fraction divi(Fraction frac) {
	        return new Fraction(num.multiply(frac.den), 
	        		den.multiply(frac.num));
	    }

		@Override
		public String toString() {
			return "Fraction [num=" + num + ", den=" + den + "]";
		}
		
	  public double value() {
	        return num.doubleValue() / den.doubleValue();
	    }

}
