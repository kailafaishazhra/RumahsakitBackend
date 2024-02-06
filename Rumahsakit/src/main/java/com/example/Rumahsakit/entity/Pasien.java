package com.example.Rumahsakit.entity;

//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity

public class Pasien {
    @Id
    private String idPasien;
    @Column(name = "namapasien")
    private String pasien;
    @Column(name ="tanggallahir" )
    private String tanggallahir;
    @Column(name = "gender")
    private String gender;
    @Column(name = "namadokter")
    private String dokter;
    @Column(name = "diagnosa")
    private String diagnosa;
    @Column(name = "obat")
    private String obat;
}
