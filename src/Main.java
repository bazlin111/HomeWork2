public class Main {
    public static void main(String[] args) {
        System.out.println( " Задание 1 ");
    var dog = 8.0;
        System.out.println(dog);
    var cat =3.6;
        System.out.println( cat);
    var paper = 763789;
        System.out.println( paper);

        System.out.println(" Задание 2");
    dog = dog +4 ;
        System.out.println(dog);
    cat = cat+ 4;
        System.out.println(cat);
    paper = paper + 4;
        System.out.println(paper);

        System.out.println(" Задание 3");
    dog = dog-3.5;
           System.out.println( dog);
    cat = cat-1.6;
           System.out.println(cat);
    paper = paper - 7639;
           System.out.println(paper);

        System.out.println(" Задание 4 ");
    var friend =19;
           System.out.println(friend);
    friend = friend +2;
           System.out.println( friend);
    friend = friend / 7;
           System.out.println(friend);

        System.out.println("Задание 5");
    var frog = 3.5;
            System.out.println(frog);
    frog = frog *10 ;
            System.out.println(frog);
    frog=frog /3.5;
            System.out.println( frog);
    frog = frog +4 ;
            System.out.println(frog);

        System.out.println( "Задание 6 ");
    var boxerFirst = 78.2;
    var boxerSecond =  82.7;
    var totalWeight = boxerFirst +boxerSecond ;
            System.out.println("Общий Вес двух боксеров "+totalWeight+"кг");
    var weightDifference = boxerSecond-boxerFirst;
            System.out.println("Разница веса боксеров "+weightDifference+"КГ!");

        System.out.println("Задание 7 ");
            System.out.println("Второй боксер тяжелее первого на " +(boxerSecond-boxerFirst)+ "КГ!");
    var weightDifference1 = (boxerSecond-boxerFirst) % totalWeight;
            System.out.println("Второй боксер тяжелее на "+weightDifference1+"КГ! Бой может не состояться!");

        System.out.println("Задание 8 ");
    var totalTime = 640;
    var timeOne = 8;
             System.out.println("Всего работников в компании -" +(totalTime/timeOne)+" человек");
    var newEmployees = (totalTime/timeOne)+ 94;
             System.out.println("Если в компании работает "+newEmployees+" человек, то всего "+(timeOne*newEmployees)+" часов работы  может быть поделено между сотрудниками.");

}

}