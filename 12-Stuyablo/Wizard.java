public class Wizard extends Adventurer {
    private int spell;
    private String element;

    public Wizard(){
	     this("Azerious");
    }

    public Wizard(String name){
	     this(name, (int)(Math.random()*2)+1, "Fire");
    }

    public Wizard(String name, int spell, String element){
      super(name,20+(int)(Math.random()*5));
      setSpell(spell);
      setElement(element);
    }

    //wizard methods

    public void attack(Damageable other){
    	  int damage = (int)(Math.random()*5*spell);
        damage = super.affects(damage);
  	    other.applyDamage(damage);
  	    setSpell(getSpell()+1);
        if(getSpell()>=4) setSpell(1);
  	    System.out.println(this +
            " attacked " + other + " for " +
            damage + " damage!");

    }

    public void specialAttack(Damageable other){
        String effect = "";
        if (element == "Fire") effect = "Burning";
        if (element == "Ice") effect = "Frozen";
        other.setCondition(effect);
        System.out.println(this + " inflicted " + other + " with " + effect + "!");
    }

    //get methods
    public int getSpell(){
	     return spell;
    }
    public String getElement(){
	     return element;
    }

    //set methods
    public void setSpell(int s){
	     spell = s;
    }
    public void setElement(String e){
	     element = e;
    }
}
