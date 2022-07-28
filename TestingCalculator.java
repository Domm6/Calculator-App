import javax.print.attribute.SupportedValuesAttribute;

public class TestingCalculator {
    public static void main(String[] args) {
        BasicCalculator basicCalc = new BasicCalculator();
        ScientificCalculator scientificCalc = new ScientificCalculator();
        TrigonometricCalculator trigCalc = new TrigonometricCalculator();

        System.out.println("Some math equations are goign to be performed below!\n");
        
        System.out.println("5 + 7 = " + basicCalc.Add(5, 7));
        System.out.println("20 * 8 = " + basicCalc.multiply(20, 8));
        System.out.println("Remainder of 100 / 17 = " + basicCalc.modulo(100, 17) + "\n");

        System.out.println("e^25 = " + scientificCalc.Exp(25));
        System.out.println("log(23) = " + scientificCalc.Log(23) + "\n");

        System.out.println("sin(10) = " + trigCalc.Sine(10));
        System.out.println("arctan(157) = " + trigCalc.Arctangent(157) + "\n");

    }
}
