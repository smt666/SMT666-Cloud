package cn.smt666.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "provider-user")  //与提供者关联。
public interface EurekaServiceFeign {
	
	/**
	 * 请求变量名也需要写全。
	 * method = RequestMethod.GET 为了严谨所以我们加上这句（也可以不添加，Get与Post都行）。
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable("name") String name);

}
