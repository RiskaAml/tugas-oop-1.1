
package Building;

public class SmartHouse extends House{

    /**
     * @return the hasSmartLighting
     */
    protected boolean isHasSmartLighting() {
        return hasSmartLighting;
    }

    /**
     * @param hasSmartLighting the hasSmartLighting to set
     */
    protected void setHasSmartLighting(boolean hasSmartLighting) {
        this.hasSmartLighting = hasSmartLighting;
    }

    /**
     * @return the hasSecuritySystem
     */
    protected boolean isHasSecuritySystem() {
        return hasSecuritySystem;
    }

    /**
     * @param hasSecuritySystem the hasSecuritySystem to set
     */
    protected void setHasSecuritySystem(boolean hasSecuritySystem) {
        this.hasSecuritySystem = hasSecuritySystem;
    }

    /**
     * @return the energyEfficiency
     */
    protected String getEnergyEfficiency() {
        return energyEfficiency;
    }

    /**
     * @param energyEfficiency the energyEfficiency to set
     */
    protected void setEnergyEfficiency(String energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }
    private boolean hasSmartLighting;
    private boolean hasSecuritySystem;
    private String energyEfficiency;
    
    public static void main(String[] args){
        SmartHouse myHouse = new SmartHouse();
        myHouse.setAddress("Jl. Raya Surabaya No. 21");
        myHouse.setFloors(2);
        myHouse.setYear(2023);
        
        myHouse.setBedrooms(4);
        myHouse.setBathrooms(3);
        myHouse.setHasGarage(true);
        
        myHouse.setHasSmartLighting(true);
        myHouse.setHasSecuritySystem(true);
        myHouse.setEnergyEfficiency("A+");
        
        System.out.println("Address: " + myHouse.getAddress());
        System.out.println("Floors: " + myHouse.getFloors());
        System.out.println("Year Build: " + myHouse.getYear());
        System.out.println("Bedrooms: " + myHouse.getBedrooms());
        System.out.println("Bathrooms: " + myHouse.getBathrooms());
        System.out.println("Garage: " + (myHouse.isHasGarage() ? "Available" : "Not Available"));
        System.out.println("Smart Lighting: " +  (myHouse.isHasSmartLighting() ? "Yes" : "No"));
        System.out.println("Security System: " + (myHouse.isHasSecuritySystem() ? "Installed" : "Not Installed"));
        System.out.println("Energy Efficiency: " + myHouse.getEnergyEfficiency());
        
        
        
    }
}
       
