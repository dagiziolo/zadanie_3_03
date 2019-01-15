class Calculator {

    boolean inEven(int a) {
        return a%2 == 0;
    }

    boolean inOdd(int a) {
        return !inEven(a);
    }

//    boolean inOdd(int a) {
//        boolean isOdd = a%2 ==1;
//        return isOdd;
//    }

    double circleField(double r) {
        double field = Math.PI * Math.pow(r,2); //można też r*r, ale szukając jak pobrać PI znalazłam bibliotekę matematyczną
        return field;
    }

    double power(int a) {
        double pow1 = Math.pow(a,2); // or a*a
        return pow1;
    }

}