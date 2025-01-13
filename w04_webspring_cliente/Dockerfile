# imagen base para crea la nuestra
from openjdk:17-jdk-alpine

# copia el war en la imagen
copy target/w04_webspring_cliente-1.jar w04_webspring_cliente-1.jar

# lo que se ejecutará al ejecutar el contenedor
entrypoint ["java", "-jar", "/w04_webspring_cliente-1.jar"]

# expone el puerto 7071 del contenedor
expose 7071