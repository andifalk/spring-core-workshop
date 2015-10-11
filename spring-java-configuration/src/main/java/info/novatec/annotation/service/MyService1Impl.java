package info.novatec.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myService1")
public class MyService1Impl implements MyService1 {
	
	private final MyService2 myService2;

	@Autowired
	public MyService1Impl(MyService2 myService2) {
		this.myService2 = myService2;
	}
	
	@Override
	public String callService2(String message) {
		return myService2.sayHello(message);
	}
	
}
