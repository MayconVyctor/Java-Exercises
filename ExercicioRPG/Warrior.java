package ExercicioRPG;

public class Warrior extends Characterer implements Healer, Inspirer,GroupAttack {

    private int strenfh;
    private int resistence;

    public Warrior(String name, int level, int xp, int life, int baseAttack, int baseDefense, int strenfh, int resistence){
        super(name, level, xp, life, baseAttack, baseDefense);
        this.strenfh = strenfh;
        this.resistence = resistence;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("Força: " + strenfh);
        System.out.println("Resistência: " + resistence);
    }

    @Override
    public void attack(Characterer target) {
        int damage = this.getBaseAttack() + this.getTemporaryAttackBonus() - target.getBaseDefense();
        if (damage < 0) damage = 0;

        target.setLife(target.getLife() - damage);
        System.out.println(this.getName() + " atacou " + target.getName() + " causando " + damage + " de dano.");


        this.setTemporaryAttackBonus(0);
    }

    @Override
    public void healing (Characterer target) {
        int heal = target.getMaxLife() / 3;
        target.setLife(target.getLife() + heal);

        if (target.getLife() > target.getMaxLife()) {
            target.setLife(target.getMaxLife());
        }

        System.out.println(getName() + " curou " + target.getName() + "!");
    }

    @Override
    public void inspirit (Characterer target){
        int bonus = target.getBaseAttack() / 3;
        target.setTemporaryAttackBonus(bonus);
        System.out.println(getName() + " inspirou " + target.getName() + " — ataque aumentado em " + bonus + "!");
    }

    @Override
    public void hit(Characterer[] targets) {
        for (Characterer target : targets) {
            if (target.getLife() > 0) {
                attack(target);
            }
        }
    }
}
