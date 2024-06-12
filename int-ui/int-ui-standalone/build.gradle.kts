plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    alias(libs.plugins.composeDesktop)
    `intellij-theme-generator`
}

dependencies { api(project(":ui")) }

//intelliJThemeGenerator {
//    val targetIdeaVersion = "241.9959"
//    register("intUiLight") {
//        themeClassName = "org.jetbrains.jewel.intui.core.theme.IntUiLightTheme"
//        themeFile = "platform/platform-resources/src/themes/expUI/expUI_light.theme.json"
//        ideaVersion = targetIdeaVersion
//    }
//    register("intUiDark") {
//        themeClassName = "org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme"
//        themeFile = "platform/platform-resources/src/themes/expUI/expUI_dark.theme.json"
//        ideaVersion = targetIdeaVersion
//    }
//}
//
//tasks {
//    named("dokkaHtml") {
//        dependsOn("generateIntUiDarkTheme")
//        dependsOn("generateIntUiLightTheme")
//    }
//
//    named<Jar>("sourcesJar") {
//        dependsOn("generateIntUiDarkTheme")
//        dependsOn("generateIntUiLightTheme")
//        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
//    }
//}
