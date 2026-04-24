# Projeto IMC - Testes Unitários com JUnit 5

Este projeto foi desenvolvido como atividade para a disciplina de **Teste e Qualidade de Software (UERJ)**. O objetivo é implementar uma calculadora de IMC (Índice de Massa Corporal) e validar a sua lógica através de testes unitários automatizados, garantindo a fiabilidade dos resultados.

## 🛠️ Tecnologias Utilizadas
* **Java 26**: Utilização das funcionalidades mais recentes do JDK.
* **Maven**: Gestão de dependências e automação do build.
* **JUnit 5 (Jupiter)**: Framework principal para a execução dos testes unitários.

## 🧠 Conceitos de Qualidade de Software Aplicados

### 1. Testes de Unidade
Focados em testar a menor unidade lógica do sistema (os métodos `calcular` e `categorizar`) de forma isolada. Isto garante que a regra de negócio matemática está correta antes mesmo da interface com o utilizador ser considerada.

### 2. Análise de Valor de Limite (Boundary Value Analysis)
A maioria dos erros em sistemas de decisão ocorre nos "limites" das condições. No teste `testValor()`, foram validados pontos críticos como `24.9` (limite superior da categoria Normal) e `40.1` (transição para Obesidade Grau III). Esta técnica assegura que o sistema se comporta corretamente exatamente onde a regra muda.

### 3. Asserções Suaves (Soft Assertions)
Através do método `assertAll`, o projeto implementa "Soft Assertions". Diferente de uma asserção comum que interrompe o teste na primeira falha, o `assertAll` executa todas as verificações e reporta todas as falhas encontradas de uma só vez. Isso proporciona um feedback muito mais rico sobre a cobertura da tabela de IMC.

### 4. Tolerância em Ponto Flutuante (Delta)
Devido à forma como os processadores lidam com números decimais (`double`), pequenos erros de arredondamento podem ocorrer. Foi utilizado um **delta de 0.001** no teste de cálculo para garantir que o teste valide a lógica correta e não falhe por imprecisões irrelevantes de hardware.

---
**Projeto Académico - UERJ 2026**
