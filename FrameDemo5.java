import java.lang.*;
import java.awt.*;
import java.awt.event.*;



class MarvellousFrame extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button bobj;
    public TextField tobj;
    public TextField tobj1;
    public Label lobj;


   public MarvellousFrame(String name)
   {
      fobj = new Frame(name);
      bobj = new Button("Marvellous");
      tobj1 = new TextField();
      lobj = new Label(" ");



      bobj.setBounds(110,130,90,20);
      tobj.setBounds(60,60,170,20);
      tobj1.setBounds(70,70,170,20);

      lobj.setBounds(100,120,85,20);

     fobj.add(bobj);
     fobj.add(tobj1);
     fobj.add(tobj);
     fobj.add(lobj);

      fobj.setSize(600,600);
      fobj.setVisible(true);



       bobj.addActionListener(this);
      fobj.addWindowListener(new Marvellouslistener());
   }
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

     public void actionPerformed(ActionEvent obj)
     {
       int a = Integer.parseInt(tobj.getText());
       int b = Integer.parseInt(tobj1.getText());
       int c = a + b;
       lobj.setText("THeir sum is = " +String.valueOf(c));

     }
}

class FrameDemo5
{
    public static void main(String arg[])
    {
       MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}