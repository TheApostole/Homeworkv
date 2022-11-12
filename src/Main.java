public class Main {
    public static void main(String[] args) {


        // Задание 1
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


        // Задарине 2
        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);


        // Задарине 3
        System.out.println("Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


        // Задарине 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        // Задарине 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        // Задарине 6
        System.out.println("Задание 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var fightersTotalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов " + fightersTotalWeight + " кг!");
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг!");


        // Задарине 7
        System.out.println("Задание 7");
        System.out.println("Разница весов двух бойцов (1 способ): " + (secondBoxerWeight - firstBoxerWeight));
        System.out.println("Разница весов двух бойцов (2 способ): " + (secondBoxerWeight % firstBoxerWeight));


        // Задарине 8
        System.out.println("Задание 8");
        var workingHours = 640;
        var employeeWorkingHours = 8;
        var totalEmployees = workingHours / employeeWorkingHours;
        System.out.println("Всего работников в компании – " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        workingHours = totalEmployees * employeeWorkingHours;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + workingHours + " часа работы может быть поделено между сотрудниками");

    }
}