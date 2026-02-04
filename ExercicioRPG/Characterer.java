package ExercicioRPG;

public abstract class Characterer implements BasicActions {

    private String name;
    private int level;
    private int xp;
    private int life;
    private int maxLife;
    private int baseAttack;
    private int baseDefense;
    private int temporaryAttackBonus = 0;

    public Characterer(String name, int level, int xp, int life, int baseAttack, int baseDefense) {
        this.name = name;
        this.level = level;
        this.xp = xp;
        this.life = life;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
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

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getTemporaryAttackBonus() {
        return temporaryAttackBonus;
    }

    public void setTemporaryAttackBonus(int bonus) {
        this.temporaryAttackBonus = bonus;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    @Override
    public abstract void attack (Characterer target);

    @Override
    public void gainXp(int xp) {
        this.xp += xp;
        levelUp();
    }

    @Override
    public void levelUp() {
        int xpNeeded = this.level * 100;
        if (this.xp >= xpNeeded) {
            this.level++;

            this.life += 10;
            this.baseAttack += 2;
            this.baseDefense += 2;
            System.out.println(getName() + " subiu para o nível " + this.level + "!");
        }
    }

    @Override
    public void showStatus() {
        System.out.println("=== " + name + " ===");
        System.out.println("Nivel: " + level);
        System.out.println("XP: " + xp);
        System.out.println("Vida: " + life);
        System.out.println("Ataque: " + baseAttack);
        System.out.println("Defesa: " + baseDefense);
    }
}
