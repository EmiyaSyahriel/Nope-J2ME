package nope;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class Nope extends MIDlet
{
    private NopeCanvas myCanvas;
    @Override
    protected void startApp() throws MIDletStateChangeException {
        Displayable dsp = Display.getDisplay(this).getCurrent();
        myCanvas=new NopeCanvas(false);
        Display.getDisplay(this).setCurrent(myCanvas);
    }

    @Override
    protected void pauseApp() {

    }

    @Override
    protected void destroyApp(boolean b) throws MIDletStateChangeException {
        myCanvas.exit = true;
    }
}