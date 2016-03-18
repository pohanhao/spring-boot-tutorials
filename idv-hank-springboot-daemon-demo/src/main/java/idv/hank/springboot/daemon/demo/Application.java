package idv.hank.springboot.daemon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		String mode = (args == null || args.length == 0) ? null : args[0];
		if ("start".equals(mode)) {
			SpringApplication.run(Application.class, args);
		} else if ("stop".equals(mode)) {
			System.exit(0);
		} else {
			String message = "Error control signal input.";
			throw new RuntimeException(message);
		}
	}

	@RestController
	static class HomeController {
		@RequestMapping("/")
		public String home() {
			return "Hello World";
		}
	}

}