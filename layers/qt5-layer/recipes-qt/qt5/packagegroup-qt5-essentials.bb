#
#   Copyright (C) 2015 Pelagicore AB
#
DESCRIPTION = "All Qt5 Essentials modules"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
         qtbase \
         qtdeclarative \
         qtdeclarative-tools \
         qtmultimedia \
         qtwebkit \
         qtsvg \
         "
