# SBDE API Reference Application
This project showcases the use case of retrieving merchant data from small business decision enhancer API [here](https://developer.mastercard.com/product/small-business-decision-enhancer)

## Frameworks Used
-java 1.8
-maven 3.6.1

## Requirements
- Java 8
- [Maven](https://maven.apache.org/download.cgi)

## Author
[Enterprise Data Services](mailto:apisupport@mastercard.com)

## Setup
1. Create an account at [Mastercard Developers](https://developer.mastercard.com).
2. Create a new project and add the `SBDE` API to your project. A `.p12` file is downloaded automatically.
3. Take note of the given **consumer key, keyalias, and keystore password** given upon the project creation.
4. Copy the downloaded `.p12` file to `/src/main/resources`.
5. Update the properties found under `/src/main/resources/application.properties`.
6. Run `mvn clean install` from the root of the project directory.
7. run `java -jar sbde-java-client.jar` to start the project.
8. Navigate to `http://localhost:8080/` in your browser.
9. Start hitting endpoints! Sample parameters have been included in the fields automatically.

## Tutorial
A tutorial can be found [here](https://developer.mastercard.com/documentation/small-business-decision-enhancer) 
for setting up and using this service.

## Mastercard oauth1 Signer
This dependency is required to properly call the API.
```xml
<dependency>
			<groupId>com.mastercard.api</groupId>
			<artifactId>small-business-decision-enhancer</artifactId>
			<version>1.0.0</version>
</dependency>
```

[Looking for other languages?](https://github.com/Mastercard?q=oauth&type=&language=)

## SBDE Client Library
The client library used to generate the API Calls and object models for this application can be seen in the pom.xml file
in the project's root directory.

    

## API Usage
Get Merchant data based on Merchant location ID (MMHID)
The endpoint(MMHID) provide the merchant information.
The merchant information that can be obtained using this API are listed here 
(https://developer.mastercard.com/documentation/small-business-decision-enhancer/v1#api_merchant_performance)


## License
[MIT licence](https://opensource.org/licenses/MIT)

## Glossary
|Acronym    | Meaning   |
|----------|-----------|
|MMHID    | Merchant Hierarchy ID

**Copyright © 1994-2020, All Right Reserved by Mastercard.**