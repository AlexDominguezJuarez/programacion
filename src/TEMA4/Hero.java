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

    public int getDefense() {return defense;
    }

    public void drinkPotion(){
        int vidaTemporal=this.health;
        this.health=+10;
        int saludRecuperada=this.health-vidaTemporal ;
        System.out.println("Salud recuperada: "+saludRecuperada);
    }

    public static void rest(int vida){
        vida=vida+50;
    }

    public String  toString() {
        return ("Nombre: "+this.name+"\nNivel: "+this.level+"\nVida: "+this.health+"\nAtaque: "+this.attack+"\nDefensa: "+this.defense+"\nExperiencia: "+this.experience);
    }

    public void levelUp(){
        if (this.experience>50){
            this.level++;
            this.attack++;
            this.defense++;
            this.health=+5;
            this.maxHealt=+5;
            this.experience=0;

            System.out.println("\n"+this.name+" ha subido de nivel\nAtaque: "+this.attack+"\nDefensa: "+this.defense+"\nVida: "+this.health+"\n");
        }
    }

    public void attack(Hero otroHeroe) {
        int dano = Math.max(this.attack - otroHeroe.defense, 10);

        // Reducir la vida del otro héroe
        otroHeroe.health -= dano;

        // Sumar 10 de experiencia al atacante
        this.experience += 10;
    }
}
