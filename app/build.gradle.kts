plugins {
    alias(libs.plugins.androidApplication)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.realtime"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.realtime"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true

    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.messaging)
    implementation(libs.firebase.database)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //Scalable Size Unit (support different screen sizes
    // https://mvnrepository.com/artifact/com.intuit.sdp/sdp-android
    runtimeOnly("com.intuit.sdp:sdp-android:1.1.0")
    // https://mvnrepository.com/artifact/com.intuit.ssp/ssp-android
    runtimeOnly("com.intuit.ssp:ssp-android:1.1.0")

    //Rounded ImageView
    // https://mvnrepository.com/artifact/com.makeramen/roundedimageview
    implementation("com.makeramen:roundedimageview:2.3.0")

    implementation(platform("com.google.firebase:firebase-bom:32.7.4"))
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-firestore")
}