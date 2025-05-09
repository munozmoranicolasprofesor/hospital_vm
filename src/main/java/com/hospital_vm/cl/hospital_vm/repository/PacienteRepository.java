package com.hospital_vm.cl.hospital_vm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hospital_vm.cl.hospital_vm.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

    List<Paciente> findByApellido(String apellido);
    
    Paciente findByCorreo(String correo);

    List<Paciente> findByNombreAndApellido(String nombre, String Apellido);

    @Query("SELECT p FROM Paciente p WHERE p.apellido= :ap")
    List<Paciente> buscarPorApellido(@Param("apellido") String ap);

    @Query(value="SELECT * FROM paciente WHERE correo = :correo", nativeQuery= true)
    Paciente buscarPorCorreo(@Param("correo") String correo);
}
