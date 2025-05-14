package com.hospital_vm.cl.hospital_vm.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true, length=13, nullable=false)
    private String run;

    @Column(nullable=false)
    private String nombre;

    @Column(nullable=false)
    private String apellido;

    @Column(nullable=true)
    private Date fechaNacimiento;

    @Column(nullable=false)
    private String correo;

    @ManyToOne
    
    @JoinColumn(name = "id_tipo", nullable = false, unique = true)
    private TipoUsuario tipoUsuario;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    @JsonIgnore
    private FichaPaciente fichaPaciente;

    @OneToMany(mappedBy = "paciente")
    @JsonIgnore
    private List<Atencion> atenciones;
}
