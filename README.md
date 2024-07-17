<br>
<h1 align="center">
Fiap Registra Veiculos API 🚗
</h1>
<br>

## 💬 Sobre o repositório

O Registra Veiculos consiste em um sistema que é utilizado em uma empresa de revenda de veículos automotores, que disponibiliza uma plataforma para cadastro, vendas, gerenciamento e pagamento de veículos.

## ⚠ Pré-requisitos para execução do projeto

* Java 21
* Maven
* PostgreSQL

## 📌 Como utilizar?

Para utilizar o Registra Veiculos, é necessário ter uma instância de conexão do banco de dados ativa (no caso PostgreSQL), que por padrão fica na porta 5432, caso sua porta esteja diferente, especifique no application.yaml em:

```
    url: jdbc:postgresql:registra_veiculo_db
    username: <USUARIO_DB>
    password: <SENHA_DB>
```

Com o banco de dados devidamente configurado, rode a aplicação através do seguinte comando:

*Disponível em http://localhost:8080/

```
mvn spring-boot:run 
```

Com a aplicação rodando, acesse o localhost (porta 8080), e usufrua do sistema!