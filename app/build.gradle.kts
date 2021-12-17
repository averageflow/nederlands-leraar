plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.0.10"
    id("org.beryx.jlink") version "2.24.4"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

group = "nl.averageflow"
version = "1.0-SNAPSHOT"
var applicationMainClass =  "nl.averageflow.nederlandsleraar.NederlandsLeraar"

repositories {
    mavenCentral()
}

application {
    mainClass.set( applicationMainClass )
}

javafx {
    version = "17.0.1"
    modules("javafx.controls", "javafx.fxml")
}

dependencies {
    implementation("net.synedra:validatorfx:0.1.13") {
        exclude(group = "org.openjfx")
    }
    implementation("org.kordamp.ikonli:ikonli-javafx:12.2.0")
    implementation("org.kordamp.bootstrapfx:bootstrapfx-core:0.4.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

//jlink {
    // imageZip = project.file("${buildDir}/distributions/app-${javafx.platform.classifier}.zip")
//    options = ["--strip-debug", "--compress", "2", "--no-header-files", "--no-man-pages"]
//    launcher {
//        name = "app"
//    }
//}

//jlinkZip {
//    group = "distribution"
//}