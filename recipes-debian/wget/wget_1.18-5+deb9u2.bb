inherit debian-dsc

# TODO: automatically get URI through the apt repository DB?
# or, is debian-dsc.class is intended to be merged into OE-Core?
DSC_URI = "http://ftp.de.debian.org/debian/pool/main/w/${PN}/${PN}_${PV}.dsc;md5sum=95cd20d45d7e087c88ff1b60635363ae"

# TODO: add inherit common functions to fetch other source files and build them
