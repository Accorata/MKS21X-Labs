import java.util.Random;
public abstract class Adventurer implements Damageable{
    private String name;
    private int HP;
    private String condition;

    //Abstract methods are meant to be implemented in child classes.
    public abstract void attack(Damageable other);
    public abstract void specialAttack(Damageable other);

    public Adventurer(){
  	   this("Lester");
    }

    public Adventurer(String name){
  	   this(name, 10);
    }

    public Adventurer(String name, int hp){
       this.name = name;
       this.HP = hp;
    }

    //Adventurer methods
    public int affects(int d){
      int damage = d;
      if (condition == "Burning") this.HP -= 1;
      if (condition == "Frozen") damage -= 2;
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
}
