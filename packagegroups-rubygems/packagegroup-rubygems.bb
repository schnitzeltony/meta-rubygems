SUMMARY = "package group for all rubygems"

inherit packagegroup

RDEPENDS_${PN} += "\
    rubygems-activemodel \
    rubygems-activesupport \
    rubygems-addressable \
    rubygems-aws-eventstream \
"
