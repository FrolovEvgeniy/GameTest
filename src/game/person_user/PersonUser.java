package game.person_user;

public class PersonUser {
    private int hp;
    private String name;

    public PersonUser(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName(){
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

    public int hit(Mob mob){
        return mob.getHp() - 1;
    }
}
