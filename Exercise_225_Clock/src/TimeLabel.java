
import java.time.LocalTime;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vizug
 */
public class TimeLabel extends JLabel implements Runnable {

    private LocalTime time;

    public TimeLabel(LocalTime time) {
        this.time = time;
    }
    
    
    
    @Override
    public void run() {
        
    }
    
}
