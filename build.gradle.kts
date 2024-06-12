plugins {
    jewel
    id("org.jetbrains.compose") version "1.6.20-dev1646"
    id("org.jetbrains.intellij.platform") version "2.0.0-beta6"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.12")
}

tasks {
//    whenTaskAdded {}
}
