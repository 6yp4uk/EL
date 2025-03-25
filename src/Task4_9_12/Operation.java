package Task4_9_12;

public interface Operation {
    double getResult (double a, double b);
}


class Adder implements Operation {

    @Override

    public double getResult(double a, double b) {

        return a + b;

    }

}

class Subtractor implements Operation {

    @Override

    public double getResult(double a, double b) {

        return a - b;

    }

}


class Divider implements Operation {

    @Override

    public double getResult(double a, double b) {

        return a/b;

    }

}

class Multiplier implements Operation {

    @Override

    public double getResult(double a, double b) {

        return a*b;

    }

}