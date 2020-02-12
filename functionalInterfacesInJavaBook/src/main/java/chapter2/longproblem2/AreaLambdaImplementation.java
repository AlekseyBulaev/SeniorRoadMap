package chapter2.longproblem2;

public class AreaLambdaImplementation {
    AreaLambda circle = x -> 2 * Math.PI * (Math.pow(x[0], 2));
    AreaLambda rectangle = x -> Math.multiplyExact(x[0], x[1]);
    AreaLambda isoscelesRightTriangle = x -> Math.pow(x[0], 2) / 2;;
}
