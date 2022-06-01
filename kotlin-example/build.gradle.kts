plugins {
    java
    kotlin("jvm") version "1.6.21"
    `maven-publish`
}

group = "org.luovuutesi"
version = "0.0.1"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.luovuutesi:luovuutesi-api:master-SNAPSHOT")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group as String
            artifactId = rootProject.name
            version = project.version as String

            from(components["java"])
        }
    }
}