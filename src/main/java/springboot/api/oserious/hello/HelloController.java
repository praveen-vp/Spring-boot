package springboot.api.oserious.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	/**
	 * Default method is GET. other methods needs to specified.
	 * 
	 * @return
	 */
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

}
