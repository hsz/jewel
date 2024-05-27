plugins {
    jewel
    alias(libs.plugins.composeDesktop)
    alias(libs.plugins.ideaGradlePlugin)
    `android-studio-releases-generator`
}

repositories {
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        bundledPlugins("org.jetbrains.kotlin")
    }

    implementation(projects.ideLafBridge) {
        exclude(group = "org.jetbrains.kotlinx")
    }

    implementation(projects.markdown.ideLafBridgeStyling) {
        exclude(group = "org.jetbrains.kotlinx")
    }

    implementation(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material")
        exclude(group = "org.jetbrains.kotlinx")
    }
}

intellijPlatform {
    pluginConfiguration { name = "Jewel Demo" }
    version = libs.versions.idea.get()
}

tasks {
    // We don't have any settings in the demo plugin
    buildSearchableOptions {
        enabled = false
    }

    runIde {
        systemProperties["org.jetbrains.jewel.debug"] = "true"
    }
}
