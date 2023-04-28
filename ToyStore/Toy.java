package ToyStore;

public class Toy {
    int id;
    String name;
    double weight;

    public Toy(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int get_id() {
        return id;
    }

    public void set_id(int new_id) {
        this.id = new_id;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String new_name) {
        this.name = new_name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Toy [ID: " + id + " Name: " + name +  "]";
    }
}