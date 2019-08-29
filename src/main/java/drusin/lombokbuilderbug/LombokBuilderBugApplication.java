package drusin.lombokbuilderbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "drusin.lombokbuilderbug")
public class LombokBuilderBugApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LombokBuilderBugApplication.class, args);
	}
	
}
