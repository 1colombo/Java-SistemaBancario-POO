# Sistema de Conta Bancária Simples em Java

## 🚀 Visão Geral do Projeto

Este projeto consiste em uma aplicação de console em Java que simula as operações básicas de uma conta bancária, incluindo funcionalidades de depósito, saque, consulta de saldo e um sistema de cheque especial com regras de limite e cobrança de taxa. Desenvolvido com foco em Programação Orientada a Objetos (POO) e boas práticas de código.

## ✨ Funcionalidades

A aplicação oferece um menu interativo com as seguintes opções:

1.  **Consultar Saldo:** Exibe o saldo atual da conta.
2.  **Consultar Limite do Cheque Especial:** Mostra o valor do limite disponível para o cheque especial.
3.  **Depositar Dinheiro:** Permite adicionar fundos à conta.
4.  **Sacar Dinheiro:** Permite retirar fundos da conta, utilizando o cheque especial se necessário.
5.  **Pagar Boleto:** Simula o pagamento de um boleto, que é processado como um saque.
6.  **Verificar Uso do Cheque Especial:** Informa se a conta está atualmente utilizando o cheque especial.
7.  **Sair:** Encerra a aplicação.

## ⚙️ Regras de Negócio do Cheque Especial

* **Definição do Limite:** O limite do cheque especial é definido no momento da criação da conta, com base no `saldoInicial`:
    * Se `saldoInicial` for R$500,00 ou menos, o limite do cheque especial é de **R$50,00**.
    * Se `saldoInicial` for maior que R$500,00, o limite do cheque especial é de **50% do valor do `saldoInicial`**.
* **Cobrança de Taxa:** Caso o cheque especial seja utilizado (ou seja, o saldo fica negativo ao realizar um saque ou pagamento de boleto), uma taxa de **20% do valor sacado do cheque especial** será cobrada. A cobrança ocorre "assim que possível" (neste projeto, a taxa é aplicada no momento do saque/pagamento se a conta ficar negativa e o cheque especial for ativado).

## 🛠️ Tecnologias Utilizadas

* **Java:** Linguagem de programação.
* **Programação Orientada a Objetos (POO):** Classes, objetos, atributos, métodos, encapsulamento.
* **Estruturas de Controle:** `if/else`, `switch`, `for`.
* **`java.util.Scanner`:** Para entrada de dados via console.