package truckingCompany;

import org.junit.jupiter.api.Test;

public class Company {
    @Test
    public void usingObject() {
        Car mercedes = new Car();
        mercedes.setCarBrand("Mercedes");
        mercedes.setCarModel("Sprinter");


        Car wolksvagen = new Car();
        wolksvagen.setCarBrand("Volkswagen");
        wolksvagen.setCarModel("Crafter");

        Car ford = new Car();
        ford.setCarBrand("Ford");
        ford.setCarModel("Transit");

        System.out.println(mercedes.getCarBrand() + " " + mercedes.getCarModel());
        System.out.println(wolksvagen.getCarBrand() + " " + wolksvagen.getCarModel());
        System.out.println(ford.getCarBrand() + " " + ford.getCarModel());

        Trains paravozik = new Trains();
        paravozik.setTrainType("Paravozik");
        paravozik.setTrainName("Thomas");

        Trains lokomotiv = new Trains();
        lokomotiv.setTrainType("Lokomotiv");
        lokomotiv.setTrainName("Alosha");

        System.out.println(paravozik.getTrainType() + " " + paravozik.getTrainName());
        System.out.println(lokomotiv.getTrainType() + " " + lokomotiv.getTrainName());
    }
}


