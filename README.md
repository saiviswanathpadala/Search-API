# Makersharks Assessment

## Project Architecture

![IDE7](https://github.com/saiviswanathpadala/Search-API/blob/main/OUTPUT%20SNAPS/IDE7.jpg)

## Sample cURL Commands
This API allows users to search for suppliers based on specific criteria like location, nature of business, and manufacturing processes.

## Endpoints

### 1. Query Suppliers
#### Endpoint: `/api/supplier/query`
#### Method: `POST`

Retrieve a list of suppliers that match the given criteria.

**Example cURL Command:**

```bash
curl -X POST "http://localhost:8080/api/supplier/query" \
-H "Content-Type: application/x-www-form-urlencoded" \
-d "location=India" \
-d "natureOfBusiness=small_scale" \
-d "manufacturingProcesses=3d_printing" \
-d "page=0" \
-d "size=10"


## Project SnapShots


### In the resources directory, open application.properties and configure the H2 database
![IDE0](https://github.com/saiviswanathpadala/Search-API/blob/main/OUTPUT%20SNAPS/IDE0.jpg)

### Open your IDE and navigate to the main class "SupplierSearchApplication" (located in the com.markersharks.suppliersearch package).
![IDE1](https://github.com/saiviswanathpadala/Search-API/blob/main/OUTPUT%20SNAPS/IDE1.jpg)

### Right-click on the main class and select Run or click the green run button in your IDE.
### Once the application is running, you should see the following in the console output
![IDE2](https://github.com/saiviswanathpadala/Search-API/blob/main/OUTPUT%20SNAPS/IDE2.jpg)

### This means your Spring Boot application is running on http://localhost:8080
![IDE3](https://github.com/saiviswanathpadala/Search-API/blob/main/OUTPUT%20SNAPS/IDE3.jpg)

### Open your browser and go to http://localhost:8080/h2-console
![IDE4](https://github.com/saiviswanathpadala/Search-API/blob/main/OUTPUT%20SNAPS/IDE4.jpg)

### In the H2 Console, execute SQL statements to insert sample data into the "Supplier" table:
![IDE5](https://github.com/saiviswanathpadala/Search-API/blob/main/OUTPUT%20SNAPS/IDE5.jpg)

### We can also retrive the data from the table via Console or POSTMAN
![IDE6](https://github.com/saiviswanathpadala/Search-API/blob/main/OUTPUT%20SNAPS/IDE6.jpg)

# Run the Application
### Run the Spring Boot application.
### Open the H2 console at http://localhost:8080/h2-console and check the in-memory database.
### Test the API using Postman
