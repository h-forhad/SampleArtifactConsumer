import org.apache.tools.ant.util.JavaEnvUtils.VERSION_11

plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.compose)
}

android {
  namespace = "com.mdc.android.poc.SampleArtifactConsumer"
  compileSdk = 35

  defaultConfig {
    applicationId = "com.mdc.android.poc.SampleArtifactConsumer"
    minSdk = 34
    targetSdk = 35
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }

  kotlinOptions {
    jvmTarget = "11"
  }

  buildFeatures {
    compose = true
  }

  buildToolsVersion = "35"
}

dependencies {

  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.lifecycle.runtime.ktx)
  implementation(libs.androidx.activity.compose)
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.ui)
  implementation(libs.androidx.ui.graphics)
  implementation(libs.androidx.ui.tooling.preview)
  implementation(libs.androidx.material3)
  implementation("androidx.compose.material:material:1.4.8")
  implementation("com.google.android.material:material:1.11.0")// Use the latest version
  implementation("androidx.appcompat:appcompat:1.4.0")

  implementation("com.motorolasolutions.android.poc.artifact:core:0.0.4")
  implementation("com.motorolasolutions.android.poc.artifact:tasks:0.0.3")
  implementation("com.motorolasolutions.android.poc.artifact:search:0.0.4")

}