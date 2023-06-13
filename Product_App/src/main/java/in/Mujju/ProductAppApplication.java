package in.Mujju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Mujju.Model.Product;
import in.Mujju.repository.ProductRepository;

@SpringBootApplication
public class ProductAppApplication {

	public static void main(String[] args) {
	     ConfigurableApplicationContext    context =	SpringApplication.run(ProductAppApplication.class, args);
		
//	ProductRepository productRepo =  context.getBean(ProductRepository.class);
	     
//	Product p = new Product();
//	
//	p.setId(103l);
//	p.setName("OnePlue 11T");
//	p.setPrice(50000.00);
//	
//
//	productRepo.save(p);
//	
//	System.out.println("Record Inserted....");
	}

}
