plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.detekt.gradlePlugin)
    implementation(libs.dokka.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.kotlinSarif)
    implementation(libs.kotlinpoet)
    implementation(libs.kotlinter.gradlePlugin)
    implementation(libs.kotlinx.binaryCompatValidator.gradlePlugin)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.poko.gradlePlugin)
}
