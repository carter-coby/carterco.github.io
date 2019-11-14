package familiarity.review.code.Model;
/**
 *
 * @author cobyc
 */
public class Computer{
    private String maker;
    private int ram;
    private String processor;
    private int hdd;
    
    public Computer(String maker, int ram, String processor, int hdd)
    {
        this.maker = maker;
        this.ram = ram;
        this.processor = processor;
        this.hdd = hdd;
    }
    
    public String getMaker()
    {
        return maker;
    }
    
    public void setMaker(String maker) {
        this.maker = maker;
    }
    
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
}
