<strong> D387 Trevor Messenger - Performance Assessment - 6/29/2023 </strong>

# TASK REQUIREMENTS 


## B
Below you can find notes describing where in the code to find changes made for each task requirement (C1, C2, C3, D2, and D3) including task requirement, file name, line number, and description of change


## C 
C1.	
    A. Adds language_en_US.properties and language_fr_CA.properties to Resource Bundle in package /main/resources/ 
    B. Accomplishes multithreaded welcome message display by adding il8n package in edu.wgu.d387_sample_code directory. il8n currently contains 
    a DisplayWelcome java class that creates a resource bundle object from locale and stores a list object that WelcomeController exposes in a rest endpoint
    at /api/welcome. The main java class (D387SampleCodeApplication) was then modified at lines 16-28 to include two runnable objects created by lamda functions
    that are then passed to 2 threads that start at application startup. Finally, I installed node dependencies in the UI folder and modified app.component.ts
    at lines 31, 39-42, and 92-94 where I added a member variable to hold the get request, subscribed to the observable returned by getWelcome(), and defined 
    getWelcome() to perform the get request. I added a h1 tag with the welcome variable on line 28 of app.component.html.
    

C2. Added multiple currency to room reservation by adding code to app.component.ts and app.component.html.
    app.component.ts lines 60-64 added logic to the lambda function to loop through each room object, convert the price to a number, and applies the change rate
    for each currency type. Lines 118-119 add priceEur and priceCad variables to the room interface.
    Finally, lines 80-82 in app.component.html display the currencies on newlines and utilize an angular pipe to convert to their respective currencies.

C3. 
    A. //future note here 
    B. //future note here

## D
D2. //future note here

D3. //future note here 


