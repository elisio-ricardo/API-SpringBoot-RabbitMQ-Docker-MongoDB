# API-SpringBoot-RabbitMQ-Docker-MongoDB
API que cria e consome uma fila do RAbbitMQ e persiste utilizando MongoDB

# Desenho da solução 

![image](https://github.com/elisio-ricardo/API-SpringBoot-RabbitMQ-Docker-MongoDB/assets/64418835/a9a9c7bc-4a0a-49dd-a320-49f568591297)


# Json
        {
        "codigoPedido": 1001,
        "codigoCliente": 1,
        "itens": [
          {
            "produto": "lapis",
            "quantidade": 100,
            "preco": 1.10
          },{
            "produto": "caderno",
            "quantidade": 10,
            "preco": 1.10
          }
        ]
      }

# Acesso ao RabbitMQ

 http://localhost:15672/#/queues/%2F/btg-pactual-order-created

 login: guest
 senha: guest
