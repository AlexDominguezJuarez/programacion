package TEMA4;

public class Hero {
    private String name="hero";
    private int level=0;
    private int health=100;
    private int maxHealt=150;
    private int experience=0;
    private int attack=30;
    private int defense=30;

    public Hero(String name,int level,int health,int maxHealt,int experience,int attack,int defense){
        this.name=name;
        this.level=level;
        this.health=health;
        this.maxHealt=maxHealt;
        this.experience=experience;
        this.attack=attack;
        this.defense=defense;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealt() {
        return maxHealt;
    }

    public void setMaxHealt(int maxHealt) {
        this.maxHealt = maxHealt;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.defense=attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }


    public static void drinkPotion(int vida){
        vida=vida+10;
    }

    public static void rest(int vida){
        vida=vida+50;
    }

    public static String toString(String name,int health,int attack,int defense,int level) {
        return (name+"\nNivel: "+level+"\nVida: "+health+"\nAtaque: "+attack+"\nDefensa: "+defense);
    }

    public static void levelUp(int level,int attack,int defense,int maxHealt,int health,int experience){
        if (experience>=50){
            level++;attack++;defense++;
            health=health+5;maxHealt=maxHealt+5;

        }
    }

    public static void attack(int attack1,int defense2,int vida2,int experience1,int maxHealt,int health,int defense,int level){
        vida2=defense2-attack1;
        experience1=experience1+10;
        if (experience1>50){levelUp(level,attack1,defense,maxHealt,health,experience1);}
    }
}
