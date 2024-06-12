plugins {
    jewel
    alias(libs.plugins.composeDesktop)
    alias(libs.plugins.ideaGradlePlugin)
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
