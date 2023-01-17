JSON Mapping using Gson
This project demonstrates the use of the Gson library for converting and mapping JSON files in Java.

Getting Started
1- Clone this repository to your local machine
2- Import the project into your preferred Java IDE
3- Then you have to add it to the build bath of this project. Here a full description how to do that : 
	In Eclipse, you can import the Gson library by adding it to the build path of your project. Here are the steps to do this:
	a.	Right-click on your project in the Project Explorer and select "Properties" from the context menu.
	b.	In the Properties window that opens, select "Java Build Path" on the left side.
	c.	Select the "Libraries" tab, and then click the "Add External JARs" button.
	d.	Navigate to the location where you have downloaded the Gson library and select the JAR file. It should be called something like "gson-x.x.x.jar" where x.x.x is the version number of the library.
	e.	Click "Open" and the JAR file should be added to your project's build path.
4- You'll have to update the path of the input json file and the output json file in Main class of the jsonConverter package.
	input json file path : at testAptitude/jsonConverter.Main.main(Main.java:25)
	output json file path : at testAptitude/jsonConverter.Main.main(Main.java:75)
5- Run the Main.java file to see the example of mapping the input JSON file to the desired output JSON file

Libraries Used
Gson: for JSON serialization and deserialization

Note
The input json file is located in the resources folder and the final json will be written in the same folder.
The input json file is read from the resources folder, If you want to use another file you will have to change the path of the input file in the Main.java file.
The package name in the code should be adjusted to the package name in your project.
Make sure that Gson library is added to your project dependencies before running the code.
Conclusion
In this project, I have demonstrated how to use Gson to convert and map JSON files in Java, and I have explained the basic usage of the library. I hope this will help you in your future projects.First you'll need to download the Gson jar file from the following link : "https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.9"


