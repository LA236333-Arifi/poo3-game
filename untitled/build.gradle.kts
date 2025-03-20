plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.googlecode.lanterna:lanterna:3.1.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.4.2")
    implementation("org.mongodb:mongodb-driver-sync:4.10.1")
}

tasks.test {
    useJUnitPlatform()
}