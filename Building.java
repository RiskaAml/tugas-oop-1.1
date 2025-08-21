
package Building;

public class Building {

    /**
     * @return the address
     */
    protected String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    protected void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the floor
     */
    protected int getFloors() {
        return floors;
    }

    /**
     * @param floor the floor to set
     */
    protected void setFloors(int floors) {
        this.floors = floors;
    }

    /**
     * @return the year
     */
    protected int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    protected void setYear(int year) {
        this.year = year;
    }
    private String address;
    private int floors;
    private int year;
    
}
