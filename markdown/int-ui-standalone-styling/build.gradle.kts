plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    alias(libs.plugins.composeDesktop)
}
//
//dependencies {
//    api(project(":markdown:core"))
//    api(project(":int-ui:int-ui-standalone"))
//    compileOnly(project(":markdown:extension:gfm-alerts"))
//
//    testImplementation(compose.desktop.uiTestJUnit4)
//}
//
//publishing.publications.named<MavenPublication>("main") {
//    val ijpTarget = project.property("ijp.target") as String
//    artifactId = "jewel-markdown-${project.name}-$ijpTarget"
//}
