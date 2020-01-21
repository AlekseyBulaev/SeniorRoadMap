package chapter1.longproblem2;

public class AreaImplementation {

    Area circle = new Area() {
        @Override
        public int compute() {
            return 0;
        }

        @Override
        public int numberOfSides() {
            return 1;
        }
    };

    Area rectangle = new Area() {
        @Override
        public int compute() {
            return 0;
        }

        @Override
        public int numberOfSides() {
            return 4;
        }
    };
}
