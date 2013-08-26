AppOps Launcher
===============

Simple application to launch the App Ops setting screen (Android 4.3)

Build
-----

    // Update the project to generate local.properties ('android' must be in you path)
    android update project -p ./src/main/ -t 18
    // Remove useless files
    rm ./src/main/build.xml ./src/main/proguard-project.txt
    // Move the local.properties file
    mv ./src/main/local.properties .
    // Build the application
    gradle build

