#!/usr/bin/env bash
echo "Begin build"
DIR=$(cd "$(dirname "${BASH_SOURCE[0]}" )" && pwd )
set PATH=%PATH%

if [ x$TARGET == x ]; then
case "$OSTYPE" in
  darwin*)  TARGET=macbook ;;
  linux*)   TARGET=linux ;;
  msys*)    TARGET=mingw ;;
  *)        echo "unknown: $OSTYPE" && exit 1;;
esac
fi

var=CFLAGS_${TARGET}
CFLAGS=${!var}
var=LINKER_ARGS_${TARGET}
LINKER_ARGS=${!var}
var=COMPILER_ARGS_${TARGET}
COMPILER_ARGS=${!var} # add -opt for an optimized build.

mkdir -p $DIR/build/c_interop/
mkdir -p $DIR/build/bin/
echo $PATH
konanc $COMPILER_ARGS -target $TARGET $DIR/src/main/kotlin \
       -o $DIR/build/bin/ktnl || exit 1
echo "Artifact path is $DIR/build/bin/ktnl.kexe"
