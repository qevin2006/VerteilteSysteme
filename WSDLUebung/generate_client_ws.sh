# Skript um WebService Client zu generieren

# WSDL URL zur Generierung:
WSDL_URL=http://localhost:8090/mitarbeiter?wsdl

# Java Packetname fur generierte Klassen:
PACKAGE=de.mbg.webservice.client.gen

# Pfad zum Eclipse Projekt:
BASEDIR=/home/user/workspace/WSDLUebung

wsimport -keep -p $PACKAGE -s $BASEDIR/src -d $BASEDIR/bin $WSDL_URL