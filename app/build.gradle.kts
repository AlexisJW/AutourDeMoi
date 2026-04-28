plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.alexis.autourdemoi"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.alexis.autourdemoi"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        buildConfig = true
    }
}

val openTripMapApiKey: String = project.findProperty("OPENTRIPMAP_API_KEY") as String? ?: ""
android.defaultConfig.buildConfigField("String", "OPENTRIPMAP_API_KEY", "\"$openTripMapApiKey\"")

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Lifecycle
    implementation(libs.lifecycle.viewmodel)
    implementation(libs.lifecycle.livedata)

    // Room
    implementation(libs.room.runtime)
    annotationProcessor(libs.room.compiler)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.logging.interceptor)

    // Google Maps & Location
    implementation(libs.play.services.maps)
    implementation(libs.play.services.location)

    // RecyclerView
    implementation(libs.recyclerview)

    // Glide
    implementation(libs.glide)
}