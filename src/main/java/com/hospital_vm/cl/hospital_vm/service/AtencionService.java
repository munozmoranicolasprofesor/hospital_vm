package com.hospital_vm.cl.hospital_vm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital_vm.cl.hospital_vm.model.Atencion;
import com.hospital_vm.cl.hospital_vm.repository.AtencionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AtencionService {

    @Autowired
    private AtencionRepository atencionRepository;

    public List<Atencion> findAll(){
        return atencionRepository.findAll();
    }

    public Atencion findById(Integer id){
        return atencionRepository.findById(id).get();
    }

    public Atencion save(Atencion atencion){
        return atencionRepository.save(atencion);
    }

    public void delete(Integer id){
        atencionRepository.deleteById(id);
    }
}
