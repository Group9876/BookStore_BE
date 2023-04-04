package hanu.edu.domain.product.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    private long id;
    private String name;
    private double price;
    private String description;
    private long inStock;
    private List<String> images;
    private String category;

    public Product(String name, double price, String description, long inStock, List<String> images, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
        this.images = images;
        this.category = category;
    }
}
