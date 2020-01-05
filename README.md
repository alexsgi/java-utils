
# JavaUtils

[![](https://jitpack.io/v/alexsgi/JavaUtils.svg)](https://jitpack.io/#alexsgi/JavaUtils) [![](https://jitci.com/gh/alexsgi/JavaUtils/svg)](https://jitci.com/gh/alexsgi/JavaUtils)

## 1. Import

**Gradle:**
```gradle
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```
```gradle
dependencies {
	implementation 'com.github.alexsgi:JavaUtils:1.0'
}
```
**Maven:**
```maven
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```
```maven
<dependencies>
	<dependency>
	    <groupId>com.github.alexsgi</groupId>
	    <artifactId>JavaUtils</artifactId>
	    <version>1.0</version>
	</dependency>
</dependencies>
```
(Instead of "1.0" you can insert every available version → check under "releases").

## 2. Usage

 ###  Time-oriented functions :
 
 Run something delayed:
 ```java
FutureTaskExecutor.runDelayed(Runnable runnable, int delayInMilliSeconds);
```
 ```java
FutureTaskExecutor.runDelayed(new Runnable() {
	@Override
    public void run() {
	    System.out.println("Message");
    }
}, 5000);
```
____________________
```java
FutureTaskExecutor.runDelayed(Runnable runnable, int delayInMilliSeconds, boolean isTerminable);
```
```isTerminable``` : (default: **false**) if set to false, the timer will stop properly on finish of the runnable, otherwise (if set to **true**) the timer can be interrupted (e.g. by the main method).

---

###  Mathematical functions :
Standard:
```java
double sum(double... summands);
double difference(double minuend, double... subtrahents);
double product(double... factors);
double quotient(double dividend, double... divisors);
```
Advanced:
```java
BigDecimal bigSum(BigDecimal... summands);
BigDecimal bigDifference(BigDecimal minuend, BigDecimal... subtrahents);
BigDecimal bigProduct(BigDecimal... factors);
BigDecimal bigQuotient(BigDecimal dividend, BigDecimal... divisors);
```
---
