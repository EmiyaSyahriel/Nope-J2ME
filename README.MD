# Nope (J2ME)
A J2ME App, Where it's README has more content than the actual app.

## Usage
Just launch the app, and Nope.

## Feature
Nope, nothing, just a black background with white text written "Nope" at the center.

### System Requirements
- CLDC 1.1
- MIDP 2.1
- Any screen size

## Intent of Creation
This is just my proof of concept to build J2ME Application using Gradle (which is now not really supported 
as the target bytecode is already deprecated by Gradle), in combination with Local Maven Repository.

This is just a bare J2ME app, no Proguard shrinking, obfuscation or anything.

### Influenced by
- [Nope](https://github.com/EmiyaSyahriel/Nope) - The original project

## How to build
### Pre-requisites
- Gradle ( used 8.13, IDK which version is mininum )
- Java ( JRE Ok, JDK recommended )
- Maven ( used 3.9.9, IDK which version is mininum )
- CLDC 1.1 and MIDP 2.1 Library

### Steps
- Install CLDC and MIDP with this name to your local maven repository :
  - `cldc11.jar` → `javax.microedition:cldc:1.1`
  - `midp21.jar` → `javax.microedition:midp:2.1`
  > You can get the libraries either from the original WTK / J2ME SDK, from KEmulator/nnmod implementation
  > or from [this repo (a complete set using KEmulator nnmod etc.)](https://github.com/vipaoL/j2me-build-tools)
- Clone the repository
> `git clone https://github.com/EmiyaSyahriel/Nope-J2ME`

#### CLI way
```
cd Nope-J2ME
./gradlew
./gradlew jar
```
#### IDE way ( Used IntelliJ IDEA )
- Open the directory as Project
- Run the Gradle task `jar`

The jar file would be at `app/build/libs`

### Known issues : 
If there is `Configuration cache problems found in this build.` error during build, just do it again, should work.

## License
Also, Nope ( I mean, [Unlicense](LICENSE.TXT) )
