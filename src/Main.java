public class Main {
    public static void main(String[] args) {
        var dog = (8.0 + 4) - 3.5;
        System.out.println(dog);
        var cat = (3.6 + 4) - 1.6;
        System.out.println(cat);
        var paper = (763789 + 4) - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println("жаба1 " + frog);
        frog = frog * 10;
        System.out.println("жаба2 " + frog);
        frog = frog / 3.5;
        System.out.println("жаба3 " + frog);
        frog = frog + 4;
        System.out.println("жаба4 " + frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var allBoxer = boxer1 + boxer2;
        System.out.println("общий вес " + allBoxer );
        allBoxer = boxer2 - boxer1;
        System.out.println("разница " + allBoxer);
        allBoxer = boxer2 % boxer1;
        System.out.println("остаток от деления " + allBoxer);

        var wTime = 640;
        var workers = wTime / 8;
        System.out.println("Всего работников в компании - " + workers);
        workers = workers + 94;
        wTime = wTime / workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + wTime + " часов работы может быть поделено между сотрудниками");
    }
}