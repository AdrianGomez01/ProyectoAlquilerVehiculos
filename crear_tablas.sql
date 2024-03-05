CREATE TABLE VEHICULO (
    id_vehiculo SERIAL PRIMARY KEY,
    marca VARCHAR(45),
    modelo VARCHAR(45),
    tipo VARCHAR(45),
    matricula VARCHAR(45),
    kilometraje_coche INT
);

CREATE TABLE CONDUCTOR (
    id_conductor SERIAL PRIMARY KEY,
    nombre VARCHAR(45),
    apellido1 VARCHAR(45),
    apellido2 VARCHAR(45),
    DNI VARCHAR(9),
    tipo_carnet VARCHAR(45),
    años_carnet INT
);

CREATE TABLE SERVICIO (
    id_servicio SERIAL PRIMARY KEY,
    idVehiculo INT,
    idConductor INT,
    fecha_inicio DATE,
    fecha_final DATE,
    kilometraje_servicio INT,
    finalizado BOOLEAN,
    precio FLOAT,
    FOREIGN KEY (idVehiculo) REFERENCES VEHICULO(id_vehiculo),
    FOREIGN KEY (idConductor) REFERENCES CONDUCTOR(id_conductor)
);
