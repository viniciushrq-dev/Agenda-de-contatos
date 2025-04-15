
# 📒 Agenda de Contatos

Projeto simples de agenda de contatos desenvolvido em Java, com persistência de dados utilizando banco de dados **SQLite**.

## 🔧 Tecnologias utilizadas

- Java (JDK 17+)
- SQLite (via JDBC)
- Git

## 🧠 Funcionalidades

- Inserção de contatos no banco de dados
- Busca de contatos por ID
- Conexão com SQLite
- Estrutura organizada com DAO e boas práticas

## 🗂️ Estrutura de Pastas

```
Projeto/
├── database/
│   ├── BancoConexao.java
│   ├── BancoInicializacao.java
│   └── ClienteDAO.java
├── models/
│   └── Cliente.java
├── Main.java
└── README.md
```

## 🚀 Como rodar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/Viniciushrq-dev/seu-repo.git
```

2. Compile os arquivos:
```bash
javac -cp ".;sqlite-jdbc-<versão>.jar" */*.java Main.java
```

3. Execute:
```bash
java -cp ".;sqlite-jdbc-<versão>.jar" Main
```

## 🤝 Contribuições

Ideias, melhorias ou correções são muito bem-vindas!

---

Feito com ☕ por [Viniciushrq-dev](https://github.com/Viniciushrq-dev)
