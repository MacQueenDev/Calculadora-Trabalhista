🧮 **Calculadora Trabalhista**

**Java + Spring Boot + HTML/CSS/JavaScript**

A Calculadora Trabalhista é um projeto simples desenvolvido para estudo de Java Web, utilizando Spring Boot como backend e HTML/CSS/JavaScript no frontend.
O objetivo é realizar cálculos básicos como férias proporcionais, 13º salário e rescisão, a partir de informações inseridas pelo usuário.

🚀 **Tecnologias Utilizadas — Backend**

☕ **Java 17+**
🌱 **Spring Boot (API REST)**
📦 **Maven ou Gradle**



🎨 **Tecnologias Utilizadas — Frontend**

🎨 **HTML5**
🎨 **CSS3**
⚡ **JavaScript Puro**



🏗️ ***Arquitetura do Projeto***

📌 Backend → Spring Boot expondo endpoints REST para os cálculos.
📌 Frontend → HTML/CSS/JS consumindo a API via `fetch`.

Essa estrutura separa claramente interface, lógica e cálculos de negócio.

📁 Estrutura de Pastas
calculadora-trabalhista/
  backend/
    src/main/java/com/seuusuario/calctrab/
      CalculadoraTrabalhistaApplication.java
      controller/
      service/
      model/
    src/main/resources/
      application.properties

  frontend/
    index.html
    styles.css
    script.js

✨ Funcionalidades (MVP)

📤 Entrada de dados: salário, tipo de contrato e datas.

🧠 Cálculo de férias proporcionais e 13º proporcional.

📦 Retorno em JSON pela API.

🖥️ Exibição dos valores no frontend.

▶️ Como Rodar o Backend

Entre na pasta `backend/`

Configure o projeto Spring Boot

Execute:

mvn spring-boot:run


A API ficará disponível em:

http://localhost:8080


Endpoints úteis:

GET `/actuator/health`

GET `/api/ping` (se criado)

💻 Como Rodar o Frontend

Entre na pasta `frontend/`

Abra o arquivo `index.html` no navegador
ou utilize Live Server da sua IDE.

O frontend consumirá a API:

http://localhost:8080/api/calculos

📌 Próximos Passos (Checklist)

 Criar projeto Spring Boot básico

 Criar endpoint `/api/ping`

 Criar classe de modelo para request

 Implementar `CalculadoraTrabalhistaService`

 Criar controlador REST `/api/calculos`

 Criar formulário no `index.html`

 Consumir API no `script.js`

 Estilizar com `styles.css`
