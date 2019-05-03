//Chris T. and Jerry Z.
//Mrs. Krasteva
//Feb 13th
//This is the chicken subclass
import java.util.*;
public class Chicken extends Egg {
  private ArrayList<Egg> children; //list of children
  public Chicken () { //default constructor
    super();
    children = new ArrayList<Egg>();
  }
  public void absorbNutrition() //modifier
  {
    setHeat(getHeat()+1);
  }
  public void lay (Egg e) { //modifier
    children.add(e);
  }
  public void disown (Egg e) { //modifier
    children.remove(e);
  }
  public void getChildren () { //getter
    int index = 1;
    for (Egg e : children) {
      System.out.println ("Child #" + index + ": Size = " + e.getSize() + " Age = " + e.getAge() + " Colour = " + e.getColor() + " Heat = " + e.getHeat() + " Alive = " + e.getAge() + " Obese = " + e.getObese() + "\n");
      index++;
    }
  } 
}