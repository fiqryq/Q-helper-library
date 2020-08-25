## Q Helper Library
![Android CI](https://github.com/fiqryq/Q-helper-library/workflows/Android%20CI/badge.svg)
[![](https://jitpack.io/v/fiqryq/Q-helper-library.svg)](https://jitpack.io/#fiqryq/Q-helper-library)

This library contains several functions that are ready to use.

## Version Release
Under Devlopment
```
$version_release = v0.1-beta
```

## Features
- Date Format

## Adding Qhelper to your project
Add the following to your module's build.gradle file:

**Step 1.** Add the JitPack repository to your build file
```gradle
   allprojects {
   		repositories {
   			...
   			maven { url 'https://jitpack.io' }
   		}
   	}
```

**Step 2.** Add the dependency
```gradle
   dependencies {
   	  implementation 'com.github.fiqryq:Q-helper-library:$version_release'
   	}
```

## Usage
**Date Format :**
Listing of countries with their preferred date formats [here](https://github.com/fiqryq/Q-helper-library/blob/master/doc/country_date_formats.csv)

```java
 // Get hour,day and Month
 HelpDateFormat.getTimeNow("language","country");

 // Get name day today
 HelpDateFormat.getNameDay("language","country");

// Get month
 HelpDateFormat.getHour("language","country");

 // Get hour
 HelpDateFormat.getHour();
```