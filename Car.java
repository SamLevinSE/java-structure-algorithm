package se.esmoa;
import java.awt.*;


public class Car {

    // variables / attributes
    int averageMailsPerGallon;
    String licencePlate;
    Color paintColor;
    boolean areTailingWorking;

    // constructor or init method
    public Car(int inputAverageMPG,
               String inputLicencePlate,
               Color inputPaintColor,
               boolean inputAreTailingWorking) {
        this.averageMailsPerGallon = inputAverageMPG;
        this.licencePlate = inputLicencePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTailingWorking;
    }

    // a function / method
    public void changePaintColor(Color newPaintColor){ this.paintColor = newPaintColor;}

    // a function with some arguments
    public static int speedingUp(int currentSpeed, int increaseBy){
        return currentSpeed + increaseBy;
    }


}
