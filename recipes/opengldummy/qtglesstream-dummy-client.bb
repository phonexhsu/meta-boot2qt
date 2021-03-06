#############################################################################
##
## Copyright (C) 2014 Digia Plc and/or its subsidiary(-ies).
##
## This file is part of the Qt Enterprise Embedded Scripts of the Qt
## framework.
##
## $QT_BEGIN_LICENSE$
## Commercial License Usage Only
## Licensees holding valid commercial Qt license agreements with Digia
## with an appropriate addendum covering the Qt Enterprise Embedded Scripts,
## may use this file in accordance with the terms contained in said license
## agreement.
##
## For further information use the contact form at
## http://www.qt.io/contact-us.
##
##
## $QT_END_LICENSE$
##
#############################################################################

DESCRIPTION = "QtGlesStream dummy client provides headers and a dummy library for EGL/GLES"
SECTION = "devel"
LICENSE = "CLOSED"

PV = "1.0.0"

require opengldummy.inc

do_compile() {
	${CC} -DQGS_BUILD_CLIENT_DLL -fPIC -shared -I${WORKDIR}/headers -o libQtGlesStreamClient.so ${WORKDIR}/egl.cpp ${WORKDIR}/gles2.cpp
}

do_install_append() {
	install -m 0755 -d ${D}${libdir}
	install -m 0755 ${S}/libQtGlesStreamClient.so ${D}${libdir}
}
