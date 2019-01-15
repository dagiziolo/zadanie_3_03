class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        boolean even1 = calculator.inEven(1);
        System.out.println(even1);

        boolean odd1 = calculator.inOdd(23);
        System.out.println(odd1);

        double field1 = calculator.circleField(1.5);
        System.out.println(field1);

        double pow1 = calculator.power(77);
        System.out.println(pow1);


    }


}
