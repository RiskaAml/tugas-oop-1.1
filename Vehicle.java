public class Vehicle {

    /**
     * @return the brand
     */
    protected String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    protected void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    protected String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    protected void setModel(String model) {
        this.model = model;
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

    /**
     * @return the fuelType
     */
    protected String getFuelType() {
        return fuelType;
    }

    /**
     * @param fuelType the fuelType to set
     */
    protected void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    private String brand;
    private String model;
    private int year;
    private String fuelType;
}
