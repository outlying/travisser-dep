import com.android.build.gradle.api.AndroidBasePlugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPlugin

/**
 * Do we have android project: app, library, extension, other
 */
fun Project.isAndroid() = this.plugins.hasPlugin(AndroidBasePlugin::class.java)

/**
 * Is java
 */
fun Project.isJava() = this.plugins.hasPlugin(JavaPlugin::class.java)

/**
 * Adds script to project
 */
fun Project.feature(name : String){
    this.apply(mapOf("from" to this.rootProject.file("./gradle/feature-$name.gradle.kts")))
}