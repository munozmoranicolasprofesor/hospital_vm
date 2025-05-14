package com.hospital_vm.cl.hospital_vm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="medico")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id_medico;

    @Column(unique=true, length=13, nullable=false)
    private String run;

    @Column(nullable=false)
    private String nombre_completo;

    @Column(nullable=false)
    private String especialidad;

    @Column(nullable=false)
    private Boolean jefe_turno;
}
