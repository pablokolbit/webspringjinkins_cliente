docker build -t webspring_cliente:1.0 .
docker run -p 7071:7071 webspring_cliente:1.0
docker ps -a