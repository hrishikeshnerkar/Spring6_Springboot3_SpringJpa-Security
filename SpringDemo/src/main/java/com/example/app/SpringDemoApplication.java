package com.example.app;

import com.example.app.model.Alien;
import com.example.app.model.Laptop;
import com.example.app.services.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		// Now for service as laptop(Service is used to process data / do processing on objects
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);


		/*{ This is different
			ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
			Alien obj = context.getBean(Alien.class);
			obj.code();
		}*/
	}
}
