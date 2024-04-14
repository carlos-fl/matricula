package hn.unah.matricula.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "equipos")

public class Equipos {

    @Id
    @Column(name = "idequipo")
    private int idEquipo;

    @Column(name = "tipoequipo")
    private int tipoEquipo;

    private String descripcion;


    
}