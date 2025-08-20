package Electronic;
public class Laptop extends Electronic {

    /**
     * @return the cpu
     */
    protected String getCpu() {
        return cpu;
    }

    /**
     * @param cpu the cpu to set
     */
    protected void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * @return the ramSize
     */
    protected int getRamSize() {
        return ramSize;
    }

    /**
     * @param ramSize the ramSize to set
     */
    protected void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    /**
     * @return the storage
     */
    protected int getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    protected void setStorage(int storage) {
        this.storage = storage;
    }
    private String cpu;
    private int ramSize;
    private int storage;
    
}
