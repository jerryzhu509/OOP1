//Chris T. and Jerry Z.
//Mrs. Krasteva
//Feb 13th
//This is the chickenegg subclass
import java.awt.*;
public class ChickenEgg extends Egg{
  boolean hatchable;
  public ChickenEgg () { //default constructor
    super ();
    hatchable = false;
  }
  public ChickenEgg (int si, int ag, Color c, double h, boolean al, boolean ob, boolean ha) { //custom constructor
    super (si, ag, c, h, al, ob);
    hatchable = ha;
  }
  @Override
  public void setAge (int n) { //override with hatchable 
    super.setAge(n);
    hatchable = n > 9;
  }
  @Override
  public void getOlder () { //override with new setage
    int newage = getAge()+1;
    setAge(newage);
  }
  public void absorbNutrition() //modifier
  {
    setSize(getSize()+1);
    setHeat(getHeat()+1);
  }
  public HardBoiled getHardBoiled () { //return hardboiled version
    return new HardBoiled (getSize(), getAge(), getColor(), getHeat(), getObese(), 10);
  }
  public Scrambled getScrambled () { //return scrambled version
    return new Scrambled (getSize(), getAge(), getColor(), getHeat(), getObese(), 10);
  }
  public Chicken hatch () { //hatches into chicken if hatchable
    if (hatchable) 
    return new Chicken ();
    
    return null;
  }
}