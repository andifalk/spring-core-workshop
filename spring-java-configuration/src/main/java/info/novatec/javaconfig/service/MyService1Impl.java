package info.novatec.javaconfig.service;

public class MyService1Impl implements MyService1 {
	
	private final MyService2 myService2;

	public MyService1Impl(MyService2 myService2) {
		this.myService2 = myService2;
	}
	
	@Override
	public String callService2(String message) {
		return myService2.sayHello(message);
	}
	
}
