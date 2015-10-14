package com.practises.ejb3;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless(mappedName="helloEJBService/stateless", name="helloEJBService/stateless")
@LocalBean
public class HelloWorldBeanStateless implements HelloWorld {

	private List<String> names;

	public HelloWorldBeanStateless() {
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
