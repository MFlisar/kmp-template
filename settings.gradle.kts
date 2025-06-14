pluginManagement {

    // repositories for build
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        mavenLocal()
    }

}

dependencyResolutionManagement {

    // repositories for dependencies
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven("https://jitpack.io")
        mavenLocal()
    }

    versionCatalogs {
        create("kotlinx") {
            from(files("gradle/kotlinx.versions.toml"))
        }
        create("deps") {
            from(files("gradle/deps.versions.toml"))
        }
    }

}

include(":build-logic:shared")
project(":build-logic:shared").projectDir = file("library/modules/build-logic/shared")

include(":build-logic:plugin")
project(":build-logic:plugin").projectDir = file("library/modules/build-logic/plugin")

include(":scrips")
project(":scrips").projectDir = file("library/modules/scripts")