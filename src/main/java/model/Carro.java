package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tbl_carro")
public class Carro implements Serializable {
    @Id
    private int id;
    @Column
    private String modelo;
    @Column
    private float valor;

    public Carro(int id, String modelo, float valor) {
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

    public void setValor(float valor) {
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
