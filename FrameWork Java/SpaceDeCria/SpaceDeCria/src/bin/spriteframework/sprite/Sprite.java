//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package bin.spriteframework.sprite;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

public class Sprite {
    private boolean visible = true;
    protected Image image;
    private boolean dying;
    protected int x;
    protected int y;
    protected int imageWidth;
    protected int imageHeight;
    protected int dx;

    protected int dy;

    public Sprite() {
    }

    public void die() {
        this.visible = false;
    }

    public boolean isVisible() {
        return this.visible;
    }

    protected void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return this.image;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }
    public int getX() {
        return this.x;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public Rectangle getRect() {
        return new Rectangle(this.x, this.y, this.image.getWidth(null), this.image.getHeight(null));
    }

    public void getImageDimensions() {
        this.imageWidth = this.image.getWidth(null);
        this.imageHeight = this.image.getHeight(null);
    }

    public void setDying(boolean dying) {
        this.dying = dying;
    }

    public boolean isDying() {
        return this.dying;
    }

    public void moveX(int direction) {
        this.x += direction;
    }

    public void moveY(int direction) {
        this.y += direction;
    }
}
