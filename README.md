# JavaUtils
![CI](https://github.com/alexsgi/java-utils/actions/workflows/maven.yml/badge.svg)
[![](https://jitpack.io/v/alexsgi/java-utils.svg)](https://jitpack.io/#alexsgi/java-utils)
[![GitHub Release](https://img.shields.io/github/release/alexsgi/java-utils.svg?style=flat)]()


JavaUtils is a small library to ease programming with Java.

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

## 2. Features

### Time-oriented functions :

Run something delayed:

 ```java
FutureTaskExecutor.runDelayed(Runnable runnable, int delayInMilliSeconds);
```

 ```java
FutureTaskExecutor.runDelayed(new Runnable(){
    @Override
    public void run(){
        System.out.println("This message will be printed after 5000 ms");
    }
}, 5000);
```

____________________

```java
FutureTaskExecutor.runDelayed(Runnable runnable, int delayInMilliSeconds, boolean isTerminable);
```

```isTerminable``` : (default: **false**) if set to false, the timer will stop properly on finish of the runnable,
otherwise (if set to **true**) the timer can be interrupted (e.g. by the main method).

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

### System :

Get all drives :

```java
Drive[] drives = SystemInfo.getAllDrives();
for(Drive drive : drives){
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
```

JPEG screenshots:

```
AdvImage.takeJPEGScreenshot(File nameOfTheScreenshot);
```
You want to take multiple screenshots?
```
AdvImage.takeScrenshots(File path, int amount, int delay);
AdvImage.takeScrenshots(File path, int amount, int delay, boolean inNewThread);
```

Notice: the input file needs to be a directory 

---

**Create many threads with the same runnable** :

```java
MultiThreads.createThreads(Runnable runnable, int amountOfThreads);
```

Start all threads :

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
