# KtNL



Kotlin Native for Lisp


CI|status
:---|:---:
Travis CI|[![Build Status](https://travis-ci.org/zxj5470/ktnl-gradle.svg?branch=master)](https://travis-ci.org/zxj5470/ktnl-gradle)
CodeShip|[ ![Codeship Status for zxj5470/ktnl-gradle](https://app.codeship.com/projects/c811a1c0-a761-0135-bce0-229ed7207fef/status?branch=master)](https://app.codeship.com/projects/255803)

[![GitHub language count](https://img.shields.io/badge/language-Kotlin--Native-orange.svg)]() 

[![GitHub language count](https://img.shields.io/badge/Powerd%20by-JetBrains%20CLion-blue.svg)]() [![GitHub language count](https://img.shields.io/badge/Powerd%20by-JetBrains%20Intellij%20Idea-red.svg)]() [![GitHub language count](https://img.shields.io/badge/Powerd%20by-Visual%20Studio%20Code-blue.svg)]()
<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->
<!-- code_chunk_output -->

* [KtNL](#ktnl)
	* [Platform](#platform)
	* [Build and Run](#build-and-run)
		* [Build](#build)
	* [Dependencies](#dependencies)
	* [Completed](#completed)
	* [CI build scripts](#ci-build-scripts)
		* [Travis CI](#travis-ci)
		* [Codeship CI](#codeship-ci)

<!-- /code_chunk_output -->


## Platform
**Run in OS X or Linux.**

**Windows has not been supported presently.**`(JetBrains: “What？”)`

## Build and Run
- make sure you have installed the `kotlin-native compiler ` and your path has contained `konanc`.If not please download [kotlin-native/releases] first.(https://github.com/JetBrains/kotlin-native/releases)  (current version is `0.4`)

-  bash :
    ```bash
    git clone https://github.com/zxj5470/ktnl-gradle
    cd ktnl-gradle/ktnl/cmake-build-debug
    ./ktnl.kexe ../kt.ktnl
    ```

### Build
- git clone the repositry and open with `Intellij Idea` or `Visual Studio Code`.

  - Idea (building recommand) : `run` the `./gradlew buildInLinux` 
  - VSCode (coding recommand) : run the `./ktnl/build.sh`
  - CLion (in `ktnl` repository,using CMake to build)

## Dependencies
- `konanc` (Of Course)
- Nothing but `kotlin-stdlib`

## Completed
There are so many things to do,and I have just finished these as follows.

```scheme
(define a 2333)
(define ice-1000 "Zython")
```
outputs:
```kotlin
{a: Int = 23333, ice1000: String = "Zython"}
```

## CI build scripts
### Travis CI

[.travis.yaml](https://github.com/zxj5470/ktnl-gradle/blob/master/.travis.yml)

### Codeship CI
- build
```bash
jdk_switcher home oraclejdk8
jdk_switcher use oraclejdk8
wget https://github.com/JetBrains/kotlin-native/releases/download/v0.4/kotlin-native-linux-0.4.tar.gz -O /tmp/kotlin-native-linux-0.4.tar.gz
tar -xvf /tmp/kotlin-native-linux-0.4.tar.gz
export PATH=$PATH:$PWD/kotlin-native-linux-0.4/bin/
cd ~/src/github.com/zxj5470/ktnl-gradle
chmod u+x ./gradlew
./gradlew buildInLinux
```
- test
```bash
cd ~/src/github.com/zxj5470/ktnl-gradle/ktnl
./build/bin/ktnl.kexe kt.ktnl
```