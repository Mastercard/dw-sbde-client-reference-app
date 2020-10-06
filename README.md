# SBDE API Reference Application
This project showcases the use case of retrieving merchant metrics using the SBDE API [here](https://developer.mastercard.com/drafts/small-business-decision-enhancer-v2/new-sbde-v2-documentation/documentation/)

## Frameworks Used
- Spring
- OpenAPI Generator

## Requirements
- Java 8
- [Maven](https://maven.apache.org/download.cgi)

## Author
[Enterprise Data Services](mailto:apisupport@mastercard.com)

## Setup
1. Create an account at [Mastercard Developers](https://developer.mastercard.com).
2. Create a new project and add the `Small Business Decision Enhancer` API to your project. A `.p12` file is downloaded automatically.
3. Take note of the given **consumer key, keyalias, and keystore password** given upon the project creation.
4. Copy the downloaded `.p12` file to `/src/main/resources`.
5. Copy the small-business-decision.yaml file to `/src/main/resources`.
6. Update the pom.xml with with open-api-generator dependencies.
7. Run `mvn clean install` from the root of the project directory.
8. Add `sbde/metrics-api` as an extension to the sandbox url.


## Tutorial
A tutorial can be found [here](https://developer.mastercard.com/drafts/small-business-decision-enhancer-v2/new-sbde-v2-documentation/documentation/tutorials-and-guides/) 
for setting up and using this service.

## Mastercard oauth1 Signer
This dependency is required to properly call the API.
```xml
<dependency>
    <groupId>com.mastercard.developer</groupId>
    <artifactId>oauth1-signer</artifactId>
    <version>1.2.3</version>
</dependency>
```
[Link to the oauth1 library's Github](https://github.com/Mastercard/oauth1-signer-java)

[Looking for other languages?](https://github.com/Mastercard?q=oauth&type=&language=)

## SBDE Client Library
The client library used to generate the API Calls and object models for this application can be seen in the pom.xml file
in the project's root directory.
```xml
<plugins>
            <plugin>
                <groupId>org.openapitools</groupId>
                <artifactId>openapi-generator-maven-plugin</artifactId>
                <version>3.3.4</version>
                <executions>
                    <execution>
                        <id> Small Business Decision Enhancer 2.0 REST Client</id>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <inputSpec>${project.basedir}/src/main/resources/small-business-decision-enhancer.yaml</inputSpec>
                            <generatorName>java</generatorName>
                            <!-- No "library" element here means the plugin will use the default library template ("okhttp-gson") -->
                            <configOptions>
                                <sourceFolder>src/gen/java/main</sourceFolder>
                                <dateLibrary>java8</dateLibrary>
                            </configOptions>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
```
    
For more information on how this client generator works please consult the official [Github repository](https://github.com/OpenAPITools/openapi-generator)

## Reference Application Usage
You make the API call by calling getMerchantLocationByMerchantLocationId, getMerchantLocationDailyMetricsByMerchantLocationId, 
getPerformanceMetricsByMerchantLocationId, and then store the response in a paymentResponse object. 
Once you have the response stored, you have a couple of options, but for this reference app you can simply use toString to print the body.

## API Usage
SBDE can provide daily, weekly, monthly, and yearly transaction sales data up to 3 years to aid in the lending decision. The KPIs provide views of business performance, spend volatility, and customer behaviors. 
It also provides insights to clients looking to improve their business across multiple locations.

The endpoints `merchant-locations/{merchant_location_id` , `/merchant-locations/{merchant_location_id}/metrics/monthly-metrics` , `/merchant-locations/{merchant_location_id}/metrics/weekly-metrics`,
 `/merchant-locations/{merchant_location_id}/metrics/merchant-performance-metrics`, `/merchant-locations/{merchant_location_id}/metrics/yearly-metrics` and `/merchant-locations/{merchant_location_id}/metrics/daily-metrics` 
provide the details for the code you provide.

`merchant-locations/{merchant_location_id}` endpoint will retrieve merchant core date from merchant location id.



## License
[Apache 2 License](https://apache.org/licenses/LICENSE-2.0)



**Copyright © 1994-2020, All Right Reserved by Mastercard.**