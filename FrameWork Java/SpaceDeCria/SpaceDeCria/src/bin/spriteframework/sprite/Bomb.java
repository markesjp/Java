package bin.spriteframework.sprite;

import javax.swing.ImageIcon;

public class Bomb extends BadSprite {

    private boolean destroyed;

    public Bomb(int x, int y) {

        initBomb(x, y);
    }

    private void initBomb(int x, int y) {

        setDestroyed(true);

        this.x = x;
        this.y = y;

        String bombImg = "/bin/images/bomb.png";
        ImageIcon ii = new ImageIcon(this.getClass().getResource(bombImg));
        setImage(ii.getImage());
    }

    public void setDestroyed(boolean destroyed) {

        this.destroyed = destroyed;
    }

    public boolean isDestroyed() {

        return destroyed;
    }


}
