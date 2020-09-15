package game;

import game.person_user.Mob;
import game.person_user.PersonUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map map = new Map();
        boolean gameOver = true;
        String act;

        map.getLoc();

        while (gameOver){
            act  = scanner.nextLine();
            if (map.tut == "Поле") {
                switch (act) {
                    case "Город":
                        map.getCity();
                        break;
                    case "Пещера":
                        map.getCave();
                        break;
                    default:
                        gameOver = false;
                }
            } else if (map.tut == "Город"){
                switch (act){
                    case "Выход из города":
                        map.getLoc();
                        break;
                    default:
                        gameOver = false;
                }
            } else if (map.tut == "Пещера"){
                switch (act){
                    case "Выход из пещеры":
                        map.getLoc();
                        break;
                    default:
                        gameOver = false;
                }
            }
        }
    }
}
