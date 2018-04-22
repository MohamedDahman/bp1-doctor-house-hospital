package at.refugeecode.diagnose;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DiagnoseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiagnoseApplication.class, args);
	}
}
