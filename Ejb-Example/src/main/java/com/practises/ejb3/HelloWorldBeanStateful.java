package com.practises.ejb3;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateful(mappedName="helloEJBService/stateful", name="helloEJBService/stateful")
@LocalBean
public class HelloWorldBeanStateful implements HelloWorld {

	private List<String> names;

	public HelloWorldBeanStateful() {
		names = new ArrayList<>();
	}

	@Override
	public void addName(String name) {
		names.add(name);
	}

	@Override
	public List<String> getNames() {
		return names;
	}

}
