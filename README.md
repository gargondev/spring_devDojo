# Estudo Spring DevDojo

> [-> Spring Boot 2 Essentials 01 - O que é Spring Boot](https://youtu.be/aspWYs8lp48https:/)

* Objetivos Criar aplicações Standalone.
* Inicio Rapido.
* Servlets Container
* Facilmente integrados em entre todas dependencias do projeto spring.


> [-> Spring Boot 2 Essentials 02 - Criando projeto na pedreiragem pt 01](https://youtu.be/w8I7jWfUFLghttps:/)

* Descrição de como criar projeto do basico com uso do Pon utilizando intellij

> [-> Spring Boot 2 Essentials 03 - Criando projeto na pedreiragem pt 02](https://youtu.be/szrqiHLbUq0https:/)

* Continação descrição de como criar projeto do basico com uso do Pon utilizando intellij.
* Criando public static void main na mão.
* @RestController - Retorna dados em Json anotação responsavel para ajudar definir endpoint.
* @RequestMapping - Define path (localhost:8080/list/app) para o Rest Controller  no contesto da classe exe: @RequestMapping("list")
* @GetMapping - Define uri no contesto do método exe @GetMapping(path = "app").
* @ComponentScan - Define leitura do package de start exemplo @ComponentScan(basePackages = "start.aplication.app").

[-> Spring Boot 2 Essentials 04 - @Component, @Autowired, @SpringBootApplication](https://www.youtube.com/watch?v=4sndRmKpMYI&list=PL62G310vn6nFBIxp6ZwGnm8xMcGE3VA5H&index=5)

* Class Util.
* @AutoWired - Utilizado para Realizar injeção de dependencias no Spring porem *** melhor maneira de se utilizar Injetando classe no construtor *.**
* @Component - Help para criação de @Bean do Spring ao inserir essa anotação em uma classe, dentro de Util por exemplo você informa ao Spring que essa classe é um Bean, existe outras anotações @Repository @Service tem a mesma função porem a cada anotação é apenas uma forma de manter a suas classes organizadas.
* @AllArgsConstructor - Utilizado pelo Lombok para construção de construtores economiza linha de código.
* @SpringBootApplication - utilizado na class main para start da aplicação Spring.

[-> Spring Boot 2 Essentials 05 - Hot Swap com Spring Boot Devtools](https://www.youtube.com/watch?v=8W8t2yh8CD4&list=PL62G310vn6nFBIxp6ZwGnm8xMcGE3VA5H&index=6)

* Necessário adicionar dependencia devTools no Pon
* Utilizado para restart da aplicação mais rapido quando aplicação em execução somente executar o build da aplicação novamente.

[-> Spring Boot 2 Essentials 06 - Gerando projeto com start.spring.io](https://)
