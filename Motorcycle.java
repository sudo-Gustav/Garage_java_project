public class Motorcycle extends Vehicle{
    public Motorcycle(String licensePlate, String manufactorer, String model, int year, boolean hasSidecar, int drivenKilometers) {
        super(licensePlate, manufactorer, model, year, drivenKilometers);
        this.hasSidecar=hasSidecar;
    }
    public boolean hasSidecar;


    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }



    @Override
    public int calculateService() {
        int costs=500;
        costs+=(2025-getYear())*10;

        if (hasSidecar){
            costs+=100;
        }

        return costs;
    }
}
