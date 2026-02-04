package ExercicioRPG;

public class Hunter extends Characterer implements Inspirer, GroupAttack, Observer {

    private int speed;
    private int intelligence;

    public Hunter(String name, int level, int xp, int life, int baseAttack, int baseDefense, int speed, int intelligence) {
        super(name, level, xp, life, baseAttack, baseDefense);
        this.speed = speed;
        this.intelligence = intelligence;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("Velocidade: " + speed);
        System.out.println("Inteligência: " + intelligence);
    }

    @Override
    public void attack(Characterer target) {
        int damage = this.getBaseAttack() + (this.speed / 3) - target.getBaseDefense();
        if (damage < 0) damage = 0;

        target.setLife(target.getLife() - damage);
        System.out.println(this.getName() + " atacou " + target.getName() + " com precisão, causando " + damage + " de dano.");
    }

    @Override
    public void hit(Characterer[] targets) {
        for (Characterer target : targets) {
            if (target.getLife() > 0) {
                int reducedDamage = (int)( (this.getBaseAttack() + this.speed / 3) * 0.7 ) - target.getBaseDefense();
                if (reducedDamage < 0) reducedDamage = 0;
                target.setLife(target.getLife() - reducedDamage);
                System.out.println(this.getName() + " atirou em " + target.getName() + " causando " + reducedDamage + " de dano (ataque em grupo).");
            }
        }
    }
    @Override
    public void inspirit(Characterer target) {
        int bonus = target.getBaseDefense() / 3;
        System.out.println(getName() + " inspirou " + target.getName() + " — defesa aumentada em " + bonus + "!");
    }

    @Override
    public void observe(Characterer target) {
        System.out.println("🔍 " + getName() + " está observando " + target.getName() + ":");
        target.showStatus();
    }
}