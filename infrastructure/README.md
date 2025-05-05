
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
│   ├── WebConfig.java
│   └── AsyncConfig.java
├── persistence/
│   ├── entity/
│   │   ├── ProductEntity.java
│   │   └── CategoryEntity.java
│   ├── repository/
│   │   ├── ProductJpaRepository.java
│   │   └── CategoryJpaRepository.java
│   ├── mapper/
│   │   ├── ProductEntityMapper.java
│   │   └── CategoryEntityMapper.java
│   └── adapter/
│       ├── ProductRepositoryAdapter.java
│       └── CategoryRepositoryAdapter.java
├── external/
│   ├── client/
│   │   └── InventoryApiClient.java
│   ├── dto/
│   │   └── InventoryCheckDto.java
│   └── adapter/
│       └── InventoryServiceAdapter.java
└── security/
└── SecurityConfig.java