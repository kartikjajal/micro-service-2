package service.discover.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service1")
public interface Service1 {

	
	@RequestMapping("service1/hello")
	public String getService1();
}
