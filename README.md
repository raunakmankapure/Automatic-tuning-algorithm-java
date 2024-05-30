
### Building and Running the Project

1. **Open the Project in Your IDE**:
   - Open your IDE and import the project as a Maven project using the `pom.xml` file.

2. **Build the Project**:
   - Maven will handle dependencies and build the project. Use the following Maven command in your IDE's terminal or command line:
     ```sh
     mvn clean install
     ```
   - This command cleans any previous builds and installs the dependencies defined in the `pom.xml`.

3. **Run the Application**:
   - In your IDE, locate the `AutomatedTuningApp` class and run it. Most IDEs provide a "Run" option when you right-click the file or have a run button if you open the file in the editor.
   - Alternatively, you can run the application from the command line:
     ```sh
     mvn exec:java -Dexec.mainClass="com.yourcompany.AutomatedTuningApp"
     ```
   - Ensure that the `exec-maven-plugin` is added to your `pom.xml`:

     ```xml
     <build>
         <plugins>
             <plugin>
                 <groupId>org.codehaus.mojo</groupId>
                 <artifactId>exec-maven-plugin</artifactId>
                 <version>1.6.0</version>
                 <executions>
                     <execution>
                         <goals>
                             <goal>java</goal>
                         </goals>
                     </execution>
                 </executions>
                 <configuration>
                     <mainClass>com.yourcompany.AutomatedTuningApp</mainClass>
                 </configuration>
             </plugin>
         </plugins>
     </build>
     ```

### Running Tests

To run the tests defined in `AutomatedTuningAppTest`, use the following Maven command:
```sh
mvn test
