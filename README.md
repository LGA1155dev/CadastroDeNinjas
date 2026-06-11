# 🥷 Cadastro de Ninjas

API REST em **Spring Boot** para cadastro e gerenciamento de ninjas e suas missões.

## 🚀 O que faz?

- Cadastra **ninjas** (nome, email, idade)
- Cadastra **missões** com nível de dificuldade
- Associa ninjas a missões (muitos ninjas → uma missão)

## 🗂️ Estrutura

```
CadastroDeNinjas/
├── ninjas/
│   ├── NinjaModel.java       # Entidade: tabela tb_cadastro
│   └── NinjaController.java  # Endpoints REST
└── missoes/
    └── MissoesModel.java     # Entidade: tabela tb_missoes
```

## 🗄️ Modelo de Dados

```
tb_missoes          tb_cadastro
──────────          ───────────
id (PK)     ←──FK── missoes_id
name                id (PK)
dificuldade         name
                    email
                    age
```

**Relacionamento:** `ManyToOne` — vários ninjas podem compartilhar uma missão.

### Anotações Lombok nos Models

| Anotação | Efeito |
|---|---|
| `@Data` | Gera getters, setters, `equals`, `hashCode` e `toString` |
| `@NoArgsConstructor` | Construtor vazio (exigido pelo JPA) |
| `@AllArgsConstructor` | Construtor com todos os campos |

## 🛠️ Tecnologias

| Tecnologia | Uso |
|---|---|
| Spring Boot | Framework principal |
| Spring Data JPA | Persistência |
| Jakarta Persistence | Mapeamento ORM |
| Lombok `@Data` `@NoArgsConstructor` `@AllArgsConstructor` | Geração automática de getters, setters, construtores e `toString` |

## ▶️ Como rodar

```bash
./mvnw spring-boot:run
```

Acesse: `GET http://localhost:8080/minha-rota` → retorna `Hello world`

## 📌 Endpoints disponíveis

| Método | Rota | Descrição |
|---|---|---|
| GET | `/minha-rota` | Health check |

> 🚧 Projeto em desenvolvimento — novos endpoints em breve.
