# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eeb478a3bdc6cd7919e354aeb42b94e4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-em-http-native \
    rubygems-faraday-em-synchrony-native \
    rubygems-faraday-excon-native \
    rubygems-faraday-httpclient-native \
    rubygems-faraday-net-http-native \
    rubygems-faraday-net-http-persistent-native \
    rubygems-faraday-patron-native \
    rubygems-faraday-rack-native \
    rubygems-multipart-post-native \
    rubygems-ruby2-keywords-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "072b23305b38ed1d3eeb7e355d6e6b14"
SRC_URI[sha256sum] = "d1fb776cf25973b7f52a82b625bb0a009fe30ad6021ef838fb9109bf1ea6d029"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-em-http \
    rubygems-faraday-em-synchrony \
    rubygems-faraday-excon \
    rubygems-faraday-httpclient \
    rubygems-faraday-net-http \
    rubygems-faraday-net-http-persistent \
    rubygems-faraday-patron \
    rubygems-faraday-rack \
    rubygems-multipart-post \
    rubygems-ruby2-keywords \
"

BBCLASSEXTEND = "native"
