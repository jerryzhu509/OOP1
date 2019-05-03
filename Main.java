//Chris T. and Jerry Z.
//Mrs. Krasteva
//Feb 13th
//This program tests our Egg class and subclasses
import java.util.*;
import java.awt.*;
public class Main {
  public static void main(String[] args){
    ChickenEgg bobEgg = new ChickenEgg (); //make chicken egg
    bobEgg.absorbNutrition(); //modifier
    System.out.println (bobEgg.getSize()); //get size
    bobEgg.setAge (10); //setter
    Chicken bob = bobEgg.hatch(); //bob is hatched version of bobegg
    ChickenEgg bobJr = new ChickenEgg(), bobTheThird = new ChickenEgg(5,15,Color.yellow,10.5,true,false,true); //two new eggs
    bobJr.setColor (Color.black); //setter
    bobJr.setHeat (50.5); //setter
    bobJr.getOlder(); //modifier
    bobJr.setSize(100); //setter
    bob.lay(bobJr); //bobjr is a child of bob
    bob.lay(bobTheThird); //bobthethird is a child of bob
    bob.lay (new ChickenEgg()); //bob lays a default chickenegg
    bob.getChildren(); //print bobs children
    HardBoiled bobJrHB = bobJr.getHardBoiled(); //bobjr gets hardboiled
    bob.disown(bobJr); 
    bob.lay(bobJrHB); //hard boiled version is now child of bob
    Scrambled bobTheThirdS = bobTheThird.getScrambled(); //bobthethird gets scrambled
    bob.disown(bobTheThird);
    bob.lay(bobTheThirdS); //scrambled version is now child of bob
    bob.getChildren(); //print children
  }
}