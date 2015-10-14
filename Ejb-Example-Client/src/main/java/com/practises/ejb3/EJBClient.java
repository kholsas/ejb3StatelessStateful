package com.practises.ejb3;


import javax.naming.Context;
import javax.naming.NamingException;
  
public class EJBClient {
    public static void main(String[] args) {
        int index = 0;
       for (;index < 20; index++){
           new Thread(new ClientExecutor(index)).start();
       }
    }

    //wait, this was intentional! Exposed to at most, default scope.
     static HelloWorld doLookup(String lookupName) {
        Context context;
        HelloWorld bean = null;
        try {
            // 1. Obtaining Context
            context = ClientUtility.getInitialContext();
            // 2. Generate JNDI Lookup name
            // 3. Lookup and cast
            bean = (HelloWorld) context.lookup("java:/"+lookupName);
 
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return bean;
    }
 
}
