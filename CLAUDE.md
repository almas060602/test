# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project state

This is a freshly generated Spring Boot skeleton (Spring Initializr output) with no application code yet — only the default `FirstApplication` entry point and an empty context-load test. There is no git repository initialized. Architecture notes here will need to be expanded as real code is added.

- Group/artifact: `almas.project:first`
- Package root: `almas.project.first`
- Java 21, Spring Boot 4.1.1 (`spring-boot-starter-parent`), Maven build

## Commands

Use the Maven wrapper (`mvnw`/`mvnw.cmd`), not a system-installed Maven.

```
./mvnw spring-boot:run          # run the application
./mvnw test                     # run all tests
./mvnw test -Dtest=FirstApplicationTests   # run a single test class
./mvnw package                  # build the jar
```

On Windows PowerShell use `mvnw.cmd` in place of `./mvnw`.

## Architecture

Standard Maven/Spring Boot layout:
- `src/main/java/almas/project/first/` — application code, entry point `FirstApplication.java`
- `src/main/resources/application.yaml` — Spring configuration (currently only sets `spring.application.name`)
- `src/test/java/almas/project/first/` — tests
