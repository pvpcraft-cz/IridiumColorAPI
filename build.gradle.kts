plugins {
    java
    `maven-publish`
}

group = "com.iridium"
version = "1.0.7"
description = "IridiumColorAPI"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    maven("https://repo.rosewooddev.io/repository/public/")
    mavenCentral()
}

dependencies {
    implementation("org.spigotmc:spigot:1.17.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation("org.mockito:mockito-inline:4.5.1")
    testImplementation("org.mockito:mockito-junit-jupiter:4.5.1")
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }

    repositories {
        maven {
            url = uri("https://repo.pvpcraft.cz/releases/")
            credentials {
                username = "xxxxxxxxxxxxxxxxxxxxxx"
                password = "xxxxxxxxxxxxxxxxxxxxxx"
            }
        }
    }
}

tasks {
    build {
        dependsOn(test)
    }

    test {
        useJUnitPlatform()
        setForkEvery(1)
    }
}