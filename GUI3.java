
import java.awt.*;
import java.awt.event.*;


class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame("PPA50");
        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());
    }
}


class MarvellousListener implements WindowListener
{
    public void  windowDeactivated(WindowEvent obj)     //error mdhe aaleli method paste windowDeactivate
    {}
    public void  windowActivated(WindowEvent obj)       //error mdhe aaleli method paste windowDeactivate
    {}
    public void windowDeiconified(WindowEvent obj) 
    {}
    public void windowIconified(WindowEvent obj)
    {}
    public void windowClosed(WindowEvent obj)
    {}
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent obj)
    {}
}

class GUI3
{
    public static void main(String A[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA50") ;   
    
    }
}