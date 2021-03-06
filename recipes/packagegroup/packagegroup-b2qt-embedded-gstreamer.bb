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

DESCRIPTION = "Additional gstreamer packagegroup for B2Qt embedded Linux image"
LICENSE = "CLOSED"
PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = "\
        gst-meta-video \
        gst-meta-audio \
        gst-plugins-good \
        gst-plugins-base-app \
        gst-plugins-base-audiorate \
        gst-plugins-base-videorate \
        gst-plugins-base-encodebin \
        gst-plugins-good-videofilter \
        gst-plugins-good-id3demux \
        gst-plugins-good-auparse \
        gst-plugins-good-isomp4 \
        gst-plugins-good-icydemux \
        gst-plugins-good-video4linux2 \
        gst-plugins-good-multifile \
        gst-plugins-good-videocrop \
        gst-plugins-good-jpeg \
        gst-plugins-ugly-rmdemux \
        gst-plugins-ugly-asf \
        gst-plugins-ugly-a52dec \
        gst-plugins-bad-mpegdemux \
        gst-plugins-bad-faad \
        gst-plugins-bad-camerabin2 \
        gst-plugins-bad-jpegformat \
        gst-ffmpeg \
        "
