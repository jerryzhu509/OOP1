//Chris T. and Jerry Z.
//Mrs. Krasteva
//Feb 13th
//This is the superclass (egg)
import java.awt.Color;

public abstract class Egg {
  private int size, age;
  private Color colour;
  private double heat;
  private boolean alive, obese;
  
  public Egg() //default constructor
  {
    size = 0;
    age = 0;
    colour = null;
    heat = 0;
    alive = false;
    obese = false;
  }
  
  public Egg(int si, int ag, Color c, double h, boolean al, boolean ob) //custon constructor
  {
    size = si;
    age = ag;
    colour = c;
    heat = h;
    alive = al;
    obese = ob;
  }
  
  public void die() //setter
  {
    size = 0;
    age = 0;
    colour = null;
    heat = 0;
    alive = false;
    obese = false;
  }
  
  public void move() //modifier
  {
    heat++;
  }
  
  
  //setter
  public void setAge(int a)
  {
    age = a;
  }
  
  //mutator 
  public void getOlder () {
    age++;
  }
  
  //getter
  public int getAge () {
    return age;
  }
  
  //setter
  public void setSize(int s)
  {
    if ((size = s) > 10) obese = true;
  }
  
  //mutator
  public void growBigger () {
    if(++size > 10)
    {
      obese = true;
    }
  }
  
  //getter
  public int getSize () {
    return size;
  }
  //setter
  public void setColor(Color c)
  {
    colour = c;
  }
  
  //getter
  public Color getColor()
  {
    return colour; //maybe change to a string
  }
  
  //setter
  public void setHeat(double h)
  {
    heat = h;
  }
  
  //getter
  public double getHeat()
  {
    return heat;
  }
  
  //setter
  public void setAlive(boolean a)
  {
    alive = a;
  }
  
  //getter
  public boolean getAlive()
  {
    return alive;
  }
  
  //setter
  public void setObese(boolean o)
  {
    obese = o;
  }
  
  //getter
  public boolean getObese()
  {
    return obese;
  }
}
