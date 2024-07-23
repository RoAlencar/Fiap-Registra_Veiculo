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

## Documentação 📒
A documentação da API pode ser acessada em:


[Swagger - Local](http://localhost:8080/swagger-ui/index.html)

### Entregas do projeto
- [x] Cadastrar um veículo para venda (Marca, modelo, ano, cor, preço)
- [x] Consultar todos os veículos ou pelo ID
- [x] Editar os dados do veículo
- [x] Excluir um veículo

### CI/CD
- [] Implementar Github Actions
- [x] Cobertura de testes unitários acima de 80%
- [] Deploy no Openshift

### Infraestrutura
- [] Cluster Openshift Red Hat.
- [] Objetos do kubernetes (Deployment, Service, Ingress).
- [] Banco de dados PostgreSQL OpenShift.

# Evidências

### Documentação da API
![image](/images/swagger.png)

### Cobertura de testes
![image](/images/evidencia_cobertura.png)
