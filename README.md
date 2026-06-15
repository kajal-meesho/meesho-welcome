# meesho-welcome

Demo target for Kevin's Week 4 canary-deploy POC.

Spring Boot 2.7 + Java 11. Serves a Meesho-branded welcome page on `GET /` and a
JSON health check on `GET /health`. Bundled tests assert the page contains the
brand name and a call-to-action.

## Run locally

```bash
mvn spring-boot:run
# → http://localhost:8080
```

## Run via Docker (what Kevin does)

```bash
docker build -t meesho-welcome:local .
docker run -d -p 8080:8080 meesho-welcome:local
curl http://localhost:8080
```

## Test

```bash
mvn test
```
