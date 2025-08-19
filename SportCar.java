public class SportCar extends Car{

    /**
     * @return the horsePower
     */
    protected int getHorsePower() {
        return horsePower;
    }

    /**
     * @param horsePower the horsePower to set
     */
    protected void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    /**
     * @return the topSpeed
     */
    protected int getTopSpeed() {
        return topSpeed;
    }

    /**
     * @param topSpeed the topSpeed to set
     */
    protected void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    /**
     * @return the zeroToHundred
     */
    protected float getZeroToHundred() {
        return zeroToHundred;
    }

    /**
     * @param zeroToHundred the zeroToHundred to set
     */
    protected void setZeroToHundred(float zeroToHundred) {
        this.zeroToHundred = zeroToHundred;
    }
    private int horsePower;
    private int topSpeed;
    private float zeroToHundred;
    
    //output
    public static void main(String[] args) {
        SportCar ferrari = new SportCar();
        
        // dari vehicle
        ferrari.setBrand("Ferrari");
        ferrari.setModel("F8 Tributo");
        ferrari.setYear(2025);
        ferrari.setFuelType("Petrol");
        
        // dari car
        ferrari.setDoors(2);
        ferrari.setSeats(2);
        ferrari.setTransmission("Automatic Dual-Clutch");
        
        //dari sport car
        ferrari.setHorsePower(710);
        ferrari.setTopSpeed(340);
        ferrari.setZeroToHundred(2.9f);
        
        //print
        System.out.println("=== SPORT CAR ===");
        System.out.println("Brand: " + ferrari.getBrand());
        System.out.println("Model: " + ferrari.getModel());
        System.out.println("Year: " + ferrari.getYear());
        System.out.println("Fuel: " + ferrari.getFuelType());
        System.out.println("Doors: " + ferrari.getDoors());
        System.out.println("Seats: " + ferrari.getSeats());
        System.out.println("Transmission: " + ferrari.getTransmission());
        System.out.println("Horse Power: " + ferrari.getHorsePower() + " HP");
        System.out.println("Top Speed: " + ferrari.getTopSpeed()+ " km/h");
        System.out.println("0-100 km/h: " + ferrari.getZeroToHundred()+ " seconds");
        
    }
    
}
