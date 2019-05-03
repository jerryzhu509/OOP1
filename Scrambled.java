//Chris T. and Jerry Z.
//Mrs. Krasteva
//Feb 13th
//This is the scrambled subclass
import java.awt.*;
public class Scrambled extends Egg {
  private int fluffiness; //fluffiness of the scrambled egg
  public Scrambled () { //default constuctor
    super();
    fluffiness = 10;
  }
  public Scrambled (int si, int ag, Color c, double h, boolean ob, int fl) { //custom constructor
    super (si, ag, c, h, false, ob);
    fluffiness = fl;
  }
  public void eat () { //setter
    fluffiness = 0;
    setHeat(0);
    setSize(0);
    setObese(false);
  }
  public int getFluffiness () { //getter
    return fluffiness;
  }
  public void setFluffiness (int n) { //setter
    fluffiness = n;
  }
  public void increaseFluffiness (int n) { //modifier
    fluffiness += n;
  }
}