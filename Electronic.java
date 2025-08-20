package Electronic;


public class Electronic {

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
     * @return the powerUsage
     */
    protected int getPowerUsage() {
        return powerUsage;
    }

    /**
     * @param powerUsage the powerUsage to set
     */
    protected void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    /**
     * @return the warranty
     */
    protected int getWarranty() {
        return warranty;
    }

    /**
     * @param warranty the warranty to set
     */
    protected void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    private String brand;
    private int powerUsage;
    private int warranty;
    
    
}
