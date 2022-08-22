import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        System.out.println(sqrt().apply(59.123));
    }

    public static UnaryOperator<Double> sqrt(){

       UnaryOperator<Double> sqrt = (x) -> Math.sqrt(x);

       return sqrt;
    }
}