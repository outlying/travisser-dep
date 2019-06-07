import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
    mavenCentral()
}

sourceSets["main"].withConvention(KotlinSourceSet::class) {
    kotlin.srcDir("src/main/kotlin")
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:3.4.1")
}