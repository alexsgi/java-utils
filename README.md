

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
	implementation 'com.github.alexsgi:java-utils:VERSION'
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
	    <version>VERSION</version>
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
---

### UI - Screenshot :
Take a screenshot (PNG):
```
AdvImage.takeScreenshot(File nameOfTheScreenshot);
```
```java
File file = new File("C:\\Users\\Public\\Desktop\\screenshot.png");
System.out.println(file.exists());
AdvImage.takeScreenshot(file);
System.out.println(file.exists());
```
Output :
```java
false
true
```
You like JPEG ?
```
AdvImage.takeJPEGScreenshot(File nameOfTheScreenshot);
```
By the way : it returns a File object ! (normally not important)

You want to take multiple screenshots ?
```
AdvImage.takeScrenshots(File path, int amount, int delay);
AdvImage.takeScrenshots(File path, int amount, int delay, boolean inNewThread);
```
Important : the input file needs to be a directory !

---

### Run something parallel :
```java
ParallelTask.runParallel(Runnable runnable, CommandCallback callback);
```
This creates a new thread and starts it.

---

**Create many threads with the same runnable** :
```java
MultiThreads.createThreads(Runnable runnable, int amountOfThreads);
```
Start all those Threads :
```java
MultiThreads.startThreads();
```
Interrupt all Threads :
```java
MultiThreads.interruptThreads();
```
Clear all Threads :
```java
MultiThreads.clearThreads();
```
Get current amount of Threads :
```java
int amount = MultiThreads.getThreadAmount();
```
---
Some tools for Strings :

Check if a String contains **at least one** of the params :
```java
StringUtils.containsOneOf(String src, String... params);
```
Check if a String contains **all** of the params :
```java
StringUtils.containsAll(String src, String... params)
```
---
