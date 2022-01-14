public class Warrior extends Adventurer {
    private int  rage;
    private String warcry;
    private int rageMax;

    public Warrior(){
	     this("Magnus");
    }

    public Warrior(String name){
	     this(name,"Valhalllaaaaa!!", 18);
    }

    public Warrior(String name, String warcry, int rage){
      super(name,30+(int)(Math.random()*10));
      setWarcry(warcry);
      setRage(rage);
      int max = rage+(int)(Math.random()*10);
      if (max < 10){
        setMaxRage(10);
      } else {
        setMaxRage(max);
      }
    }

    //warrior methods
    public String attack(Damageable other){
    	  int damage = (int)(Math.random()*10)+1;
        damage = super.affects(damage);
  	    other.applyDamage(damage);
  	    setRage(getRage() + 1);
  	    return ""+ this + " attacked " + other + " for " + damage + " damage!";

    }

    public String specialAttack(Damageable other){
	     if(getRage() >= 10){
  	        int damage = (int)(Math.random()*20)+1;
            other.applyDamage(damage);
            return ""+ this + " unleashes his fury upon " + other + " for " + damage + " damage! "+warcry);
            setRage(getRage() - 10);
	    }else{
			    return "Not enough rage! " + attack(other);
	    }
    }

    //get methods
    public int getRage(){
	     return rage;
    }
    public String getSpecialName(){
      return "Rage";
    }
    public int getSpecialMax(){
      return rageMax;
    }
    public int getSpecial(){
      return rage;
    }

    //set methods
    public void setRage(int r){
	     this.rage = r;
    }

    public void setWarcry(String warcry){
	     this.warcry = warcry;
    }


}
