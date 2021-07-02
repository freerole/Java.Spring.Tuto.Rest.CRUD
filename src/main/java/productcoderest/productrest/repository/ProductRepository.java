package productcoderest.productrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import productcoderest.productrest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
