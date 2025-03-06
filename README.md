Este projeto é uma API simples desenvolvida em Java que consome o serviço ViaCEP, fornecendo informações detalhadas sobre um endereço a partir de um CEP informado. Utiliza as bibliotecas Jackson Databind para manipulação de JSON e Postman para testar as requisições HTTP.

Funcionalidade
O objetivo deste projeto é permitir que o usuário informe um CEP válido, e a aplicação fará uma requisição HTTP para a API ViaCEP, retornando os seguintes dados:

Logradouro (ex: Rua, Avenida)
Bairro
Cidade
Estado
CEP
Tecnologias Utilizadas
Java: Linguagem de programação principal para a implementação da API.
Jackson Databind: Biblioteca para serialização e desserialização de objetos Java em JSON e vice-versa.
HTTP Requests: A API faz requisições HTTP para consumir o serviço ViaCEP.
Postman: Ferramenta utilizada para testar e validar as requisições HTTP durante o desenvolvimento.
