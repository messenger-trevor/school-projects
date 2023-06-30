<strong> D387 Trevor Messenger - Performance Assessment - 6/29/2023 </strong>

# TASK REQUIREMENTS 


## B
Below you can find notes describing where in the code to find changes made for each task requirement (C1, C2, C3, D2, and D3) including task requirement, file name, line number, and description of change


## C 
C1.	
    A. Adds language_en_US.properties and language_fr_CA.properties to Resource Bundle in package /main/resources/ 
    B. Accomplishes multithreaded welcome message display by adding il8n package in edu.wgu.d387_sample_code directory. il8n currently contains 
    a DisplayWelcome java class that creates a resource bundle object from locale and stores a list object that WelcomeController exposes in a rest endpoint
    at /api/welcome. The main java class (D387SampleCodeApplication) was then modified at lines 16-28 to include two runnable objects created by lambda functions
    that are then passed to 2 threads that start at application startup. Finally, I installed node dependencies in the UI folder and modified app.component.ts
    at lines 31, 39-42, and 92-94 where I added a member variable to hold the get request, subscribed to the observable returned by getWelcome(), and defined 
    getWelcome() to perform the get request. I added a h1 tag with the welcome variable on line 28 of app.component.html.
    

C2. Added multiple currency to room reservation by adding code to app.component.ts and app.component.html.
    app.component.ts lines 60-64 added logic to the lambda function to loop through each room object, convert the price to a number, and applies the change rate
    for each currency type. Lines 118-119 add priceEur and priceCad variables to the room interface.
    Finally, lines 80-82 in app.component.html display the currencies on newlines and utilize an angular pipe to convert to their respective currencies.

C3. 
    A. Added two java classes to the il8n package: TimeConversion which handles creating ZoneDateTime object based off the current time, time conversion, and string concatenation -- 
    TimeConversionController that exposes the string on rest endpoint /api/times.
    B. app.component.ts is further changed at lines 32, 42-44, and 105-107 where a variable to hold eventTimes was created, a method in the initialize method
    which calls the getEvents method, and the getEvent method which performs the get request. Finally the app.component.html has a block of text, plus the eventTimes
    object explaining the event and rendering the eventTimes at lines 168-173.

## D
D2. Below is a screenshot correctly showing the application running in a container and being exposed on port:8080. 

![img.png](img.png)

D3. Going forward, this application will be deployed and run on an AWS ECS (elastic container service) cluster utilizing AWS Fargate. ECS handles running docker
    containers without the needed overhead of managing servers and provides the necessary infrastructure should the application grow. To start, I will configure 
    a task definition by supplying the docker image and allocating resources. Then configure the service and the Elastic Load Balancer and launch using Fargate.
    All of this is easily configured through the AWS console, and is a cost-effective, fault-tolerant option that would easily scale going forward.
    The application will be exposed through the Load Balancers DNS and will require a custom DNS name setup through an accredited registrar or for ease of use
    you can utilize Amazon's Route 53 to register a domain name and use as a DNS service.


