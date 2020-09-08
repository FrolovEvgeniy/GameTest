package game.person_user;

public class Mob {
    private int hp;
    private String name;

    public Mob(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    int hit(){
        return 1;
    }
}
