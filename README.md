# Money Tracker — Backend

Spring Boot REST API for the Money Tracker mobile app.

## Tech Stack

- Java 25
- Spring Boot 4.0.6
- Gradle 9.4.1
- Lombok
- SpringDoc OpenAPI (Swagger UI)

---

## Prerequisites

- JDK 25+
- No separate Gradle install needed — use the wrapper (`./gradlew`)

---

## First-time Setup

### 1. Register git hooks

The project ships with hooks for commit message validation, code formatting, branch naming, and build checks. Run this once after cloning:

```sh
git config core.hooksPath .githooks
```

> Without this, none of the hooks will run.

### 2. Apply code formatting

Before your first commit, format the codebase to avoid the pre-commit hook rejecting your changes:

```sh
./gradlew spotlessApply
```

---

## Running the App

```sh
./gradlew bootRun
```

The server starts at: `http://localhost:8080/money-tracker`

Swagger UI is available at: `http://localhost:8080/money-tracker/swagger-ui/index.html`

---

## Building

```sh
./gradlew build
```

Compiles, runs tests, and produces a JAR under `build/libs/`.

To build without running tests:

```sh
./gradlew build -x test
```

---

## Running Tests

```sh
./gradlew test
```

Test reports are generated at `build/reports/tests/test/index.html`.

---

## Code Formatting

The project uses [Spotless](https://github.com/diffplug/spotless) with Google Java Format.

| Command | What it does |
|---|---|
| `./gradlew spotlessApply` | Auto-fixes all formatting issues |
| `./gradlew spotlessCheck` | Checks formatting without modifying files |

The `pre-commit` hook runs `spotlessCheck` automatically before every commit.

---

## Git Hooks

Hooks live in `.githooks/` and are activated by the setup step above.

| Hook | Trigger | What it enforces |
|---|---|---|
| `commit-msg` | Every commit | Commit message format (see below) |
| `pre-commit` | Every commit | Spotless formatting check |
| `pre-push` | Every push | Branch naming convention + full build |

### Commit message format

```
<type>(optional-scope): <description>
```

Allowed types:

| Type | Use for |
|---|---|
| `feat` | New feature |
| `fix` | Bug fix |
| `docs` | Documentation only |
| `refactor` | Code restructuring, no behaviour change |
| `chore` | Dependencies, config, tooling |
| `test` | Adding or updating tests |
| `release` | Version bump / release prep |

Examples:

```
feat: add cors configuration
fix(transaction): correct from() constructor call
chore: add spotless plugin
refactor(service): extract transaction factory method
```

### Branch naming convention

```
<type>/<short-description>
```

Examples: `feat/add-cors-config`, `fix/transaction-from-method`, `chore/setup-spotless`

Exempt branches: `main`, `master`, `develop`

---

## API Reference

Base URL: `http://localhost:8080/money-tracker`

| Method | Path | Description |
|---|---|---|
| `GET` | `/api/transactions` | Get all transactions |
| `POST` | `/api/transactions` | Add a new transaction |

### POST `/api/transactions` — request body

```json
{
  "type": "CREDIT",
  "category": "FOOD",
  "amount": 250.00,
  "notes": "Lunch"
}
```

`type` values: `CREDIT`, `DEBIT`

`category` values: `FOOD`, `RENT`, `UTILITIES`, `TRANSPORT`, `HEALTH`, `ENTERTAINMENT`, `OTHER`

`notes` is optional.
