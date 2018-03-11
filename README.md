# Telegram Bot Models  
![Telegram API](https://img.shields.io/badge/Telegram%20API-3.6-blue.svg)

Direct wrapper around Telegram JSON objects from the [Bot API](https://core.telegram.org/bots) 

This repository contains POJOs (actually [Kotlin data classes](https://kotlinlang.org/docs/reference/data-classes.html)) 
that maps to Telegram JSON objects as described in the [official documentation](https://core.telegram.org/bots/api)

## Installation

Artifacts are distributed through [JitPack](https://jitpack.io/#wirelib/telegram-models).

### Add repository
#### Gradle

```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

#### Maven

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

### Define dependency
#### Gradle

```groovy
dependencies {
    compile 'com.github.wirelib:telegram-models:3.6'
}
```

#### Maven
```xml
<dependency>
    <groupId>com.github.wirelib</groupId>
    <artifactId>telegram-models</artifactId>
    <version>3.6</version>
</dependency>
```
