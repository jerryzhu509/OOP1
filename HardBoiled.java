//Chris T. and Jerry Z.
//Mrs. Krasteva
//Feb 13th
//This is the hardboiled subclass
import java.awt.*;
public class HardBoiled extends Egg {
  private int hardness; //hardness of the boiled egg
  public HardBoiled () { //default constructor
    super();
    hardness = 5;
  }
  public HardBoiled (int si, int ag, Color c, double h, boolean ob, int ha) { //custom constructor
    super (si, ag, c, h, false, ob);
    hardness = ha;
  }
  public void eat () { //setter
    hardness = 0;
    setSize(0);
    setObese(false);
    setHeat(0);
  }
  public int getHardness (){ //getter
    return hardness;
  }
  public void setHardness (int n) { //setter
    hardness = n;
  }
  public void increaseHardness (int n) { //modifier
    hardness += n;
  }
}