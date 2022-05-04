cd ../
mvn clean package -DskipTests

cd env
oc start-build sap-po-simulator --from-dir=../target/ -F
