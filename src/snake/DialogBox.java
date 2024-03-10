/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KHK
 */
public class DialogBox extends WindowAdapter{

    int score = 0;
    Window f;

    public DialogBox(Window w) {
        f = w;
        f.addWindowListener(this);
//        f.setSize(300, 300);
//        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        f.setVisible(true);
    }

    public Boolean Dialog() {
        int a = JOptionPane.showConfirmDialog(f, "Your Score : " + score +"\nDo you want to continue?", "Defeat", JOptionPane.YES_NO_OPTION);
        if(a == JOptionPane.YES_OPTION){
            return false;
        }else{
//            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
            return true;
        }
    }

    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f, "Are you sure?","Exit",JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else if (a == JOptionPane.NO_OPTION) {
           f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    public void setScore(int score) {
        this.score += score;
    }

}
