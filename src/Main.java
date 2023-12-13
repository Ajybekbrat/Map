import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)  {
        DataBAse dataBAse = new DataBAse();
        Car car = new Car(1,03333);
           Car car1 = new  Car(2, 07777);
        Car car2 =  new Car(3, 04444);
        Car car3 =  new Car(4,06666);
        Car car4 =  new Car(5, 02222);
        ServiceCar serviceCar = new ServiceCar(2002, "Avensis", "white", 6000);
        ServiceCar serviceCar2 = new ServiceCar(2010, "priora", "white", 4500);
        ServiceCar serviceCar3 = new ServiceCar(2013, "lada2107", "yellow", 4000);
        ServiceCar serviceCar4 = new ServiceCar(2022, "zeekr", "black", 54000);
        ServiceCar serviceCar5 = new ServiceCar(2002, "w210", "white", 30000);
        dataBAse.cars.put(car , String.valueOf(serviceCar));
        dataBAse.cars.put(car1 , String.valueOf(serviceCar2));
        dataBAse.cars.put(car2 , String.valueOf(serviceCar3));
        dataBAse.cars.put(car3 , String.valueOf(serviceCar4));
        dataBAse.cars.put(car4 , String.valueOf(serviceCar5));

        System.out.println( dataBAse.cars.entrySet());

//
    }

}
