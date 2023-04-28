package ToyStore;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Toy_Store {
    private List<Toy> toys;

    public Toy_Store(List<Toy> toys) {
        this.toys = toys;
    }
    
    public Toy getToyForPrice() {
        RandomToyChooser random = new RandomToyChooser();
        Toy toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toy toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("ToyStore/You_Win_Toys.txt", true))
        { 
            writer.write("Ваш выйгрыш! ");
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}