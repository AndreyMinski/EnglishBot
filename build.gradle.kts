plugins {
    id("org.springframework.boot").version("2.4.4")
    id("io.spring.dependency-management").version("1.0.11.RELEASE")
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.telegram:telegrambots:5.2.0")
}
