Calculadora Trabalhista – Java + Spring Boot + HTML/CSS/JS
Projeto simples de calculadora trabalhista para estudo de Java Web, usando Spring Boot no backend e HTML/CSS/JavaScript no frontend.​
O objetivo é calcular itens como férias, 13º e rescisão básica a partir de dados de salário e contrato.​

Tecnologias
Java 17+

Spring Boot (API REST)​

Maven ou Gradle (build)​

HTML5, CSS3, JavaScript puro (frontend)​​

Arquitetura do projeto
Backend em Spring Boot expondo endpoints REST para cálculo trabalhista.​

Frontend estático (HTML/CSS/JS) consumindo os endpoints via fetch.​​

Estrutura básica (ajuste se mudar o nome dos pacotes):

text
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
Essa estrutura separa bem as responsabilidades entre API e interface web, mantendo o código organizado para crescimento futuro.​

Funcionalidades previstas (MVP)
Enviar dados de entrada: salário, tipo de contrato e datas básicas.

Calcular valores iniciais (ex.: férias proporcionais e 13º proporcional).

Retornar resultados em JSON pela API e exibir em tela.​

Vamos começar com poucos campos e fórmulas simples, evoluindo aos poucos (novos endpoints ou novos campos de request/response).​

Como rodar o backend
Entre na pasta backend/.

Configure o projeto Spring Boot (via Spring Initializr ou importando na IDE).​

Com Maven: mvn spring-boot:run

A API ficará acessível em http://localhost:8080 (ex.: GET /actuator/health ou GET /api/ping se criarmos um).​

Como rodar o frontend
Entre na pasta frontend/.

Abra index.html no navegador ou use uma extensão de “Live Server” da IDE.​​

O JavaScript irá chamar a API do Spring Boot (ex.: http://localhost:8080/api/calculos).​

Certifique-se de que o backend está rodando antes de testar os cálculos pelo navegador.​

Próximos passos (checklist)
 Criar projeto Spring Boot básico (endpoint de teste /api/ping).​

 Implementar classe de modelo para entrada de cálculo (request).

 Implementar serviço CalculadoraTrabalhistaService com regras iniciais.

 Criar controlador REST /api/calculos.​

 Montar index.html com formulário de dados.

 Implementar script.js chamando a API via fetch.​

 Estilizar com styles.css.
