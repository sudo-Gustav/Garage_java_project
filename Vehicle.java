public abstract class Vehicle {
    private String licensePlate;
    private String manufactorer;
    private String model;
    private int year;
    private int drivenKilometres;

    public Vehicle(String licensePlate, String manufactorer, String model, int year, int drivenKilometres) {
        this.licensePlate = licensePlate;
        this.manufactorer = manufactorer;
        this.model = model;
        this.year = year;
        this.drivenKilometres=drivenKilometres;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    public int getDrivenKilometres(){ return drivenKilometres; }
    public void setDrivenKilometres(int drivenKilometres){this.drivenKilometres = drivenKilometres;}

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", manufactorer='" + manufactorer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ",drivenKilometres=" + drivenKilometres +
                '}';
    }

    public abstract int calculateService();

    public void drive(int kilometres){
        drivenKilometres+=kilometres;
        System.out.println("Das Fahrzeug ist "+kilometres+" Kilometer gefahren und hat nun eine Kilometerzahl von: "+drivenKilometres);
    }

}
