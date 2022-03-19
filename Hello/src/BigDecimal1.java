import java.math.BigDecimal;
public class BigDecimal1 {

	public static void main(String[] args) {
		double x = 1.45;
		double y = 2.55;
		BigDecimal d1 = new BigDecimal("1.05");//with out semicolons it will shows huge precision with
		BigDecimal d2 = new BigDecimal("2.55");//with colons it rounded up
		System.out.println(d1.add(d2));

	}

}
