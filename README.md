
# JavaUtils

[![](https://jitpack.io/v/alexsgi/java-utils.svg)](https://jitpack.io/#alexsgi/java-utils)

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
	implementation 'com.github.alexsgi:java-utils:2.1'
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
	    <artifactId>java-utils</artifactId>
	    <version>2.1</version>
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

---

###  Mathematical functions :
Standard:
```java
class AdvMath {
	double sum(double... summands);
	double difference(double minuend, double... subtrahents);
	double product(double... factors);
	double quotient(double dividend, double... divisors);

	BigDecimal bigSum(BigDecimal... summands);
	BigDecimal bigDifference(BigDecimal minuend, BigDecimal... subtrahents);
	BigDecimal bigProduct(BigDecimal... factors);
	BigDecimal bigQuotient(BigDecimal dividend, BigDecimal... divisors);
}
```
There are many other functions - just try it out !

---
### Cryptography :
SHA2-512:
```java
String sha2_512Hashed = Cryptography.hashSHA2("Example text");
```
SHA3-512:
```java
String sha3_512Hashed = Cryptography.hashSHA3("Example");
```
Base64-Encoding:
```java
String base64Encoded = Cryptography.base64Encryption("Example of the example");
```
Change the hash length (default: 512) :
```java
Cryptography.setHashLength(int hashLength);
```
```java
Cryptography.setHashLength(256);
```
Get the hash length :
```java
int hashLength = Cryptography.getHashLength();
```
Reset the hash length (default: 512) :
```java
Cryptography.resetHashLength();
```
---

### Properties :
Load properties from file :
```java
Properties properties = PropertyManager.loadFromFile(new File("config.properties");
```
Store properties object in file :
```java
PropertyManager.storeInFile(properties, new File("newConfig.properties"));
```
---

### System :
Get all drives :
```java
Drive[] drives = SystemInfo.getAllDrives();
for(Drive drive : drives) {
    System.out.println(drive.getDriveName());
    System.out.println(drive.getDriveLetter());
    System.out.println(drive.getDriveDescription());
}
```
---

### Color :
Change the text color or even the background color via ANSI codes :
```java
String textFormatted = TextColor.formatColor(String input, String color);
String backgroundFormatted = TextColor.formatBackground(String input, String backgroundColor);
String bothFormated = TextColor.formatColors(String input, String color, String backgroundColor);
```
Following options are available :
```java
RESET

BLACK
RED
GREEN
YELLOW
BLUE
PURPLE
CYAN
WHITE

BLACK_BACKGROUND
RED_BACKGROUND
GREEN_BACKGROUND
YELLOW_BACKGROUND
BLUE_BACKGROUND
PURPLE_BACKGROUND
CYAN_BACKGROUND
WHITE_BACKGROUND
```
Example :
```java
TextColor.formatColor("Example", TextColor.CYAN);
TextColor.formatBackground("Example", TextColor.CYAN_BACKGROUND);
TextColor.formatColors("Example", TextColor.CYAN, TextColor.CYAN_BACKGROUND);
```
