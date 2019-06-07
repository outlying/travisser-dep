buildscript {

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.4.1")
        classpath(kotlin("gradle-plugin", version = "1.3.31"))
        classpath(gradleApi())
    }
}

allprojects {

    group = "com.antyzero.travisser"
    version = "0.0.1-SNAPSHOT"

    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}