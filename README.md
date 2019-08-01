# apiMV

## Api para teste MV
* Para rodar está aplicação, importe o projeto em sua IDE e execute com aplicação java ou execute o seguinte comando maven:
>mvn spring-boot:run
* Url base da api localmente: http://localhost:8080/api

## Endpoints da aplicação
> GET:: /users 
- Retorna todos os registros da entidade User
> GET:: /user/{id}
- Retorna o usuário a partir do id especificado
> POST:: /user
- Insere um registro de usuário no banco de dados
> DELETE:: /user
- Exclui um resgistro de usuário do banco de dados
> PUT:: /user
- Atualiza o registro de um usuário

## Front-End
* Disponível no seguinte repositório: https://github.com/CiceroPereira/frontMV
