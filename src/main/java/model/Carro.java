package model;

import java.io.Serializable;

public class Carro implements Serializable {
    private int id;
    private String modelo;
    private int valor;

    public Carro(int id, String modelo, int valor) {
        this.id = id;
        this.modelo = modelo;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    /*
    CREATE DATABASE IF NOT EXISTS tutorialDb;

USE tutorialDb;

DROP TABLE IF EXISTS student;

CREATE TABLE IF NOT EXISTS student (
  student_id int(100) NOT NULL AUTO_INCREMENT,
  student_name varchar(50) DEFAULT NULL,
  roll_number varchar(50) DEFAULT NULL,
  course varchar(50) DEFAULT NULL,
  PRIMARY KEY (student_id)
);

     */
}
