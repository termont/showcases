package org.home.dt.managedbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.home.dt.ejb.HelloWorldLocal;;

@ManagedBean
@SessionScoped
public class HelloWorldMBean {
	
	@EJB
	private HelloWorldLocal hwLocal;
	
	public String getHello() {
		return this.hwLocal.getHello();
	}
}
