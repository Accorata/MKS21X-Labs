public class Wizard extends Adventurer {
    private int spell;
    private int element;

    public Wizard(){
	     this("Azerious");
    }

    public Wizard(String name){
	     this(name, (int)(Math.random()*3), (int)(Math.random()*3));
    }

    public Wizard(String name, int spell, int element){
      super(name,20+(int)(Math.random()*5));
      setSpell(spell);
      setElement(element);
    }

    //wizard methods

    public void attack(Damageable other){
    // 	  int damage = (int)(Math.random()*10)+1;
  	//     other.applyDamage(damage);
  	//     setRage(getRage() + 1);
  	//     System.out.println(this +
    //         " attacked " + other + " for " +
    //         damage + " damage!");
    //
    }

    public void specialAttack(Damageable other){
	  //    if(getRage() >= 10){
  	//         int damage = (int)(Math.random()*20)+1;
    //         other.applyDamage(damage);
    //         System.out.println(this + " unleashes his fury upon "
    //          + other + " for " + damage + " damage! "+warcry);
    //         setRage(getRage() - 10);
	  //   }else{
		// 	    System.out.println("Not enough rage! ");
    //       attack(other);
	  //   }
    }

    //get methods
    public int getSpell(){
	     return spell;
    }
    public int getElement(){
	     return element;
    }

    //set methods
    public void setSpell(int s){
	     spell = s;
    }
    public void setElement(int e){
	     element = e;
    }
}
