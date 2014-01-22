Dailymotion Java SDK
====================

This repository is NOT an official Java SDK, but allows you to access the Dailymotion
API from your website.

Usage
-----

### 1. Maven dependency

The Dailymotion Java SDK uses Maven as base project. You can import the client using the following code :

    <dependency>
        <groupId>com.bc.dailymotion</groupId>
        <artifactId>dailymotion-sdk-client</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>

### 2. Spring version

The project uses spring4, and implements a basic client. You can inject the class that defines the methods to call the API.
It as simple as the following lines of code :

#### 2.1 Bean injection using annotations

    @Inject
    @Qualifier("dailymotionClient")
    private DailymotionClient dailymotionClient;

#### 2.2 Bean injection using xml configuration

    <bean name="dailymotionClient" class="com.bc.dailymotion.client.impl.DailymotionClientImpl" />

    <bean id="mySpringBeanWithDependency" class="testbean.MySpringBeanWithDependency">
        <property name="client" ref="dailymotionClient" />
    </bean>

#### 2.3 Configuration

The configuration is based on map configuration with properties overrides.
To modify the API configuration, you need to define a file named dailymotionClient.properties and the following configuration :

    dailymotion.api.url=https://api.dailymotion.com/
    dailymotion.api.timeout=5000
    dailymotion.api.useProxy=false
    dailymotion.api.proxyHost=my.super.proxy
    dailymotion.api.proxyPort=8080

    dailymotion.auth.username=my.super.username
    dailymotion.auth.password=my.super.password
    dailymotion.auth.clientId=my.super.clientId
    dailymotion.auth.clientSecret=my.super.clientSecret
    dailymotion.auth.scheme=OAuth

### 3. Non-spring version

To be developped soon ;)

### 4. Authentication

The Dailymotion API requires OAuth 2.0 authentication in order to be used. This library implements
three granting methods of OAuth 2.0 for different kind of usages.

Feedback
--------

We are relying on the [GitHub issues tracker][issues] linked from above for feedback. File bugs or
other issues [here][issues].

[issues]: http://github.com/bcecchinato/dailymotion-sdk-java/issues

Continuous integration
----------------------

![ScreenShot](https://secure.travis-ci.org/bcecchinato/dailymotion-sdk-java.png?branch=master)
