
Example

infrastructure/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    └── infrastructure/
                        ├── config/
                        │   ├── PersistenceConfig.java
                        ├── persistence/
                        │   ├── entity/
                        │   │   ├── SearchJpaEntity.java
                        │   ├── repository/
                        │   │   ├── SearchJpaRepository.java
                        │   ├── mapper/
                        │   │   ├── SearchEntityMapper.java
                        │   └── adapter/
                        │       ├── SearchRepositoryAdapter.java
                        ├── external/
                        │   ├── client/
                        │   │   └── ExternalApiClient.java
                        │   ├── dto/
                        │   │   └── ExternalCheckDto.java
                        │   └── adapter/
                        │       └── ExternalServiceAdapter.java
                        └── messaging/
                            ├── producer/
                            │   └── SearchProducer.java
                            └── consumer/
                                └── SearchConsumer.java
                            └── listener
                                └── SearchListener.java
                            └── adapter/
                                └── SearchAdapter.java

