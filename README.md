# KtNL



Kotlin Native for Lisp


Travis CI:[![Build Status](https://travis-ci.org/zxj5470/ktnl-gradle.svg?branch=master)](https://travis-ci.org/zxj5470/ktnl-gradle)


[![GitHub language count](https://img.shields.io/badge/language-Kotlin--Native-orange.svg)]()
[![GitHub language count](https://img.shields.io/badge/Powerd%20by-JetBrains%20CLion-blue.svg)]()

<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->
<!-- code_chunk_output -->

* [KtNL](#ktnl)
	* [Platform](#platform)
	* [Build and Run](#build-and-run)
		* [Build](#build)
	* [Dependencies](#dependencies)
	* [Completed](#completed)

<!-- /code_chunk_output -->


## Platform
Run in OS X  or Linux.

**Windows has not been supported presently.**`(JetBrains Kotlin: “What？”)`

## Build and Run
```bash
git clone https://github.com/zxj5470/ktnl

cd ktnl/cmake-build-debug

./ktnl.kexe ../kt.ktnl

```
### Build
- git clone the repositry and open with `CLion 2017.3 EAP` or later version.And Run the `kexe`.

- Or run the `build.sh` (under the `OS X` because it was written in `OS X`)

## Dependencies
- konan (Of Course)

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
CI|status
:---|:---:
Travis CI|[![Build Status](https://travis-ci.org/zxj5470/ktnl-gradle.svg?branch=master)](https://travis-ci.org/zxj5470/ktnl-gradle)