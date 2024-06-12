plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    alias(libs.plugins.composeDesktop)
}

dependencies {
    api(project(":decorated-window"))
    api(project(":int-ui:int-ui-standalone"))
}
