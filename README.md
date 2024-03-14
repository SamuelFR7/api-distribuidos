## Requisitos
- OpenJDK 17 >

## Passo a passo
```bash
$ git clone https://github.com/SamuelFR7/api-distribuidos
$ cd ./api-distribuidos
```

```bash
$ ./gradlew clean build
$ docker build -t api-distribuidos .
$ docker run -p 8080:8080 -d api-distribuidos
```

### O projeto estará rodando na porta 8080

## Exemplos de requisições
#### POST http://localhost:8080/users - Criar usuário:
```json
    {
      "id": "1",
      "username": "teste",
      "email": "teste@email.com"
    }
```

#### GET http://localhost:8080/users/1 - Mostrar usuário com ID 1
```json
```

#### PUT http://localhost:8080/users/1 - Atualizar usuário com ID 1
```json
    {
      "username": "novo",
      "email": "novoemail@email.com"
    }
```

#### GET http://localhost:8080/users - Listar usuários:
```json
```

#### DELETE http://localhost:8080/users/1 - Deletar usuário com o ID 1
```json
```

