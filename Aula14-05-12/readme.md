# Sistema de gestão de Agenda Telefônica

```mermaid
classDiagram
    
    class App{
        - agenda: AgendaTelefonica
        + main()$
        + menu()
    }
    
    class AgendaTelefonica{
        - contatos: ArrayList~Contato~
        + Agenda()
        + addContato(c: Contato): boolean
        + removeContato(c: String, s: String): boolean
        + addTelefone(r: String, n: String, c: Contato): boolean
        + addEmail(r: String, n: String, c: Contato): boolean
        + updateTelefone(r: String, n: String, c: Contato): boolean
        + updateEmail(r: String, n: String, c: Contato): boolean
        + removeTelefone(r: String, c: Contato): boolean
        + removeEmail(r: String, c: Contato): boolean
        + toString(): String
    }
    
    class Contato{
        - nome: String
        - sobrenome: String
        - telefone: ArrayList~Telefone~
        - email: ArrayList~Email~
        + Contato(n: String, s: String, dN: LocalDate)
        + addTelefone(r: String, v: String): boolean
        + addEmail(r: String, v: String): boolean
        + removeTelefone(r: String): boolean
        + removeEmail(r: String): boolean
        + updateTelefone(r: String, n: String): boolean
        + updateEmail(r: String, e: String): boolean
        + toString(): String
    }
    
    class Telefone{
        - rotulo: String
        - valor: String 
        + Telefone(r:String, v:String)
        + toString(): String
    }
    
    class Email{
        - rotulo: String
        - valor: String
        + Email(r:String, v:String)
        + toString(): String
    }
    
    AgendaTelefonica *-- Contato
    Contato *-- Telefone
    Contato *-- Email
    App *-- AgendaTelefonica
```