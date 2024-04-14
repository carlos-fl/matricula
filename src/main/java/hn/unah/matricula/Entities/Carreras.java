package hn.unah.matricula.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "carreras")
@Entity
public class Carreras {

    @Id
    @Column(name = "idcarrera")
    private int idCarrera;

    private String nombre;


    @Column(name = "cantidadestudiantes")
    private int cantidadestudiantes;
}