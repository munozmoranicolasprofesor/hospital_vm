package com.hospital_vm.cl.hospital_vm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital_vm.cl.hospital_vm.model.FichaPaciente;
import com.hospital_vm.cl.hospital_vm.repository.FichaPacienteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class FichaPacienteService {

    @Autowired
    private FichaPacienteRepository fichaPacienteRepository;

    public List<FichaPaciente> findAll(){
        return fichaPacienteRepository.findAll();
    }

    public FichaPaciente findById(Integer id){
        return fichaPacienteRepository.findById(id).get();
    }

    public FichaPaciente save(FichaPaciente fichaPaciente){
        return fichaPacienteRepository.save(fichaPaciente);
    }

    public void delete(Integer id){
        fichaPacienteRepository.deleteById(id);
    }
}
