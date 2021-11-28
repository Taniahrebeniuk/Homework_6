package task_1;

public class App {
    public static void main(String[] args) {
        App app = new App ();
        app.test();
    }



    public void test() {
        FractionNumber fractionNumber1 = new FractionNumber(3,4);
        FractionNumber fractionNumber2 = new FractionNumber(5,6);
        FractionNumber a = fractionNumber1.multiply(fractionNumber2);
        System.out.println(a.toString());

        FractionNumber b = fractionNumber1.divide(fractionNumber2);
        System.out.println(b.toString());

        FractionNumber c = fractionNumber1.minus(fractionNumber2);
        System.out.println(c.toString());

        FractionNumber d = fractionNumber1.plus(fractionNumber2);
        System.out.println(d.toString());

    }

}
