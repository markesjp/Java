package bin.spriteframework.sprite;

import javax.swing.ImageIcon;


public class Shot extends BadSprite {

    public Shot() {
    }

    public Shot(int x, int y) {

        initShot(x, y);
    }

    private void initShot(int x, int y) {

        String shotImg = "/bin/images/shot.png";
        ImageIcon ii = new ImageIcon(this.getClass().getResource(shotImg));
        setImage(ii.getImage());

        int H_SPACE = 6;
        setX(x + H_SPACE);

        int V_SPACE = 1;
        setY(y - V_SPACE);
    }
}
