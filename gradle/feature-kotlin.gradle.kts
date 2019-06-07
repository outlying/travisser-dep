import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {

    repositories {
        jcenter()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.31"))
    }
}

when {
    isAndroid() -> {
        apply(plugin = "kotlin-android")
        apply(plugin = "kotlin-android-extensions")
    }

    isJava() -> {
        apply(plugin = "kotlin")
    }

    else -> throw IllegalStateException("Kotlin feature only supports Java or Android based modules")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    "implementation"(kotlin("stdlib-jdk8"))
}
