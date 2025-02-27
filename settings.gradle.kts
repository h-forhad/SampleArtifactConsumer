pluginManagement {
  repositories {
    google {
      content {
        includeGroupByRegex("com\\.android.*")
        includeGroupByRegex("com\\.google.*")
        includeGroupByRegex("androidx.*")
      }
    }
    mavenCentral()
    gradlePluginPortal()

  }
}
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()

    maven {
      url = uri("https://artifactory.mot-solutions.com/artifactory/mdc_pscore-gradle-local")

      credentials {
        username = "ARTFACTORY_USERNAME"
        password = "ARTIFACTORY_ACCESS_TOKEN"
      }
    }
  }
}

rootProject.name = "SampleArtifactConsumer"
include(":app")
 