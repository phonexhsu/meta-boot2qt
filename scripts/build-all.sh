#!/bin/bash
############################################################################
##
## Copyright (C) 2016 The Qt Company Ltd.
## Contact: https://www.qt.io/licensing/
##
## This file is part of the Boot to Qt meta layer.
##
## $QT_BEGIN_LICENSE:GPL$
## Commercial License Usage
## Licensees holding valid commercial Qt licenses may use this file in
## accordance with the commercial license agreement provided with the
## Software or, alternatively, in accordance with the terms contained in
## a written agreement between you and The Qt Company. For licensing terms
## and conditions see https://www.qt.io/terms-conditions. For further
## information use the contact form at https://www.qt.io/contact-us.
##
## GNU General Public License Usage
## Alternatively, this file may be used under the terms of the GNU
## General Public License version 3 or (at your option) any later version
## approved by the KDE Free Qt Foundation. The licenses are as published by
## the Free Software Foundation and appearing in the file LICENSE.GPL3
## included in the packaging of this file. Please review the following
## information to ensure the GNU General Public License requirements will
## be met: https://www.gnu.org/licenses/gpl-3.0.html.
##
## $QT_END_LICENSE$
##
############################################################################

while test -n "$1"; do
  case "$1" in
    "--upload")
      UPLOAD=1
      ;;
  esac
  shift
done

echo "-------------------------------------" >> build.log
for DIR in $(ls -d build-*); do
    (
    export MACHINE=${DIR#*-}
    . ./setup-environment.sh

    echo "${MACHINE}:" >> ../build.log
    echo "  start: $(date)" >> ../build.log
    bitbake b2qt-embedded-image meta-toolchain-b2qt-embedded-sdk
    if [ $? = 0 ]; then
        if [ -n "${UPLOAD}" ]; then
            ../sources/meta-b2qt/scripts/upload.sh
        fi
    else
        echo "    build failed" >> ../build.log
    fi
    echo "  end:   $(date)" >> ../build.log
    )
done
