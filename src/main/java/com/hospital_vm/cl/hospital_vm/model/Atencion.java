package com.hospital_vm.cl.hospital_vm.model;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="atencion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Atencion {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false)
    private Date fecha_atencion;

    @Column(nullable=false)
    private Time hora_atencion;
    
    @Column(nullable=false)
    private Integer costo;

    @ManyToOne
    @JoinColumn(name = "id_paciente", nullable = false, unique = true)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_medico", nullable = false, unique = true)
    private Medico medico;

    @Column(nullable=true)
    private String comentario;
}
