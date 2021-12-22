import java.applet.*;
import java.awt.*;
import java.awt.event.*;


/*<applet code="angry.class" width="600" height="600"></applet>*/
public class angry extends Applet implements ActionListener
{
int lx=350,ly=350,lw=20,lh=30,rx=440;
int ox=380,oy=410,ow=50,oh=80,x1=300,x2=300,y=200,ax=350,ay=430;

Button b1= new Button("original");
Button b2= new Button("left");
Button b3= new Button("right");
Button b4= new Button("up");
Button b5= new Button("down");

public void init()
{
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}



public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{  
repaint();
y=200;
x1=300;
x2=300;
lx=350;
rx=440;
ly=350;
lw=20;
lh=30;
ax=350;
ay=430;
}
if(ae.getSource()==b2)
{  
repaint();

y=200;
x1=100;
x2=300;
lx=150;
rx=240;
ly=350;
lw=20;
lh=30;
ax=150;
ay=430;


}
   

if(ae.getSource()==b3)
{  
repaint();

y=200;
x1=800;

x2=300;
lx=850;
rx=940;
ly=350;
lw=20;
lh=30;
ax=850;
ay=430;
}


if(ae.getSource()==b4)
{  
repaint();

x1=300;

x2=100;
lx=350;
rx=440;
ly=150;
lw=20;
lh=30;
ax=350;
ay=230;
}

if(ae.getSource()==b5)
{  
repaint();

x1=300;

x2=450;

lx=350;
rx=440;
ly=490;
lw=20;
lh=30;
ax=350;
ay=580;
}


}

public void paint(Graphics g){
              g.setColor(Color.YELLOW);
    g.fillOval(x1,x2,y,y);
           g.setColor(Color.RED);
          // g.fillOval(270,300,50,80);
           
   
           g.setColor(Color.RED);
           
           g.fillOval(lx,ly,lw,lh);
           g.fillOval(rx,ly,lw,lh);
              g.setColor(Color.BLACK);
            g.fillArc(ax,ay,100,70,0,180);
//g.fillOval(240,230,20,30);
             //g.fillOval(320,230,20,30);
}
}