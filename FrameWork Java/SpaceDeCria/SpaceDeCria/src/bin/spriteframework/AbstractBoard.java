//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package bin.spriteframework;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JPanel;
import javax.swing.Timer;
import bin.spriteframework.sprite.*;

import static bin.spriteframework.Commons.*;

public abstract class AbstractBoard extends JPanel {
    protected Dimension d;
    protected LinkedList<Player> players;
    protected LinkedList<BadSprite> badSprites;
    private int numberPlayers;
    protected boolean inGame = true;
    protected String message = "Game Over";
    protected Timer timer;

    protected abstract void createBadSprites();

    protected abstract void createOtherSprites();

    protected abstract void drawOtherSprites(Graphics var1);

    protected abstract void update();

    protected abstract void processOtherSprites(Player var1, KeyEvent var2);

    public AbstractBoard() {
        this.initBoard();
        this.createPlayers();
        this.numberPlayers = 1;
        this.badSprites = new LinkedList();
        this.createBadSprites();
        this.createOtherSprites();
    }

    private void initBoard() {
        this.addKeyListener(new TAdapter());
        this.setFocusable(true);
        this.d = new Dimension(BOARD_WIDTH, BOARD_HEIGHT);
        this.setBackground(Color.green);
        this.timer = new Timer(DELAY, new GameCycle());
        this.timer.start();
        this.createPlayers();
        this.numberPlayers = 1;
        this.badSprites = new LinkedList();
        this.createBadSprites();
        this.createOtherSprites();
    }

    protected void createPlayers() {
        this.players = new LinkedList();
        this.players.add(this.createPlayer());
    }

    protected Player createPlayer() {
        return new Player();
    }

    public Player getPlayer(int i) {
        return i >= 0 && i < this.players.size() ? (Player)this.players.get(i) : null;
    }

    private void drawBadSprites(Graphics g) {
        Iterator var3 = this.badSprites.iterator();

        while(true) {
            BadSprite bad;
            do {
                if (!var3.hasNext()) {
                    return;
                }

                bad = (BadSprite)var3.next();
                if (bad.isVisible()) {
                    g.drawImage(bad.getImage(), bad.getX(), bad.getY(), this);
                }

                if (bad.isDying()) {
                    bad.die();
                }
            } while(bad.getBadnesses() == null);

            Iterator var5 = bad.getBadnesses().iterator();

            while(var5.hasNext()) {
                BadSprite badness = (BadSprite)var5.next();
                if (!badness.isDestroyed()) {
                    g.drawImage(badness.getImage(), badness.getX(), badness.getY(), this);
                }
            }
        }
    }

    private void drawPlayers(Graphics g) {
        Iterator var3 = this.players.iterator();

        while(var3.hasNext()) {
            Player player = (Player)var3.next();
            if (player.isVisible()) {
                g.drawImage(player.getImage(), player.getX(), player.getY(), this);
            }

            if (player.isDying()) {
                player.die();
                this.inGame = false;
            }
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.doDrawing(g);
    }

    private void doDrawing(Graphics g1) {
        Graphics2D g = (Graphics2D)g1;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.d.width, this.d.height);
        g.setColor(Color.green);
        if (this.inGame) {
            g.drawLine(0, GROUND, BOARD_WIDTH, GROUND);
            this.drawBadSprites(g);
            this.drawPlayers(g);
            this.drawOtherSprites(g);
        } else {
            if (this.timer.isRunning()) {
                this.timer.stop();
            }

            this.gameOver(g);
        }

        Toolkit.getDefaultToolkit().sync();
    }

    private void gameOver(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT);
        g.setColor(new Color(0, 32, 48));
        g.fillRect(50, 149, 258, 50);
        g.setColor(Color.white);
        g.drawRect(50, 149, 258, 50);
        Font small = new Font("Helvetica", 1, 14);
        FontMetrics fontMetrics = this.getFontMetrics(small);
        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(this.message, (BOARD_WIDTH - fontMetrics.stringWidth(this.message)) / 2, 179);
    }

    private void doGameCycle() {
        this.update();
        this.repaint();
    }

    private class GameCycle implements ActionListener {
        private GameCycle() {
        }

        public void actionPerformed(ActionEvent e) {
            AbstractBoard.this.doGameCycle();
        }
    }

    private class TAdapter extends KeyAdapter {
        private TAdapter() {
        }

        public void keyReleased(KeyEvent e) {
            Iterator var3 = AbstractBoard.this.players.iterator();

            while(var3.hasNext()) {
                Player player = (Player)var3.next();
                player.keyReleased(e);
            }

        }

        public void keyPressed(KeyEvent e) {
            Iterator var3 = AbstractBoard.this.players.iterator();

            while(var3.hasNext()) {
                Player player = (Player)var3.next();
                player.keyPressed(e);
                AbstractBoard.this.processOtherSprites(player, e);
            }

        }
    }
}
