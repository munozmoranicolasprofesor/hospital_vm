package com.hospital_vm.cl.hospital_vm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ficha_paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FichaPaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_paciente", nullable = false, unique = true)
    private Paciente paciente;

    @Column(unique=false, length=100, nullable=false)
    private String datos_personales;

    @Column(unique=false, length=100, nullable=true)
    private String datos_personales2;

    @Column(unique=false, length=100, nullable=true)
    private String datos_personales3;

    @Column(unique=false, length=100, nullable=true)
    private String datos_personales4;

    @Column(unique=false, length=100, nullable=true)
    private String datos_personales5;

    
}
