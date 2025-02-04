public class Car extends Vehicle{
    public Car(String licensePlate, String manufactorer, String model, int year, boolean isAWD, int numberOfAxles, int drivenKilometers) {
        super(licensePlate, manufactorer, model, year, drivenKilometers);
        this.isAWD=isAWD;
        this.numberOfAxles=numberOfAxles;
    }



    private boolean isAWD;
    private int numberOfAxles;

    @Override
    public int calculateService() {
        int costs=500;
        costs+=(2025-getYear())*10;
        if (numberOfAxles>2){
            int i=numberOfAxles;
            i-=2;
            costs+=i*150;
        }
        if (isAWD){
            costs+=80;
        }
        return costs;
    }
}
