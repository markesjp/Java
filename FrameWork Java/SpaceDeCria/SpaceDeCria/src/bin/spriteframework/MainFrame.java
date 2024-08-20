//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package bin.spriteframework;

import java.awt.Component;
import javax.swing.JFrame;

public abstract class MainFrame extends JFrame {
    protected abstract AbstractBoard createBoard();

    public MainFrame(String t) {
        this.add(this.createBoard());
        this.setTitle(t);
        this.setSize(358, 350);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setLocationRelativeTo((Component)null);
        this.setVisible(true);
    }
}
