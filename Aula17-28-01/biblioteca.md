```mermaid
classDiagram
    
    class Livro{
        - Autor autor
    }
    
    class Revista{
        - Arraylist ~Autor~ autores
    }
    
    class Jornal{
        - Arraylist ~Autor~ autores 
    }
    
    class Gibi{
        - Int edicao
    }
    
    class Acervo{
        - String texto
        - Int paginas
        - String editora
        - String titulo
        - String ilustracao
    }
    
    class Autor{
        
    }
    
```