import com.theBestBikeShop.Bicycle;
import com.theBestBikeShop.MountainBike;

public class BikeApp {

    public static void main(String[] args){

        Bicycle bike = new Bicycle(1, 1, false);
        bike.speedUp(2);
        bike.switchLight();
        bike.applyBrake(1);
        bike.setGear(3);
        bike.currentState();

        MountainBike mBike1 = new MountainBike(1,2,false, true, true);
        MountainBike mBike2 = new MountainBike(1,2,false, false, true);

        mBike1.currentState();
        mBike2.currentState();



    }
}
