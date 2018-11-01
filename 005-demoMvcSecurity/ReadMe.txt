create the spring starter project with dependencies as shown in pom.xml

create the controller class

Create SecurityConfig and AppMvcConfig classes Note the annotations overriden methods and beans created in these classes
Note the PasswordEncoder bean in SecurityConfig class
Modify the class with main to extend SpringBootServletInitializer

Make the entries in application.properties

Create the jsp pages  accessDenied.jsp adminoperations.jsp commonoperations.jsp login.jsp welcome.jsp in webapp/WEB-INF/pages

URLs :localhost:9001/demo/
	  localhost:9001/demo/home
	  
	  click the link for admin operations
	  try login as admin/1234	this shud be allowed
	  logout
	  try login as ameya/1234 this shud not be allowed
	  logout
	  try with wrong username/password invalid username or password message
	  
	  
	  click link for Common Operations
	  try login with both usernames this shud be allowed