package ToyStore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Program {
    public static void main(String[] args) throws InterruptedException {

        
        
        // Создание объектов "Игрушки"
        Toy bear = new Toy(1, "Bear", 25);
        Toy car = new Toy(2, "Car", 40);
        Toy cubes = new Toy(3, "Cubes", 36.5);
        Toy lego = new Toy(4, "Lego", 36.3);
        Toy balloons = new Toy(5, "Balloons", 12.8);
        Toy ball = new Toy(6, "Ball", 58.2);
        Toy sword = new Toy(7, "Sword", 19);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(bear);
        toys.add(car);
        toys.add(cubes);
        toys.add(lego);
        toys.add(balloons);
        toys.add(ball);
        toys.add(sword);

        System.out.println("Вас приветствует Магазиг игрушек!! \nСегодня у нас розыгрыш игрушек и в нем участвуют игрушки:\n");
        toys.forEach(value -> System.out.print(value+"\n"));
        System.out.println("Производим розыгрыш! \n...Подождите...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ваш выйгрыш можно забрать в файле You_Win_Toys");
        TimeUnit.SECONDS.sleep(2);


        Toy_Store toyStore = new Toy_Store(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
    }
}

