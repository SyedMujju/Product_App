package in.Mujju.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Mujju.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}


