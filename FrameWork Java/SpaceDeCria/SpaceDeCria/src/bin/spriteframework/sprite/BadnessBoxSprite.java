package bin.spriteframework.sprite;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.util.LinkedList;

public class BadnessBoxSprite extends BadSprite {
    LinkedList<BadSprite> badnesses = new LinkedList();

    public BadnessBoxSprite() {
    }

    void add(BadSprite b) {
        this.badnesses.add(b);
    }

    public LinkedList<BadSprite> getBadnesses() {
        return this.badnesses;
    }
}
