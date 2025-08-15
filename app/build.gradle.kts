// app/build.gradle.kts (Nivel de Módulo App)

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")

    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.lt.ecommerceappmvvm"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.lt.ecommerceappmvvm"
        minSdk = 25
        targetSdk = 35
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
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        // La versión del compilador de Compose suele estar ligada a la versión de Kotlin.
        // Revisa la tabla de compatibilidad de Compose y Kotlin.
        // https://developer.android.com/jetpack/androidx/releases/compose-kotlin
        // Por ejemplo, para Kotlin 1.9.22, podrías usar una versión como "1.5.8"
        kotlinCompilerExtensionVersion = "1.5.8" // Ajusta esta versión!
    }
}

dependencies {
    // Versión de Hilt (debe coincidir con la del plugin en el archivo de proyecto)
    val hiltVersion = "2.49"

    // Core AndroidX
    implementation("androidx.core:core-ktx:1.13.1") // Última estable
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.3") // Última estable
    implementation("androidx.activity:activity-compose:1.9.1") // Última estable

    // Compose
    val composeBomVersion = "2024.06.00" // BOM para manejar versiones de Compose
    implementation(platform("androidx.compose:compose-bom:$composeBomVersion"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3") // Material 3
    implementation("androidx.compose.material:material")   // Material 2 (si aún la necesitas o alguna lib la trae)

    // Navigation Compose
    implementation("androidx.navigation:navigation-compose:2.7.7") // Última estable

    // Hilt
    implementation("com.google.dagger:hilt-android:$hiltVersion")
    ksp("com.google.dagger:hilt-android-compiler:$hiltVersion")

    // Dependencias de Test
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:$composeBomVersion"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    implementation("com.google.dagger:hilt-android:$hiltVersion")
    ksp("com.google.dagger:hilt-android-compiler:$hiltVersion")

}
