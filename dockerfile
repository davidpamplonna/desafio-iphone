FROM openjdk:21-jdk

WORKDIR /app

COPY src/ ./src/

# Compilar todas as classes dentro do pacote
RUN javac src/br/com/desafio/interfaces/*.java src/br/com/desafio/*.java

# Rodar a classe Main
CMD ["java", "-cp", "src", "br.com.desafio.Main"]
