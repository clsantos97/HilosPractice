/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Carlos
 */
public class HiloContador extends Thread {

    private final AtomicBoolean ended = new AtomicBoolean(false);
    private int count = 0;
    private JLabel label;
    private JLabel labPrio;

    public HiloContador(JLabel label, JLabel labPrio, String name) {
        super(name);
        this.label = label;
        this.labPrio = labPrio;
        this.setPriority(Thread.NORM_PRIORITY);
        labPrio.setText(String.valueOf(this.getPriority()));
    }

    public void run() {
        Logger.getLogger(HiloContador.class.getName()).log(Level.INFO, super.getName() + " running.");
        for (;;) {
            if (!ended.get()) {
                try {
                    Thread.sleep(1000);
                    count++;
                    label.setText(String.valueOf(count));
                } catch (InterruptedException ex) {
                    //Logger.getLogger(HiloContador.class.getName()).log(Level.SEVERE, super.getName() + " Interrupted.", ex);
                }
            }
        }
    }

    public void setEnded(Boolean ended) {
        this.ended.set(ended);
        labPrio.setText("-");
    }

    public void setPrio(int p) {
        if (!ended.get()) {
            this.setPriority(p);
            labPrio.setText(String.valueOf(this.getPriority()));
        }

    }

    public void safeInterrupt() {
        if (!ended.get()) {
            this.setEnded(Boolean.TRUE);
            this.interrupt();
            Logger.getLogger(HiloContador.class.getName()).log(Level.INFO, super.getName() + " ended.");
            
//            try {
//                this.sleep(1);
//                this.interrupt();
//                Logger.getLogger(HiloContador.class.getName()).log(Level.INFO, super.getName() + " ended.");
//            } catch (InterruptedException ex) {
//                Logger.getLogger(HiloContador.class.getName()).log(Level.SEVERE, super.getName() + " ERROR.", ex);
//            }
        }

    }
}
