plugins {
    // Apply the Kotlin JVM plugin
    kotlin("jvm") version "1.8.10" // Use the appropriate Kotlin version
    // Apply the application plugin to add support for building a CLI application
    application
}

group = "com.example.airquality" // Replace with your project's group ID
version = "1.0-SNAPSHOT"

repositories {
    // Use Maven Central repository to resolve dependencies
    mavenCentral()
}

dependencies {
    // Kotlin standard library for JVM
    implementation(kotlin("stdlib"))

    // Testing libraries
    testImplementation(kotlin("test")) // Kotlin test framework
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0") // JUnit 5 for unit testing
}

application {
    // Define the main class for the application
    mainClass.set("MainKt") // Replace with your main class if different
}

tasks.withType<Test> {
    // Use JUnit Platform for unit tests
    useJUnitPlatform()
}

java {
    // Specify the Java version compatibility
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11)) // Use Java 11 or your project's Java version
    }
}
