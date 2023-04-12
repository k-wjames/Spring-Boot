package ke.co.kodelite.springbootcrud.repository;

import ke.co.kodelite.springbootcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
