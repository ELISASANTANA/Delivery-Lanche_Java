# Delivery-Lanche - Documentação

Proposta:

1 - Analisar, entender e comentar o código.

2 - Identificar falhas e corrigir, implementando melhorias de usabilidade, agradabilidade e estruturação de código.
  Problemas identificados: 
  
    - redundância de metodos, solução: herança
    
    - metodos nâo aplicavéis a categoria, solução: remover chamada de metodo
    
    - class main poluida, solução: divisão de cada funcionalidade a sua classe, criação de superclasse

3 - Implementar uma quarta opção de compra: "Salgados", que devem ser divididos entre as opções de fritos ou assados. Para cada uma dessas opções, oferecer 4 tipos de salgados.

    - criação de nova classe e insirir como opção no menu

Main - chamada da classe que inializa a aplicação

Classe Cardapio - menu e opções de lanches

Classe Lanches - calculo do tempo e finalizar o pedido(comum em todas as classes)

Classe Massa - mãe das subclasses: lasanha, macarrão e pizza

Classes filhas: atribuição de valores 

Toda aplicação terá a execuçaõ fluida e continua com apenas uma chamada de inicialização na main.
