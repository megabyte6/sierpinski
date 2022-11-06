# Sierpinski

## About
This project is a simple Sierpinski's Triangle app that I wrote to learn JavaFX.

## How to use

### Windows
1. Go to [releases](https://github.com/megabyte6/sierpinski/releases)
1. Download `Sierpinski-installer.msi` (recommended) or `Sierpinski-installer.exe`
1. Run the installer.
1. Have fun!

### MacOS, Linux, & Portable builds.
1. Go to [releases](https://github.com/megabyte6/sierpinski/releases).
1. Download either the `.zip` file for your system.
1. Extract the file.
1. Navigate to the `bin` folder.
1. Run `sierpinski` (or `sierpinski.bat` if you're on windows)

## Controls
- Scroll to zoom in and out.
- Press `r` to reload the window.

## Building
- Prerequisites
    - JDK 17
        - [Adoptium](https://adoptium.net/temurin/releases)
        - [Adoptium GitHub](https://github.com/adoptium/temurin17-binaries/releases)
    - A bit of command line knowledge
1. Clone this repository.
1. Open a terminal to the cloned project.
1. Build the project.
    - Just build the project:
        1. Run `./gradlew build`
        1. Check `build/distributions` for the builds.
    - Build portable images:
        1. Run `./gradlew jlinkZip`
        1. Check `build` for the `.zip` images.
    - Build installers & executables:
        1. Check [Oracle's website](https://docs.oracle.com/en/java/javase/14/jpackage/packaging-overview.html#GUID-786E15C0-2CE7-4BDF-9B2F-AC1C57249134:~:text=Java%20Runtime%20Requirements-,Packaging%20Pre%2DReqs,WiX%203.0%20or%20later%20is%20required.,-Application%20Preparation) for prerequisites.
        1. Change the `jpackageTargetPlatform` property in `gradle.properties` to match your operating system and architecture.
        1. Run `./gradlew jpackage`
        1. Check `build/` for the installer(s) and executable(s).

## License
This project uses the [MIT license](https://opensource.org/licenses/MIT).

## Thanks
Thanks to [OpenJFX](https://openjfx.io/) as this project was build with JavaFX. Thanks to the creators of the [Badass JLink Plugin](https://github.com/beryx/badass-jlink-plugin/) as well.