public class Car extends Vehicle{

    /**
     * @return the doors
     */
    protected int getDoors() {
        return doors;
    }

    /**
     * @param doors the doors to set
     */
    protected void setDoors(int doors) {
        this.doors = doors;
    }

    /**
     * @return the seats
     */
    protected int getSeats() {
        return seats;
    }

    /**
     * @param seats the seats to set
     */
    protected void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     * @return the transmission
     */
    protected String getTransmission() {
        return transmission;
    }

    /**
     * @param transmission the transmission to set
     */
    protected void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    private int doors;
    private int seats;
    private String transmission;
    
}
