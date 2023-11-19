package sg.ntu.edu.assignment;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(ProductController.class);
    private ArrayList<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product("1", "Banana", 3));
        products.add(new Product("2", "Apple", 2));
    }

    @GetMapping("")
    public ResponseEntity<ArrayList<Product>> getAllProducts() {
        logger.info("Get methods is successfful");
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<ArrayList<Product>> createProduct(@RequestBody Product product) {
        products.add(product);
        logger.info("Post method is successful");
        return new ResponseEntity<>(products, HttpStatus.CREATED);
    }


    
}
