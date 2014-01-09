#############################################################################
##
## Copyright (C) 2013 Digia Plc and/or its subsidiary(-ies).
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
## http://qt.digia.com/contact-us.
##
##
## $QT_END_LICENSE$
##
#############################################################################

# dependency to x11 only when distro features have it
DEPENDS = "${@base_contains('DISTRO_FEATURES', 'x11', 'virtual/libx11', '', d)}"

PROVIDES += "virtual/libgl"