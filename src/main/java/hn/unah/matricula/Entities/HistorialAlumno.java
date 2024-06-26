package hn.unah.matricula.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "historialalumno")
public class HistorialAlumno {


    @Column(name = "idhistorial")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    private int idHistorial;

    @OneToOne()
    @JoinColumn(name = "numerocuenta", referencedColumnName = "numerocuenta")
    @JsonBackReference
    @JsonIgnore
    private Alumnos alumnos;

    @OneToMany
    @JsonBackReference
    @JsonIgnore
    private List<Seccion> secciones;

    @JoinColumn(name = "idnota", referencedColumnName = "idnota")
    @OneToOne
    @JsonIgnore
    @JsonBackReference
    private Notas notas;

    
}
