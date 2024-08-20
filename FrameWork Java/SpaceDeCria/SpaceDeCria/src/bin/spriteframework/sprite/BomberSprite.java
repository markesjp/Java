package bin.spriteframework.sprite;

import java.util.LinkedList;

import javax.swing.ImageIcon;

public class BomberSprite extends BadnessBoxSprite {

    private Bomb bomb;

    public BomberSprite(int x, int y) {

        initBomber(x, y);
    }

    private void initBomber(int x, int y) {

        this.x = x;
        this.y = y;

        bomb = new Bomb(x, y);

        String alienImg = "/bin/images/alien.png";
        ImageIcon ii = new ImageIcon(this.getClass().getResource(alienImg));

        setImage(ii.getImage());
    }



    public Bomb getBomb() {

        return bomb;
    }


    @Override
    public LinkedList<BadSprite> getBadnesses() {
        LinkedList<BadSprite> aBomb = new LinkedList<BadSprite>();
        aBomb.add(bomb);
        return aBomb;
    }
}
