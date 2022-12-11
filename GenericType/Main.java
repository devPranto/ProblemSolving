package GenericType;
public class Main{
    public static void main(String[] args) {
        GenericPrinter<Double> numbers = new GenericPrinter<>();
        numbers.genPrinter("num");
    }
}