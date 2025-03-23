package nope;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;

public class NopeCanvas extends GameCanvas implements Runnable {

    protected NopeCanvas(boolean b) {
        super(false);
        setFullScreenMode(true);
        (new Thread(this)).start();
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        Font f = graphics.getFont();
        String nope = "Nope";
        int sW = f.stringWidth(nope);
        int fH = f.getHeight();

        int width = getWidth();
        int height = getHeight();
        graphics.setColor(0,0,0);
        graphics.fillRect(0,0,width,height);
        graphics.setColor(255,255,255);
        graphics.drawString("NOPE",
                (width/2) - (sW /2),
                (height/2) - (fH / 2),
                Graphics.TOP | Graphics.LEFT
        );
    }

    @Override
    protected void keyPressed(int i) {
        super.keyPressed(i);
    }

    @Override
    protected void keyReleased(int i) {
        super.keyReleased(i);
    }

    public boolean exit = false;

    @Override
    public void run() {
        while(!exit)
        {
            repaint();
            sleep(16L);
        }
    }

    private void sleep(long millis)
    {
        try
        {
            Thread.sleep(millis);
        } catch (Exception e) {
            //
        }
    }
}
