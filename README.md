AppOps Launcher
===============

Simple application to launch the App Ops setting screen (Android 4.3 & Android 4.4).
Not available anymore since Android 4.4.2.
This should work on "non vanilla" system but without any guaranties.

Build
-----

    # Update the project to generate local.properties ('android' must be in you path)
    android update project -p ./src/main/ -t 18
    # Remove useless files
    rm ./src/main/build.xml ./src/main/proguard-project.txt
    # Move the local.properties file
    mv ./src/main/local.properties .
    # Build the application
    gradle build

License
-------

Code is under WTFPL (see LICENCE).
Graphical ressources came from AOSP (APACHE).
