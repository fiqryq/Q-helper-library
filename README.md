## Q Helper Library
![Android CI](https://github.com/fiqryq/Q-helper-library/workflows/Android%20CI/badge.svg)
[![](https://jitpack.io/v/fiqryq/Q-helper-library.svg)](https://jitpack.io/#fiqryq/Q-helper-library)

desc latter. :p

## Version Release
Under Devlopment
```
$version_release = v0.1-beta
```

## Features
- Date Format

## Adding Qhelper to your project
Add the following to your module's build.gradle file:

Step 1. Add the JitPack repository to your build file
```gradle
   allprojects {
   		repositories {
   			...
   			maven { url 'https://jitpack.io' }
   		}
   	}
```

Step 2. Add the dependency
```gradle
   dependencies {
   	        implementation 'com.github.fiqryq:Q-helper-library:$version_release'
   	}
```

## Usage
```java
 // Date Format :
 // Get hour,day and Month
 HelpDateFormat.getTimeNow();

 // Get name day today
 HelpDateFormat.getNameDay();

 // Get hour
 HelpDateFormat.getHour();

 // Get month
 HelpDateFormat.getHour();
```