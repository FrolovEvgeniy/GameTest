package game;

import game.person_user.Mob;
import game.person_user.PersonUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Назавите ваше имя: ");
        String nameUser = scanner.nextLine();

        PersonUser person = new PersonUser(nameUser, 100);
        Mob slime = new Mob("Слизь", 20);

        /*System.out.print("Ударить: " + slime.getName());
        String act = scanner.nextLine();
        act.toLowerCase();

        if (act.equals("yes") || act.equals("y")){

        }

         */
        display(person,slime);
    }

    static void display(PersonUser name1,Mob name2){
        System.out.println(name1.getName() + " жизни: " + name1.getHp());
        System.out.println(name2.getName() + " жизни: " + name2.getHp());
    }


}
