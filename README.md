# JavaUtils

## 1. Import

[![](https://jitpack.io/v/alexsgi/JavaUtils.svg)](https://jitpack.io/#alexsgi/JavaUtils) [![](https://jitci.com/gh/alexsgi/JavaUtils/svg)](https://jitci.com/gh/alexsgi/JavaUtils)

Gradle:
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
Maven:
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

###  Mathematical functions :
```java
double sum = AdvMath.sum(double... numbers);
```
```java
double sum = AdvMath.sum(5,5,4,1,9);
```
→ sum = 24
```java
double product = AdvMath.product(double... numbers);
```
```java
double product = AdvMath.product(5,5,4,1,9);
```
→ product = 900
