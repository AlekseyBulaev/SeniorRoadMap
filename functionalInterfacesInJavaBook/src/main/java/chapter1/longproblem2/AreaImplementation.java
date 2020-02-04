package chapter1.longproblem2;

public class AreaImplementation {

    Area circle = new Area() {
        @Override
        public double compute(Integer... r) {
            return 2 * Math.PI * (Math.pow(r[0], 2));
        }

        @Override
        public int numberOfSides() {
            return 1;
        }
    };

    Area rectangle = new Area() {
        @Override
        public double compute(Integer... arg) {
            return Math.multiplyExact(arg[0], arg[1]);
        }
    };

    Area isoscelesRightTriangle = new Area() {
        @Override
        public double compute(Integer... arg) {
            return Math.pow(arg[0], 2) / 2;
        }

        @Override
        public int numberOfSides() {
            return 3;
        }
    };
}
