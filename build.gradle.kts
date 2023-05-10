plugins {
    id("java") //Tells gradle that this is a java project
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral() //Respositories from where to download the code from, other examples - bintray,
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<Jar>{
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}
