package ExercicioRPG;

public class Sorcerer extends Characterer implements Healer, Spellcaster {
    private int intelligence;
    private int mana;

    public Sorcerer(String name, int level, int xp, int life, int baseAttack, int baseDefense, int intelligence, int mana) {
        super(name, level, xp, life, baseAttack, baseDefense);
        this.intelligence = intelligence;
        this.mana = mana;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("Inteligência: " + intelligence);
        System.out.println("Mana: " + mana);
    }

    @Override
    public void healing(Characterer target) {
        int healAmount = target.getMaxLife() / 3;
        target.setLife(target.getLife() + healAmount);
        if (target.getLife() > target.getMaxLife()) {
            target.setLife(target.getMaxLife());
        }
        System.out.println(getName() + " curou " + target.getName() + " com magia!");
    }

    @Override
    public void conjure(Characterer target) {
        System.out.println(getName() + " lançou um feitiço de sono em " + target.getName() + "!");
        System.out.println(target.getName() + " caiu em sono mágico e não poderá agir no próximo turno.");
    }

    @Override
    public void attack(Characterer target) {
        int magicalDamage = this.getBaseAttack() + (this.intelligence / 2);
        int finalDamage = magicalDamage - target.getBaseDefense();
        if (finalDamage < 0) finalDamage = 0;

        target.setLife(target.getLife() - finalDamage);
        System.out.println(this.getName() + " atacou " + target.getName() + " com magia, causando " + finalDamage + " de dano.");
    }
}
