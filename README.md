# Proyecto Backend Base Tp Algoritmos 2 `Kotlin`

[![Build](https://github.com/algo3-unsam/proyecto-base-tp/actions/workflows/build.yml/badge.svg)](https://github.com/algo3-unsam/tp-recetas-2020-gr-xx/actions/workflows/build.yml) ![Coverage](./.github/badges/jacoco.svg)

## Consejos para Gestión de Ramas
- La rama `main` es para el código de producción.
- La rama `dev` es para el desarrollo de nuevas funcionalidades y corrección de errores.
- La rama `qa` es para pruebas y aseguramiento de calidad.

Es altamente recomendado usar la rama `dev` como fuente de verdad para todas las nuevas funcionalidades y correcciones de errores.  
Puedes crear una nueva rama a partir de `dev` y realizar un pull request a `dev` cuando termines tu trabajo.

El orden por defecto para los pull requests es:  
`dev` -> `qa` -> `main`

- Si deseas hacer cambios en la rama `dev`, realiza un pull request desde tu rama actual hacia `dev`.
- Si deseas hacer cambios en la rama `qa`, realiza un pull request desde tu rama actual hacia `qa`.

La rama `main` está protegida y solo puede modificarse mediante un pull request desde `qa`.

---

## Formato y Buenas Prácticas de Código

### Cómo escribir un buen mensaje de commit
1. Mantén el mensaje de commit **breve** (**máximo 50 caracteres**). Si necesitas ayuda, puedes usar [Gitmoji](https://gitmoji.dev/) para inspirarte al redactar mensajes.
2. Usa el **modo imperativo** en los mensajes. Por ejemplo:
    - ✅ "Añadir funcionalidad"
    - ❌ "Añadí funcionalidad"
    - ❌ "Añadiendo funcionalidad"
3. Haz referencia a issues y pull requests después de la primera línea.

### Convención para mensajes de commit
Formato: `<tipo>(<área>): <descripción>`

- **`<tipo>`**: Uno de los definidos anteriormente.
- **`<área>`**: Opcional, describe el módulo o parte afectada.
- **`<descripción>`**: Breve descripción del cambio.

Ejemplo:
```
feat(auth): implementar autenticación por tokens JWT  

Se agregó soporte para autenticación basada en tokens JWT, incluyendo generación y validación.  
Relacionado con #42  
```

---

## Convención para nombres de ramas
Utiliza el siguiente formato: `<tipo>/<2-3 palabras>`

Ejemplo: `feat/agregar-login`

#### Tipos válidos:
- **feat**: Una nueva funcionalidad
- **fix**: Una corrección de errores
- **docs**: Cambios solo en la documentación
- **style**: Cambios que no afectan el funcionamiento del código (espacios, formato, etc.)
- **refactor**: Cambios de código que no corrigen errores ni agregan funcionalidades
- **test**: Agregar o corregir tests existentes
- **merge**: Branch synchronization, typically used to align main with qa or dev after a direct change in main. Not used for conventional pull requests.
- **perf**: Cambios que mejoran el rendimiento
- **chore**: Cambios en procesos de construcción o herramientas auxiliares
- **ci**: Cambios en configuraciones de CI/CD
- **revert**: Revertir un commit previo
- **build**: Cambios que afectan el sistema de construcción o dependencias externas

---

## Estructura de Directorios
La estructura sugerida para un proyecto **Spring Boot con Kotlin** es la siguiente:
```
├── README.md
├── src
│   ├── main
│   │   ├── kotlin
│   │   │   ├── com
│   │   │   │   └── ejemplo
│   │   │   │       └── aplicacion
│   │   │   │           ├── config
│   │   │   │           ├── controller
│   │   │   │           ├── model
│   │   │   │           ├── repository
│   │   │   │           └── service
│   │   └── resources
│   │       ├── application.yml
│   │       └── static
│   └── test
│       ├── kotlin
│       │   └── com
│       │       └── ejemplo
│       │           └── aplicacion
│       └── resources
└── build.gradle.kts
```

---

## Estilo de Código
Se recomienda usar **ktlint** para formatear el código de Kotlin.

### Configuración de `.editorconfig` para ktlint
```editorconfig  
[*.{kt,kts}]  
indent_size=4  
cotinuation_indent_size=4
```

---

## Licencia
Todos los derechos reservados. Copyright (c) 2024 Universidad de San Martin, Buenos Aires, Argentina.