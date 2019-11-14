package familiarity.review.code.View;
/**
 *
 * @author cobyc
 */
public class ComputerView{
    public void printComputerInfo(String model, int ram, String processor, int hdd)
    {
        System.out.println("Model: " + model);
        System.out.println("RAM Amount (in GB): " + ram);
        System.out.println("Processor Type: " + processor);
        System.out.println("Hard Drive Capacity (in GB): " + hdd);
        System.out.println("");
    }
}
