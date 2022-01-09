public class Game{
  public static void main(String[] args) {
    //Adventurer a = new Warrior("Conan","Aaaaaaaar!",20);
    //Adventurer b = new Warrior("Homer","Donuts?",0);
    Adventurer a = new Warrior();
    Adventurer b = new Wizard("Eldor",3,"Cryomancy");
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.attack(b);
    b.attack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.specialAttack(b);
    b.specialAttack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.attack(b);
    b.attack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
  }
}
