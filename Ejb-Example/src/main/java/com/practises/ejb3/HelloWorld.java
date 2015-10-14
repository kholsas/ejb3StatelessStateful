package com.practises.ejb3;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface HelloWorld {
	
	void addName(String name);
	List<String> getNames();

}
