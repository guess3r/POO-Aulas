# Java Of Empires

```mermaid
classDiagram
    
    class App{
        
    }
    
    class Personagem{
        - Double: vida
        - Double: dano
        - Double: velocidade
        + andar()
        + atacar()
    }
    
    class Arqueiro{
        
    }
    
    class Aldeao{
        
    }
    
    class Cavaleiro{
        
    }
    
    Personagem <|-- Aldeao
    Personagem <|-- Cavaleiro
    Personagem <|-- Arqueiro
    
```