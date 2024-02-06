package com.example.Rumahsakit.service;

import com.example.Rumahsakit.entity.Pasien;
import com.example.Rumahsakit.reponsitory.PasienRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

//import java.util.NoSuchFieldException;

@Slf4j
@Service
public class PasienServicelmpl implements PasienService{

    private final PasienRepository pasienRepository;
    @Autowired
    public PasienServicelmpl(PasienRepository pasienRepository){
        this.pasienRepository = pasienRepository;
    }
    @Override
    public  Pasien savePasien(Pasien pasien){
        return  pasienRepository.save(pasien);
    }
    @Override
    public  Pasien getPasien(String idPasien) throws  NoSuchFieldException{
        return  pasienRepository.findById (idPasien).orElseThrow(()->{
            return new NoSuchFieldException("Pasien not found");
        });
    }
    @Override
    public List<Pasien>getAllPasien(){
        return  pasienRepository.findAll();
    }
    @Override
    public  Pasien editPasien(String idPasien, String namaPasien, String tanggalLahir, String gender, String namaDokter, String diagnosa,  String obat) throws  NoSuchFieldException {
        Pasien pasien = pasienRepository.findById(idPasien).orElseThrow(() -> {
            return new NoSuchFieldException("Pasien no found");
        });
        pasien.setPasien(namaPasien);
        pasien.setTanggallahir(tanggalLahir);
        pasien.setGender(gender);
        pasien.setDokter(namaDokter);
        pasien.setDiagnosa(diagnosa);
        pasien.setObat(obat);
        return pasienRepository.save(pasien);
    }

    @Override
    public  void  deletePasien(String IdPasien){
        pasienRepository.deleteById(IdPasien);
    }
}