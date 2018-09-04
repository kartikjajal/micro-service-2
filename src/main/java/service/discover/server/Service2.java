package service.discover.server;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service2")
public class Service2 {
	
	@Autowired
	private Service1 service1;
	
	private static final Logger LOG = Logger.getLogger(Service1.class.getName());
	
	@Value("${server.port}")
    private int serverPort;

	@RequestMapping("/welcome")
	public String welcome() {
		LOG.info("Before welcome()");
		return "welcome-to-service-2 with "+serverPort;
	}
	
	@RequestMapping("/service1")
	public String getService1() {
		LOG.info("Before getService1()");
		String temp = service1.getService1();
		LOG.info("After getService1()");
		return temp;
	}
	
	@RequestMapping("/common")
	public String common() {
		return "welcome-to-common-service-2 with "+serverPort;
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "welcome-to-admin-service-2 with "+serverPort;
	}

	
}
