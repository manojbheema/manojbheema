create the spring starter project with web jdbc jpa,security add the other dependencies as from pom.xml

Create the SecurityConfiguration class

Create the MVCConfig class Observe the overridden methods and beans created int it.

Create the jsp pages 403.jsp hello.jsp home.jsp login.jsp in webapp/WEB-INF/pages

Create the DB and tables and values as shown in db.sql

Make the entries in application.properties


URLs :localhost:9001/demo/
	  localhost:9001/demo/home
	  	
	  click on link shown on the page
	  
	  try login with ameya/1234
	  try login with avani/1234
	  try login with wrong username/password.
	  
==================The password must be encoded before pushing to DB ===============================
public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }	  
    
++++++++++++++++In this demo we hardcode password using a simple main calss EnocdePassword.java and copy/paste in DB ++++++++++++++++
package com.ameya;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodePassword {

	public static void main(String[] args) {
		String encoded=new BCryptPasswordEncoder().encode("1234");
		System.out.println(encoded);

	}

}
    