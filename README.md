```markdown
# API Gasolinera

Este proyecto es una API para la gestión de gasolineras. Proporciona funcionalidades para consultar precios de combustible, tipos de combustibles y otros detalles relevantes.

## Características

- Consulta de precios de combustibles en distintas gasolineras.
- Informacion sobre distintos tipos de combustibles con precios .
- Información detallada sobre cada surtidor, informacion de capacidad de tanques de gasolina, etc... .

## Requisitos

- Java 11 o superior
- Maven 3.6.3 o superior

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/pmontanana/API_Gasolinera.git
   cd API_Gasolinera
   ```

2. Compila el proyecto usando Maven:
   ```bash
   mvn clean install
   ```

## Uso

### Ejecución del servidor

Para ejecutar el servidor, usa el siguiente comando:
```bash
mvn spring-boot:run
```

### Endpoints

La API expone los siguientes endpoints:

- `POST /api/productos/crear`
- `GET /api/productos/crear`
- `PUT /api/productos/editar`
- `POST /api/surtidores/crear`
- `GET /api/surtidores/traer`
- `POST /api/tanques/crear`
- `PUT /api/tanques/editar/{id},{nivelActual}`
- `GET /api/tanques/traer`
- `POST /api/precios/crear`
- `PUT /api/precios/editar/{id},{precioPorLitro}`
- `POST /api/surtidor-productos/crear`
- `POST /api/suministros/crear`
- `GET /api/suministros/traer`
- `DELETE /api/suministros/borrar/{id}`

### Ejemplos de uso

#### Utilizar POSTMAN para probar a obtener, poner, actualizar o quitar informacion



Recuerda actualizar cualquier información específica de tu proyecto, como el correo electrónico de contacto y cualquier otra configuración o instrucción relevante.
