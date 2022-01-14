import java.util.Random;
public abstract class Adventurer implements Damageable{
    private String name;
    private int HP;
    private String condition;
    private int maxHP;

    //return a String that contains the description of the results of the attack
    public abstract String attack(Damageable other);

    //return a String that contains the description of the results of the specialAttack
    public abstract String specialAttack(Damageable other);

    //return the name of the special resource the class uses
    public abstract String getSpecialName();

    //return the value of the current and maximum special resource
    public abstract int getSpecial();
    public abstract int getSpecialMax();


    public Adventurer(){
  	   this("Lester");
    }

    public Adventurer(String name){
  	   this(name, 10);
    }

    public Adventurer(String name, int hp){
       this.name = name;
       this.HP = hp;
       setMaxHP(hp);
    }

    //Adventurer methods
    public int affects(int d){
      int damage = d;
      if (condition == "Burning") this.HP -= 1;
      if (condition == "Frozen") damage -= 2;
      if (condition == "Blessed") this.HP += 1;
      if (damage <= 0) return 0;
      return damage;
    }

    //toString method
    public String toString(){
    	return this.getName();
    }

    //Get Methods
    public String getName(){
    	return name;
    }
    public int getHP(){
	     return HP;
    }
    public void applyDamage(int amount){
      if (condition == "Bleeding") amount++;
      this.HP -= amount;
    }
    public int getmaxHP(){
      return maxHP;
    }

    //Set Methods
    public void setHP(int health){
	     this.HP = health;
    }
    public void setName(String s){
	     this.name = s;
    }
    public void setCondition(String c){
	     this.condition = c;
    }
    public void setmaxHP(int newMax){
       maxHP = newMax;
    }
}
