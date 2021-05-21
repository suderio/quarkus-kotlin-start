# Projeto quarkus-kotlin-start

Projeto de microserviço rest acessando banco de dados usando quarkus e kotlin.

[Quarkus](https://quarkus.io/)

## Executando em modo dev

Isso irá executar a aplicação com suporte a live coding:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus agora tem uma Dev UI, disponível em http://localhost:8080/q/dev/.

## Empacotando e executando a aplicação

Para empacotar:
```shell script
./mvnw package
```
Isso irá produzir o arquivo `quarkus-run.jar` em `target/quarkus-app/`.
Este não é um _über-jar_, as dependências são copiadas para `target/quarkus-app/lib/`.

Se quiser construir um _über-jar_, execute:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

A aplicação pode ser executada com `java -jar target/quarkus-app/quarkus-run.jar`.

## Criando um executável nativo

Você pode criar um executável nativo com: 
```shell script
./mvnw package -Pnative
```

Ou, se não tem a GraalVM instalada, pode executar a versão nativa em um container com: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

O executável nativo estará em: `./target/getting-started-1.0.0-SNAPSHOT-runner`

Para aprender mais sobre executáveis nativos consulte https://quarkus.io/guides/maven-tooling.html.


