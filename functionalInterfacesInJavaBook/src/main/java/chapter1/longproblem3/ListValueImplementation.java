package chapter1.longproblem3;

public class ListValueImplementation {
    ListValue<Car> sportsCar = new ListValue<Car>() {
        @Override
        public int compute(Car car) {
            return car.cost + (getPresentYear() - car.manufactureYear) * 250;
        }
    };

    ListValue<Car> averageCar = new ListValue<Car>() {
        @Override
        public int compute(Car car) {
            return car.cost - (getPresentYear() - car.manufactureYear) * 1000 - (car.mileage / 10_000) * 500;
        }
    };
}
