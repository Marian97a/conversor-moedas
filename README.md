# 💱 Conversor de Moedas via Console

Este projeto é um **Conversor de Moedas em Java**, que realiza conversões entre diferentes moedas em tempo real utilizando a **Exchange Rate API**. A interação acontece diretamente pelo console, com um menu simples e intuitivo com **6 opções de conversão**.

---

## 🎯 Objetivo

Desenvolver um conversor funcional que:
- Obtenha taxas de câmbio atualizadas de uma API externa.
- Permita ao usuário escolher entre diferentes conversões.
- Interaja de forma textual, exibindo resultados claros e fáceis de entender.

---

## 🚀 Funcionalidades

✔️ Menu com 6 opções de conversão:
- USD → BRL  
- EUR → BRL  
- GBP → BRL  
- BRL → USD  
- BRL → EUR  
- BRL → GBP  

✔️ Entrada do valor a ser convertido  
✔️ Consumo de API com taxa de câmbio em tempo real  
✔️ Apresentação clara do resultado  

---

## 🧪 Exemplo de Execução

=== Conversor de Moedas ===

1- USD para BRL

2- EUR para BRL

3- GBP para BRL

4- BRL para USD

5- BRL para EUR

6- BRL para GBP

0- Sair

Escolha uma opção: 1

Informe o valor a converter: 100.00

100.00 USD = 521.30 BRL

---

## 🛠️ Tecnologias Utilizadas

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Exchange Rate API](https://www.exchangerate-api.com/)
- [JSON.org](https://mvnrepository.com/artifact/org.json/json) para manipulação de dados da API

---

## 📦 Instalação

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/conversor-moedas-java.git
cd conversor-moedas-java
```

### 2. Adicione sua chave da Exchange Rate API
Edite o arquivo ConexaoApi.java e substitua:
```
private static final String API_KEY = "SUA_API_KEY";
```
Por sua chave real, que pode ser obtida gratuitamente em:
👉 https://www.exchangerate-api.com/

### 🧠 Organização do Código
| Arquivo                    | Função                                                    |
| -------------------------- | --------------------------------------------------------- |
| `Main.java`                | Inicia o programa e chama o menu                          |
| `Menu.java`                | Exibe opções de conversão e processa interações           |
| `ConverterMoeda.java`      | Gerencia o cálculo de conversão entre moedas              |
| `ConexaoApi.java`          | Faz requisição HTTP e extrai taxa da resposta JSON da API |
