//editing
//OK, I will add the Adder and s30846 will add the Subtractor

public class Main {
    public static void main(String args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));
    }
}
