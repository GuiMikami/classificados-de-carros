# Classificados de Carros
[PROJETO INTEGRADOR III - Turma B]

## Projeto de Classificados de carros

Telas:
1. **Tela Principal** (Será a tela responsável por mostrar as novidades do site e os carros em destaques);
![Tela Principal](https://user-images.githubusercontent.com/99701339/225451913-321a2222-4d77-467b-9b1a-3e48084c1b68.png)

2. **Tela de Anuncio** (Mostrará o catalogo de carros de maneira resumida, contendo: Imagem do carro, Nome do carro, Ano do carro, Localidade, Quilometragem e Valor dos carros cadastrados no site);
![Tela anuncio](https://user-images.githubusercontent.com/99701339/225451962-d23a4ac0-f4a3-420e-a0e7-c7510c1e2d59.jpg)

3. **Tela de Login** (Nome de usuário  e senha para acessar a conta do cliente);
![Tela login](https://user-images.githubusercontent.com/99701339/225452187-dbb6f76b-9ed9-412c-9a68-7caf6992feeb.jpg)

4. **Tela de Cadastro do usuário** (Nome completo, CPF, Data de nascimento, Endereço, Contato, gênero, endereço de Email e senha);
![Tela cadastro cliente](https://user-images.githubusercontent.com/99701339/225452239-edd11b82-28f5-417e-85c2-ee3bb0dc69b5.jpg)

5. **Tela de Cadastro do carro** (Tela utilizada para cadastrar o carro pedindo algumas informações como: Imagem do carro, Nome do carro, Ano do carro, Localidade, Marca, Modelo, Quilometragem, e Valor);
![Tela cadastro carro](https://user-images.githubusercontent.com/99701339/225452266-4dbb692c-d07d-4b68-8d8a-968bb6555820.jpg)

6. **Tela de Perfil** (Mostrará a conta do usuário e opções de tirar o carro caso ele tenha sido vendido);
![Tela Perfil](https://user-images.githubusercontent.com/99701339/225452297-c1ca170c-22ec-40cd-8e9d-534c5cfc0f0e.jpg)

7. **Tela Sobre** (Mostra a historia sobre a empresa e a foto dos criadores do site ).
![Tela sobre](https://user-images.githubusercontent.com/99701339/225452322-4b94c6a4-e334-4674-a36f-84ec5177ba26.jpg)


8. **Tela compra** (Mostrará um carro selecionado de maneira especificada com as especificações do carro, como por exemplo: Km Rodado, situação do carro, Ano do carro, modelo, tipo de cambio, numero de portas, Acionamento do carro);
![Tela de Compra](https://user-images.githubusercontent.com/104398112/225469062-42303154-0525-4fe7-810f-4ccef3618c2e.png)


9. **Modelo de Entidade Relacional (MER)**
![MER final](https://user-images.githubusercontent.com/104398112/225485384-7105643f-b734-4762-a54f-2e185a2c55ab.png)

10. **Diagrama Enditade-Relacionamento (DER)**

![logico](https://user-images.githubusercontent.com/99701339/225765436-939ea9e8-7ab1-480f-995d-330bfb19a0f1.png)

**OVERVIEW PROTOTIPO**
![OVERVIEW](https://user-images.githubusercontent.com/99701339/225452706-99fb06ad-d92e-4dab-954a-2e539093fd76.png)


SCRIPT DA DATABASE 

CREATE TABLE CLIENTE( CPF VARCHAR(11) PRIMARY KEY NOT NULL, NOME VARCHAR(100) NOT NULL, GENERO VARCHAR(10)NOT NULL, DATANASCIMENTO VARCHAR(10) NOT NULL, EMAIL VARCHAR (40)NOT NULL, SENHA VARCHAR(13)NOT NULL, ESTADO VARCHAR (50) NOT NULL, CONTATO VARCHAR (15) NOT NULL);


CREATE TABLE CARRO( PLACA VARCHAR(7) PRIMARY KEY NOT NULL, NOMECARRO VARCHAR (80) NOT NULL,  ANO VARCHAR (4) NOT NULL, KM VARCHAR (20) NOT NULL, ESTADO VARCHAR (30) NOT NULL, VALOR VARCHAR(10) NOT NULL);




