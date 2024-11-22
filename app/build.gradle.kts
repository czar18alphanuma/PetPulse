plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 34  // Ensure your compileSdk is set to a valid version

    defaultConfig {
        applicationId = "com.example.petpulse"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    namespace = "com.example.petpulse"  // Define the namespace

    // Make sure both Kotlin and Java are targeting the same JVM version
    kotlinOptions {
        jvmTarget = "1.8"  // Set Kotlin JVM target to 1.8
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    // Enable Jetpack Compose
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"  // Make sure you have a compatible version
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.core:core-ktx:1.12.0")

    // Jetpack Compose dependencies
    implementation("androidx.compose.ui:ui:1.5.2")
    implementation("androidx.compose.material3:material3:1.0.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.2")
    implementation("androidx.compose.runtime:runtime-livedata:1.5.2")
    implementation("androidx.compose.foundation:foundation:1.5.2")

    // Kotlin dependencies
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.10")
}