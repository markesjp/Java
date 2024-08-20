package bin.spriteframework.sprite;

import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

import static bin.spriteframework.Commons.*;

public class Player extends Sprite {
    private int width;
    private int height;

    public Player() {
        loadImage();
        getImageDimensions();
        resetState();
    }

    protected void loadImage() {
        ImageIcon ii = new ImageIcon(this.getClass().getResource("/bin/images/player.png"));
        width = ii.getImage().getWidth((ImageObserver)null);
        height = ii.getImage().getHeight((ImageObserver)null);
        setImage(ii.getImage());
    }

    public void act() {
        x += dx;
        if (x <= 2) {
            x = 2;
        }

        if (x >= BOARD_WIDTH - 2 * width) {
            x = BOARD_WIDTH - 2 * width;
        }

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

    private void resetState() {
        setX(INIT_PLAYER_X);
        setY(INIT_PLAYER_Y);
    }
}
