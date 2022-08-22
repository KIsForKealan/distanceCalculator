### Start

> Begin the application by running the main method in *DistanceCalculatorApplication.java*  
> The app will be available on *http://localhost:8080*

### Goal

> Make a web service that accepts two distances (numbers) and returns the total distance (sum of both).

### Specifications:

> - For each of the two distances, the requester can specify a unit, either Meters or Yards. 
> - Also, for the returned total distance, the requester must specify a unit as well.<br>
>  
> *For example, the request could be 3 Yards + 5 Meters = ... Meters, and the response would be 7.74 Meters.*

### Acceptance Criteria

> As an anonymous user running the application, I can POST two distances of type...
> - - undefined units (defaults to meters) + undefined units (defaults to meters)
> - - undefined units (defaults to meters) + specified meters
> - - undefined units (defaults to meters) + specified yards
> - - specified meters + specified meters 
> - - specified yards + specified yards
> - - specified meters + specified yards
> 
> The application service will return a journey distance object composed of the two distances and their respective units

### Initial Approach & Concerns

> - Back-end : Java & Spring (IntelliJ IDEA, REST-ful API)  
> - Front-end : Javascript / Typescript & React (Visual Studio Code, SPA)
> - Distance objects with value and unit attributes
> - POST requests to API
> - Enums for units of distance
> - Constants for conversion calculations
> - Interfaces for abstractions
> - Default to meters
> - Calculate to 5 decimal places for accuracy
> - Display to 2 decimal places for user convenience

### Extensibility Options

> - Separate conversion functionality
> - Adding other calculations (subtraction)
> - Adding other properties to distance entities (name, geo-location, calories, price)
> - Adding more unit type options (inches, kilometers)
> - Adding more distances per calculation (Lists of 100+ distances in a journey like a GPS)
> - Handling more complex data - hooking into Google Maps api, matrix routing etc.
> - Vertical and diagonal concerns (hills, sea level)
> - Adding distance covered type (walking, car, bike, plane)
> - Adding User login functionality and saving journeys / distances
> - Using persistence layer (database)
> - Scalability (hosting, load balancing, message queues, coroutines)
> - Testing frameworks, mocking, integration, stress and load