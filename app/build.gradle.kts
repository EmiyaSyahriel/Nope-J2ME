import org.gradle.internal.declarativedsl.parsing.main
import org.gradle.internal.jvm.Jvm
import java.util.*

plugins {
    java
}

repositories {
    mavenLocal()
}

java   {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

    tasks.getByName("jar", Jar::class)
    {
        doFirst {
            val ver = project.gradle.gradleVersion
            val jvm = Jvm.current()
            val jdkVer = jvm.javaVersion ?: "0.0"
            val jdkVnd = jvm.vendor
            manifest {
                attributes(
                    "MIDlet-Name" to "Nope",
                    "MIDlet-Version" to "1.0",
                    "MIDlet-Vendor" to "EmiyaSyahriel",
                    "MIDlet-Icon" to "icon.png",
                    "MIDlet-1" to "Nope, icon.png, nope.Nope",
                    "MicroEdition-Configuration" to "CLDC-1.1",
                    "MicroEdition-Profile" to "MIDP-2.1",
                    "Gradle-Version" to "Gradle $ver",
                    "Created-By" to "$jdkVer ($jdkVnd)"
                )
            }
            into(".")
            {
                from("/src/main/resources")
            }
        }
    }
}

dependencies {
    compileOnly("javax.microedition:cldc:1.1")
    compileOnly("javax.microedition:midp:2.1")
}
