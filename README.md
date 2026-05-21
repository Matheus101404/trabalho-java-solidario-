
# trabalho-java-solidario-
DIAGRAMA UML
<img width="1145" height="676" alt="WhatsApp Image 2026-04-23 at 09 37 21" src="https://github.com/user-attachments/assets/84b04492-cb87-462e-8bed-b3ba627b5e0e" />

# 🏢 Rede Solidária de Doação e Reaproveitamento

## 📌 Sobre o Projeto
Este projeto consiste em uma aplicação robusta desenvolvida em Java estruturada sob o paradigma de Programação Orientada a Objetos (POO). O objetivo principal é apoiar o cadastro, gerenciamento, priorização e distribuição de itens doados para pessoas, famílias ou instituições (como ONGs, escolas e abrigos) em situação de vulnerabilidade. 

O sistema visa solucionar a falta de organização e rastreabilidade no ciclo de doações, promovendo o consumo consciente e a redução de desperdícios na sociedade.

### 🌍 Alinhamento com as Metas ODS (Objetivos de Desenvolvimento Sustentável)
escopo do software está diretamente conectado às seguintes diretrizes globais da ONU:
* 1: Erradicação da Pobreza 
* 2: Fome Zero e Agricultura Sustentável
* 10: Redução das Desigualdades 
* 12: Consumo e Produção Responsáveis 

---

## 🛠️ Arquitetura e Estrutura do Código
A aplicação foi organizada seguindo o padrão multicamadas baseado em responsabilidade única, conforme sugerido nas restrições pedagógicas do desafio:

* `src/model/`: Contém as classes de domínio e mapeamento de entidades.
* `src/repository/`: Gerencia e simula a persistência e armazenamento de dados em coleções na memória (`ArrayList`).
* `src/service/`: Concentra as regras de negócio e intermediação lógica do sistema.
* `src/util/`: Pacote com rotinas utilitárias, como formatação de dados e validações estruturadas.
* `src/main/`: Classe executável principal com a interface via console de terminal.

---

##  Status das Funcionalidades Entregues (Até Checkpoint 2)

  1. Gestão de Usuários e Entidades (Herdada do Checkpoint 1)
* Modelagem com Herança: Implementação da classe base abstrata `Usuario` [cite: 31, 32][cite_start], estendida pelas classes filhas especialistas `Doador` e `Beneficiario`.
* Gestão de Beneficiários: Atribuição dinâmica do tipo de instituição (*Abrigo, ONG, Escola, etc.) e classificação de públicos prioritários (PCD/Idosos, Crianças, Geral).
* Relatório Customizado: Exibição da listagem de beneficiários exibindo o nome e o nível de prioridade lado a lado em tempo real.

### 📦 2. Cadastro Inteligente de Itens para Doação
* Geração Dinâmica de IDs: IDs sequenciais e automáticos controlados diretamente na camada de persistência (`itens.size() + 1`), blindando a aplicação contra sobreposição de dados.
* [cite_start]**Uso de Constantes Estáticas:** Centralização das categorias obrigatórias (*Alimento, Higiene, Móveis, Roupa*) [cite: 19, 50] via variáveis `public static final String` na model para evitar falhas de digitação (*Hardcoding*).
* [cite_start]**Menus Auxiliares:** Interface numérica interativa para capturar e mapear o Estado de Conservação (*Novo*, *Semi-Novo*)[cite: 53].

### ⚙️ 3. Regras de Negócio e Validações (Foco do Checkpoint 2)
* Fluxo de Solicitação Otimizado: Ao iniciar o pedido, o sistema solicita o CPF do beneficiário. Em seguida, exibe um catálogo dinâmico listando somente os itens disponíveis em estoque para que o usuário escolha visualmente o ID pretendido, garantindo fluidez operacional.
* Algoritmo de Busca Blindado: Correção estrutural na camada Repository substituindo operadores primitivos de comparação de memória (`==`) pelo método `.equalsIgnoreCase()`, viabilizando buscas precisas por strings textuais de CPFs.
* Ciclo de Vida do Status: Atualização automatizada do ciclo de status do item , transitando de `DISPONIVEL` para `RESERVADO` assim que a solicitação é aceita e validada.

---

## 📋 Menu Geral do Terminal
1. `1 - Cadastrar Item para Doação` 
2. `2 - Listar Itens` 
3. `3 - Solicitar Item` 
4. `4 - Cadastrar Doador` 
5. `5 - Listar Doadores` 
6. `6 - Cadastrar Beneficiario` 
7. `7 - Listar Beneficiarios` 
8. `0 - Sair`

