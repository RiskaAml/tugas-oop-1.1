package Building;

public class House extends Building{

    /**
     * @return the bedrooms
     */
    protected int getBedrooms() {
        return bedrooms;
    }

    /**
     * @param bedrooms the bedrooms to set
     */
    protected void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * @return the bathrooms
     */
    protected int getBathrooms() {
        return bathrooms;
    }

    /**
     * @param bathrooms the bathrooms to set
     */
    protected void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    /**
     * @return the hasGarage
     */
    protected boolean isHasGarage() {
        return hasGarage;
    }

    /**
     * @param hasGarage the hasGarage to set
     */
    protected void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }
    private int bedrooms;
    private int bathrooms;
    private boolean hasGarage;
    
}
