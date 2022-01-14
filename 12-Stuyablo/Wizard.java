public class Wizard extends Adventurer {
    private int spell;
    private int spellMax = 3;
    private String mastery;

    public Wizard(){
	     this("Azerious");
    }

    public Wizard(String name){
	     this(name, (int)(Math.random()*2)+1, "Pyromancy");
    }

    public Wizard(String name, int spell, String mastery){
      super(name,20+(int)(Math.random()*5));
      setSpell(spell);
      setMastery(mastery);
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
        if (mastery == "Pyromancy") effect = "Burning";
        if (mastery == "Cryomancy") effect = "Frozen";
        other.setCondition(effect);
        System.out.println(this + " inflicted " + other + " with " + effect + "!");
    }

    //get methods
    public int getSpell(){
	     return spell;
    }
    public String getMastery(){
	     return mastery;
    }
    public String getSpecialName(){
      return "Spell";
    }
    public int getSpecialMax(){
      return spellMax;
    }
    public int getSpecial(){
      return spell;
    }

    //set methods
    public void setSpell(int s){
	     spell = s;
    }
    public void setMastery(String m){
	     mastery = m;
    }
}
