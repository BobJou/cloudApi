# Santander Bootcamp


## Diagrama de classes
```mermaid

classDiagram
    class User {
        - name: String
        - account: Account
        - features: Feature[]
        - card: Card
        - news: News[]
    }
    
    class Account {
        - number: String
        - agency: String
        - balance: Float
        - limit: Float
    }
    
    class Feature {
        - icon: String
        - description: String
    }
    
    class Card {
        - number: String
        - limit: Float
    }
    
    class News {
        - icon: String
        - description: String
    }
    
    User "1"--> "1"Account
    User "1" --> "1..*" Feature
    User "1" --> "1..2" Card
    User "1" --> "1..*" News
```
## Railway

```properties
spring_profiles_active=prod
PROD_DB_HOST= containers-us-west-92.railway.app
PROD_DB_PORT= 6281
PROD_DB_NAME=railway
PROD_DB_PASSWORD= EY3tgIYd8DAguaiGs2FH
PROD_DB_USERNAME=postgres

```