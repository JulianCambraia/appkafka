# Kafka noSpring boot

### 1.  Introdução

O Apache Kafka é uma plataforma de streaming distribuído excelente para a troca de mensagem em alta escala, como por 
exemplo, em arquitetura orientada em eventos. 
Como na maioria das tecnologias, também há dependências para facilitar a utilização do Kafka em aplicações Spring Boot, 
utilizando a dependência ``spring-kafka`` temos auto configuração e implementações para utilizar o Kafka nas nossas 
aplicações.
Para os producer temos o ``KafkaTemplate``, classe que fornece operações de alto nível para o envio de mensagens para o Kafka.
Para os consumers temos a anotação ``KafkaListener``, que marca o método anotado como um lister do tópico configurado e 
também possibilita configurações como grupo de consumidores, partições, entre outras.

### 1.2. Sobre o projeto de exemplo

O Exemplo a ser demonstrado é o famoso exemplo do producer e consumer, onde o producer é uma aplicação Spring Boot que 
disponibiliza um endpoint para receber a mensagem e quando recebido adiciona no tópico do Kafka e o consumer, que também 
é uma aplicação Spring Boot, que fica “escutando” o tópico do Kafka e logando as mensagens recebidas, como demonstrado na 
imagem abaixo. 

![alt text](https://github.com/julianCambraia/appkafka/blob/main/images/kafka-exemplo.png?raw=true)