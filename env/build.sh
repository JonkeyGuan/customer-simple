cd ../
mvn clean package -DskipTests

cd env
oc start-build customer-simple --from-dir=../target/ -F
