package com.example.Rumahsakit.service;
import com.example.Rumahsakit.entity.Pasien;

import java.util.List;

public interface PasienService {
    Pasien savePasien(Pasien pasien);
    Pasien getPasien(String idPasien) throws  NoSuchFieldException;
    List<Pasien> getAllPasien();
    Pasien editPasien(String idPasien, String namaPasien, String tanggalLahir,
                      String gender, String namaDokter, String diagnosa,  String obat) throws  NoSuchFieldException;
     void  deletePasien(String idPasien);

}
