package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	static void main() {

		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
		IPhone11Factory iphone11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = iPhoneXFactory.orderIPhone();
		System.out.println(iPhone);


		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11 = iphone11Factory.orderIPhone();
		System.out.println(iPhone11);
	}
}
