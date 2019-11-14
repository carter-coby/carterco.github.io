/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity.review.code.Control;
import familiarity.review.code.Model.Computer;
import familiarity.review.code.View.ComputerView;
/**
 *
 * @author cobyc
 */
public class ComputerControl {
    private Computer model;
    private ComputerView view;
    
    public ComputerControl(Computer model, ComputerView view)
    {
        this.model = model;
        this.view = view;
    }
    
    public void setComputerMaker(String maker)
    {
        model.setMaker(maker);
    }
    
    public String getComputerMaker()
    {
        return model.getMaker();
    }
    
    public void setComputerRam(int ram)
    {
        model.setRam(ram);
    }
    
    public int getComputerRam()
    {
        return model.getRam();
    }
    
    public void setComputerProcessor(String processor)
    {
        model.setProcessor(processor);
    }
    
    public String getComputerProcessor()
    {
        return model.getMaker();
    }
    
    public void setComputerHdd(int hdd)
    {
        model.setHdd(hdd);
    }
    
    public int getComputerHdd()
    {
        return model.getHdd();
    }
    
    public void updateView()
    {
        view.printComputerInfo(model.getMaker(), model.getRam(), model.getProcessor(), model.getHdd());
    }
}
