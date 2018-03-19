
public class Person {

  HairColour hairColour = HairColour.BLACK;

  public Person(){

  }

  public static void main(String[] args){
    Person peterParker = new Person();
    Person spiderMan = peterParker;

    spiderMan.hairColour = HairColour.PINK;

    System.out.println("Hair colour of Peter Parker: " + peterParker.hairColour);
    System.out.println("Hair colour of Spiderman: " + spiderMan.hairColour);

  }
}
