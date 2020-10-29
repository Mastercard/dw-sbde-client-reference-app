# SBDE API Reference Application

[![](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/Mastercard/loyalty-user-management-reference/blob/master/LICENSE)

## Table of Contents

- [Overview](#overview)
    * [Compatibility](#compatibility)
    * [References](#references)
    * [Tutorial](#tutorial)
    * [Frameworks](#frameworks)
- [Setup](#setup)
    * [Prerequisites](#prerequisites)
    * [Application Configuration](#configuration)
    * [Build and Execute](#build-and-execute)
    * [Reference Application Usage](#reference-application-usage)
    * [Integrating with OpenAPI Generator](#integrating-with-openapi-generator)
- [Use Cases](#use-cases)
    * [Merchant Location](#merchant-location)
    * [Merchant Daily Metrics](#merchant-daily-metrics)
    * [Merchant Performance Metrics](#merchant-performance-metrics)
- [API Reference](#api-reference)
- [Authentication](#authentication)
    * [Mastercard's OAuth Library](#oauth-library)
- [Glossary](#glossary)
- [Support](#support)
- [License](#license)
    

## Overview <a name="overview"></a>
This project showcases the use case of retrieving sbde metrics using the [SBDE API v2](https://developer.mastercard.com/documentation/small-business-decision-enhancer/2). This application illustrates connecting to the SBDE API using Mastercard's OAuth library. You will need a _consumer key_, _.p12 files_, and your _keystore alias and password_. This application is the output of a tutorial from sbde V2. 

### Compatibility <a name="compatibility"></a>
 * [Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) or later
 
### References <a name="references"></a>
* [Mastercard’s OAuth Signer library](https://github.com/Mastercard/oauth1-signer-java)
* [Using OAuth 1.0a to Access Mastercard APIs](https://developer.mastercard.com/platform/documentation/using-oauth-1a-to-access-mastercard-apis/)

### Tutorial <a name="tutorial"></a>
A tutorial can be found [here](https://developer.mastercard.com/small-business-decision-enhancer/documentation/2/tutorials-and-guides/) for setting up and using this service.

## Frameworks <a name="frameworks"></a>
- Spring
- OpenAPI Generator
- [Java 8+](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

## Setup <a name="frameworks-and-requirements"></a>

### Prerequisites <a name="prerequisites"></a>

* [Mastercard Developers Account](https://developer.mastercard.com/dashboard)
* A text editor or IDE
* [Java 8+](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
* [Apache Maven 3.3+](https://maven.apache.org/download.cgi)
* Set up the `JAVA_HOME` environment variable to match the location of your Java installation.

### Application Configuration <a name="configuration"> </a>
1. Create an account at [Mastercard Developers](https://developer.mastercard.com).
2. Create a new project and add the `SBDE` API to your project.
    * A zip file will be downloaded automatically with your keys.
3. Take note of the given **consumer key, keyalias, and keystore password** given upon the project creation.
4. Copy the downloaded `.p12` file to `/src/main/resources`.
5. Update the properties found in `src/main/java/com/mastercard/sbde/ApiService.java`.

```java
    private static final String API_BASE_PATH = "https://sandbox.api.mastercard.com/sbde/metrics-api";
    
    //Below properties will be required for authentication of API calls.
    private static final String CONSUMER_KEY = "Your consumer key"; // This refers to your consumer key. Copy it from "Keys" section on your project page in [Mastercard Developers](https://developer.mastercard.com/dashboard)
    private static final String SIGNING_KEY_ALIAS = "your key alias"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).
    private static final String SIGNING_KEY_FILE_PATH = "path to your.p12 private key file"; // This refers to .p12 file found in the signing key. Please place .p12 file at src\main\resources in the project folder and add classpath for .p12 file.
    private static final String SIGNING_KEY_PASSWORD = "your password"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).
```

### Build and Execute <a name="build-and-execute"> </a>
6. Run `mvn clean compile` from the root of the project directory.
    * When compile is run, the [OpenAPI Generator plugin](#integrating-with-openapi-generator) will generate the sources for connecting to the SBDE API.
7. run `mvn exec:java -Dexec.mainClass="com.mastercard.sbde.Main"` to run the project.

### Reference Application Usage <a name="reference-application-usage"></a>
- Select an endpoint from the dropdown menu at the top of the application
- Fill in the required parameters and click submit
- Click on 'JSON Response' to view the raw JSON returned by the API call 

### Integrating with OpenAPI Generator <a name="integrating-with-openapi-generator"></a>
[OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator) generates API client libraries from [OpenAPI Specs](https://github.com/OAI/OpenAPI-Specification). 
It provides generators and library templates for supporting multiple languages and frameworks.

See also:
* [OpenAPI Generator (maven Plugin)](https://mvnrepository.com/artifact/org.openapitools/openapi-generator-maven-plugin)
* [OpenAPI Generator (executable)](https://mvnrepository.com/artifact/org.openapitools/openapi-generator-cli)
* [CONFIG OPTIONS for java](https://github.com/OpenAPITools/openapi-generator/blob/master/docs/generators/java.md)

#### OpenAPI Generator Plugin Configuration
 
 ```xml
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
                <generateApiTests>false</generateApiTests>
                <generateModelTests>false</generateModelTests>
                <generatorName>java</generatorName>
                <configOptions>
                    <sourceFolder>src/gen/java/main</sourceFolder>
                    <dateLibrary>java8</dateLibrary>
                </configOptions>
            </configuration>
        </execution>
    </executions>
</plugin>
 ```

## Use Cases <a name="use-cases"></a>
These are the parameters used for the SBDE API. All parameters are optional.

| Name      | Type      | Default Value      | Purpose       |
|-----------|-----------|--------------------|---------------|
| from_date | string    | null               | Date in formation yyyy-MM-dd. Used as the most recent date to search for.
| to_date   | string    | null               | Date in formation yyyy-MM-dd. Used as the oldest date to search for.
| offset    | int       | 0                  | For Pagination; offset is used to offset the start of the list.        |
| limit     | int       | 25                 | For Pagination; limit is used to limit the number of entities returned |
| sort      | string    | +period            | Sorts the results + for ascending, - for descending and any property from the result. |

#### Merchant Location  <a name="merchant-location"></a>
> Get information on a specific merchant location. 

| URL       | Method        | Parameters        | Request Model | Response model|
|-----------|---------------|-------------------|---------------|---------------|
|/merchant-locations/{merchant_location_id}| GET | -    | int        | MerchantLocation |

### Merchant Daily Metrics <a name="merchant-daily-metrics"></a>
> Get a paginated list of all merchant location daily metrics.

| URL       | Method        | Parameters        | Request Model | Response model|
|-----------|---------------|-------------------|---------------|---------------|
|/merchant-locations/{merchant_location_id}/metrics/daily-metrics| GET | from_date, to_date, offset, limit, sort  | int    | MerchantLocationDailyMetrics |

### Merchant Performance Metrics <a name="merchant-performance-metricss"></a>
> Get a list of all merchant location performance metrics. 

| URL       | Method        | Parameters        | Request Model | Response model|
|-----------|---------------|-------------------|---------------|---------------|
|/merchant-locations/{merchant_location_id}/metrics/merchant-performance-metrics| GET | from_date, to_date, sort  | int    | MerchantLocationPerformanceMetrics |


## API Reference <a name="api-reference"></a>

See the [API Reference](https://developer.mastercard.com/small-business-decision-enhancer/2/documentation/api-reference/) page in the documentation. 

## Authentication <a name="authentication"></a>

### Mastercard oauth1 Signer Library <a name="oauth-library"></a>
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

See the code used in this application to utilize the library.
``` Java
Found in /src/java/ com.mastercard.sbde.ApiService

ApiClient client = new ApiClient();
        client.setBasePath(API_BASE_PATH); //If you use any other sandbox url then please add sbde/metrics-api as an extension
        client.setDebugging(true);

        List<Interceptor> interceptors = client.getHttpClient().networkInterceptors();
        interceptors.add(new Main.ForceJsonResponseInterceptor());
        interceptors.add(new OkHttp2OAuth1Interceptor(CONSUMER_KEY, signingKey));

        merchantLocationApi = new MerchantLocationApi(client);
        merchantLocationMetricsApi = new MerchantLocationMetricsApi(client);
        merchantLocationPerformanceMetricsApi = new MerchantLocationPerformanceMetricsApi(client);
```

## Support <a name="support"></a>
If you would like further information, please send an email to apisupport@mastercard.com

## License <a name="license"></a>
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 
       http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

**Copyright © 1994-2020, All Rights Reserved by Mastercard.**