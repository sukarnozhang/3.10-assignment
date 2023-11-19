package sg.ntu.edu.assignment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String id;
    private String name;
    private int price;

    public Product(String id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
