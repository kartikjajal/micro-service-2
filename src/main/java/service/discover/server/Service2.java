package service.discover.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service2")
public class Service2 {
	
	@Autowired
	private Service1 service1;

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome-to-service-2";
	}
	
	@RequestMapping("/service1")
	public String getService1() {
		return service1.getService1();
	}
	
}
