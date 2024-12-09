JPA Embeddable testing
======================

This repository explores the use of `@Embeddable` types in JPA. In particular there is hierarchy starting with [BaseD](./src/main/java/org/example/BaseD.java).

Tests can be run with

```shell
./gradlew test
```
The tests will write the DDL in `./test.sql`