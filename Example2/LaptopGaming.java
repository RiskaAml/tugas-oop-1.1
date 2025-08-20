
package Electronic;

public class LaptopGaming extends Laptop{

    /**
     * @return the gpu
     */
    protected String getGpu() {
        return gpu;
    }

    /**
     * @param gpu the gpu to set
     */
    protected void setGpu(String gpu) {
        this.gpu = gpu;
    }

    /**
     * @return the coolingSystem
     */
    protected boolean isCoolingSystem() {
        return coolingSystem;
    }

    /**
     * @param coolingSystem the coolingSystem to set
     */
    protected void setCoolingSystem(boolean coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    /**
     * @return the rgbKeyboard
     */
    protected boolean isRgbKeyboard() {
        return rgbKeyboard;
    }

    /**
     * @param rgbKeyboard the rgbKeyboard to set
     */
    protected void setRgbKeyboard(boolean rgbKeyboard) {
        this.rgbKeyboard = rgbKeyboard;
    }
    private String gpu;
    private boolean coolingSystem;
    private boolean rgbKeyboard;
    public static void main(String[]args){
        LaptopGaming predator = new LaptopGaming();
        predator.setBrand("Acer Predator");
        predator.setPowerUsage(280);
        predator.setWarranty(3);
        
        predator.setCpu("Intel Core i9-13950HX");
        predator.setRamSize(32);
        predator.setStorage(1000);
        
        predator.setGpu("NVIDIA GeForce RTX 4080");
        predator.setCoolingSystem(true);
        predator.setRgbKeyboard(true);
        
        System.out.println("=== GAMING LAPTOP ===");
        System.out.println("Brand: " + predator.getBrand());
        System.out.println("Power Usage: " + predator.getPowerUsage() + " W");
        System.out.println("Warranty: " + predator.getWarranty()+ " years");
        
        System.out.println("CPU: " + predator.getCpu());
        System.out.println("RAM: " + predator.getRamSize() + "GB");
        System.out.println("Storage: " + predator.getStorage() + "GB");
        
        System.out.println("GPU: " + predator.getGpu());
        System.out.println("Cooling System: " + (predator.isCoolingSystem()? "Available" : "Not"));
        System.out.println("RGB Keyboard: " + (predator.isRgbKeyboard() ? "yes" : "NO"));
    }
    
}
