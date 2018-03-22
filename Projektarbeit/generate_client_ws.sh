# Skript um WebService Client zu generieren

# WSDL URL zur Generierung:
WSDL_URL=http://localhost:8080/acquisitionpostingservice?wsdl

# Java Packetname fur generierte Klassen:
PACKAGE=client.gen.acquisit

# Pfad zum Eclipse Projekt:
BASEDIR=/home/user/git/Projektarbeit

wsimport -keep -p $PACKAGE -s $BASEDIR/src -d $BASEDIR/bin $WSDL_URL