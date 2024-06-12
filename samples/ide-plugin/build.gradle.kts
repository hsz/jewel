plugins {
    jewel
    alias(libs.plugins.composeDesktop)
    alias(libs.plugins.ideaGradlePlugin)
}

dependencies {
    implementation("junit:junit:4.12")
}

tasks {
//    whenTaskAdded {}
}
