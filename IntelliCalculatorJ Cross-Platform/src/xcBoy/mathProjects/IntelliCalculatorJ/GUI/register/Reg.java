/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcBoy.mathProjects.IntelliCalculatorJ.GUI.register;

/**
 *
 * @author zengchen
 */
import java.util.Random;
public class Reg {
    public Reg(){
        randomCode = Math.abs(random.nextInt());
    }
    
    Random random = new Random();
    int randomCode = 0;
    
    public int getRandomCode(){
        return randomCode;
    }
    
    public int reGetRandomCode(){
        randomCode = Math.abs(random.nextInt());
        return randomCode;
    }
    
    public boolean confirm(int confirmCode) {
        if (this.randomCode + confirmCode == 990609)
            return true;
        else
            return false;
    }
}
