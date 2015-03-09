package org.home.dt.ejb;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless(name="HelloWorldLocalEJB")
@Local
public class HelloWorldBean implements HelloWorldLocal {

	@Override
	public String getHello() {
		
		return "Hello World";
	}

}
