## Requisitos
- OpenJDK 17 >
- Gradle

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