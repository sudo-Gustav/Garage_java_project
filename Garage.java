import java.util.ArrayList;

public class Garage {
    ArrayList<Vehicle> Vehicles= new ArrayList<>();
    public boolean addVehicle(Vehicle v){
        if (getVehicle(v.getLicensePlate()) == null) {
            Vehicles.add(v);
            return true;
        }
        return false;
    }
    public boolean removeVehicle(Vehicle v){
        if (getVehicle(v.getLicensePlate()) != null) {
            Vehicles.remove(v);
            return true;
        }
        return false;
    }
    public Vehicle getVehicle(String licensePlate){
        for(Vehicle v : Vehicles){
            if (v.getLicensePlate().equals(licensePlate)){
                return v;
            }
        }
        return null;
    }
    public int numberOfVehicles(){
        return Vehicles.size();
    }
    public int calculateService(){
        int totalCost = 0;
        for (Vehicle v : Vehicles){
            totalCost+=v.calculateService();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "Vehicles=" + Vehicles +
                '}';
    }
}
