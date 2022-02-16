## DOCUMENTAÇÃO

Autor: Genilson Cavalcante
Gmail: genilsoncavalcante.freelancer@gmail.com

Olá, essa é a documentação para os códigos dos desafios da Capgmeni.

## HIERARQUIA DE PASTAS

A hierarquia de pastas é dividida nas responsabilidades de cada questão apresentada no docs postado pela Capgemini, onde se encontra no link:
* https://docs.google.com/document/d/1fAzE01t6hEyg8JrbRo7vOA3K2W-NYisF/edit

Dessa forma, existe uma pasta para cada uma das alternativas, seguindo na mesma ordem do documento postado no Google Docs, onde todas possuem classes que são executadas pelo método main.

Para visualizar qualquer questão, precisa-se executar a classe Main, onde terá um facilitador de execução interativo, onde o usuário poderá escolher qual questão deseja executar.

O código foi feito exclusivamente com a linguagem Java.


## PACKAGE questao_01:

O código desse pacote é definido com uma entrada de dados digitada pelo usuário, que determina a quantidade de asteriscos que ele deseja para formar a escada.

Para a questão, foi desenvolvido a ideia de variáveis para preenchimento de espaços e de asteriscos, como também tendo-se contadores que mais tarde definem a quantidade de espaços e asteriscos que serão acrescentados e decrementados, dentro da lógica do laço de repetição for, que é executado pela quantidade de vezes que o usuário digitou.

Dessa forma, vai se criando a escada, inicialmente decrementando a quantidade de espaços e acrescentando a quantidade de asteriscos.

## PACKAGE questao_02: 

Neste código, temos um método que recebe um valor do usuário, uma senha sugerido por ele, dessa forma, o desenvolver do código se dá na validação desta senha, analisando se a mesma possuí o número mínimo de caracteres, que são 6 e ainda dando sugestões para o melhoramento da senha digitada, retornando um feedback se a senha é forte ou fraca.

Passando para o método verificarSenhaForte(), temos variáveis do tipo String que irão armazenar valores para sugestão de tipos de dados que podem ser adicionados a senha que possa melhorá-la, e temos uma variável do tipo int chamada pontosSenha, que armazena um valor cada vez que a senha tiver faltando um tipo de dado, os tipos de dados considerados para uma boa senha, são:

* Possui no mínimo 6 caracteres.
* Contém no mínimo 1 digito.
* Contém no mínimo 1 letra em minúsculo.
* Contém no mínimo 1 letra em maiúsculo.
* Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Dessa forma, a senha passa-se por validadores, verificando se ela possui esses requisitos que foram mostrados acima, caso NÃO tenha um desses, é entrado na condição e os valores são adicionados nas respectivas variáveis.

Passando por isso, chega o momento em que se entra em uma outra validação, onde que através dos valores armazenados nas variáveis da validação anterior, podemos definir o estado da senha digitada pelo usuário, dando-lhe um feedback se a senha é fraca ou forte, quantos caracteres faltam, que tipos de caracteres são necessários para a torná-la mais forte.

## PACKAGE questao_03: 

Infelizmente, não consegui desenvolver uma resposta para a solução no momento

## CLASS App.java:

A classe principal do projeto é definida como um ambiente que se possa executar todas as outras classes e de uma forma interativa, existindo um (switch case) para a execução de cada uma das questões, onde o usuário pode fazer a escolha numérica sugerida e podendo executar novamente ou sair ao término de cada questão.