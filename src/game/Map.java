package game;

public class Map {
    private String[] field = {"Город","Пещера"};
    private String[] city = {"Выход из города", "Лавка"};
    private String[] cave = {"Выход из пещеры"};
    public String tut = "";

    public Map(){
    }

    public void getCity(){
        tut = "Город";
        prop();
        System.out.println("Локация ГОРОД");
        for (String str : city) {
            System.out.println(str);
        }
    }

    public void getLoc(){
        tut = "Поле";
        prop();
        System.out.println("Локация ПОЛЕ");
        for (String str : field){
            System.out.println(str);
        }
    }

    public void getCave(){
        tut = "Пещера";
        prop();
        System.out.println("Локация ПЕЩЕРА");
        for (String str : cave){
            System.out.println(str);
        }
    }

    public void prop(){
        System.out.println("*\n*\n*");
    }
}
