plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    alias(libs.plugins.composeDesktop)
}
//
//dependencies {
//    api(project(":markdown:core"))
//    api(project(":ide-laf-bridge"))
//    compileOnly(project(":markdown:extension:gfm-alerts"))
//    compileOnly(libs.bundles.idea)
//
//    testImplementation(compose.desktop.uiTestJUnit4)
//}
//
//publishing.publications.named<MavenPublication>("main") {
//    val ijpTarget = project.property("ijp.target") as String
//    artifactId = "jewel-markdown-${project.name}-$ijpTarget"
//}
