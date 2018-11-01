Create anew Spring starter project : 012-HelloRibbonService
add the dependencies as in pom.xml
Make the entries in application.yml
Code in the SayHelloApplication

Run the app as spring boot app
invoke : http://localhost:8090/ 
invoke : http://localhost:8090/greeting

Stop the running 012-HelloRibbonService app.

Create a new Spring starter project : 012-HelloRibbonClient
add the dependencies as in pom.xml
Code in the class Application.java (Note the @RibbonClient and @loadBalanced and the url invoked by the rest template)
Make the entries in application.yml

Run the 012-HelloRibbonService app 3 times each time changing the port in application.yml (8090,9092,9999)
Run the 012-HelloRibbonClient app

Either using browser or curl
invoke : http://localhost:8888/hi multiple times and observe the console logs
U will notice the above ports (8090,9092,9999) are used in round robin manner.
