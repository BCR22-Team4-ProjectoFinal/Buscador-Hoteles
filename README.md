# Buscador-Hoteles

URL: https://app-mysql-database.herokuapp.com

## ENDPOINTS

| Request | Path hoteles| Path habitaciones | Path reservas | Path poblaciones | Path usuarios |
| --- | --- | --- | --- | --- | --- |
| GET | /api/hoteles | /api/habitaciones | /api/reservas | /api/poblaciones | /api/usuarios |
| POST | /api/hoteles | /api/habitaciones | /api/reservas | /api/poblaciones | /api/usuarios |
| GET | /api/hoteles/{id} | /api/habitaciones/{id} | /api/reservas/{id} | /api/poblaciones/{id} | /api/usuarios/{id} |
| PUT | /api/hoteles/{id} | /api/habitaciones/{id} | /api/reservas/{id} | /api/poblaciones/{id} | /api/usuarios/{id} |
| DELETE | /api/hoteles/{id} | /api/habitaciones/{id} | /api/reservas/{id} | /api/poblaciones/{id} | /api/usuarios/{id} |

## **GET enpoint example for /api/hoteles path:**

```
[
    {
        "id": 1,
        "num_habitacion": 101,
        "libre": true,
        "precio_noche": 50.0,
        "num_personas": 2,
        "planta": 1,
        "hotel": {
            "id": 1,
            "nombre": "Miami",
            "categoria": "4",
            "latitud": "0.001",
            "longitud": "0.002",
            "poblacion": {
                "id": 1,
                "nombre": "Amposta, Tarragona, Catalunya, ESP",
                "cp": "43870"
            }
        }
    },
    {
        "id": 11,
        "num_habitacion": 122,
        "libre": true,
        "precio_noche": 68.0,
        "num_personas": 2,
        "planta": 1,
        "hotel": {
            "id": 11,
            "nombre": "Varadero",
            "categoria": "4",
            "latitud": "0.011",
            "longitud": "0.002",
            "poblacion": {
                "id": 11,
                "nombre": "Tortosa, Tarragona, Catalunya, ESP",
                "cp": "43500"
            }
        }
    },
    {
        "id": 21,
        "num_habitacion": 319,
        "libre": true,
        "precio_noche": 79.0,
        "num_personas": 2,
        "planta": 3,
        "hotel": {
            "id": 21,
            "nombre": "Hotel Sagrada Familia",
            "categoria": "4",
            "latitud": "41.406011997141135",
            "longitud": "2.1714746821687227",
            "poblacion": {
                "id": 21,
                "nombre": "Madrid, Madrid, Comunidad de Madrid, ESP",
                "cp": "28014"
            }
        }
    },
    {
        "id": 31,
        "num_habitacion": 187,
        "libre": true,
        "precio_noche": 123.0,
        "num_personas": 2,
        "planta": 1,
        "hotel": {
            "id": 31,
            "nombre": "Hotel Nuevo Madrid",
            "categoria": "4",
            "latitud": "40.46972",
            "longitud": "-3.66903",
            "poblacion": {
                "id": 31,
                "nombre": "Barcelona, Barcelona, Cataluña, ESP",
                "cp": "08002"
            }
        }
    },
    {
        "id": 41,
        "num_habitacion": 133,
        "libre": true,
        "precio_noche": 49.0,
        "num_personas": 2,
        "planta": 1,
        "hotel": {
            "id": 41,
            "nombre": "Nastasi Hotel & Spa",
            "categoria": "4",
            "latitud": "41.630785916521596",
            "longitud": "0.5970251840229278",
            "poblacion": {
                "id": 41,
                "nombre": "Lérida, Lérida, Cataluña, ESP",
                "cp": "25007"
            }
        }
    }
]
```



