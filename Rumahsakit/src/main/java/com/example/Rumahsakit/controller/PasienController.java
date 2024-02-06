package com.example.Rumahsakit.controller;

import com.example.Rumahsakit.entity.Pasien;
import com.example.Rumahsakit.service.PasienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/pasiens")

public class PasienController {
    private final PasienService pasienService;

    @Autowired
    public PasienController(PasienService pasienService) {
        this.pasienService = pasienService;
    }

    @PostMapping("/save")
    public ResponseEntity<Pasien> savePasien(@RequestBody Pasien pasien) {
        Pasien response = pasienService.savePasien(pasien);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id-pasien}")
    public ResponseEntity<Pasien> getPasien(@PathVariable("id-pasien") String idPasien) throws NoSuchFieldException {
        Pasien response =pasienService.getPasien(idPasien);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/edit")
    public ResponseEntity<Pasien> editPasien( @RequestParam("id-pasien") String idPasien,
                                              @RequestParam("nama-pasien") String namaPasien,
                                              @RequestParam("tanggal-lahir") String tanggalLahir,
                                              @RequestParam("gender") String gender,
                                              @RequestParam("nama-dokter") String namaDokter,
                                              @RequestParam("diagnosa") String diagnosa,
                                              @RequestParam("obat") String obat) throws NoSuchFieldException {
        Pasien pasien = pasienService.editPasien(idPasien, namaPasien, tanggalLahir, gender, namaDokter, diagnosa, obat);
        return ResponseEntity.ok(pasien);
    }

    @DeleteMapping("/{id-pasien}")
    public ResponseEntity<String> deletePasien(@PathVariable("id-pasien") String idPasien) {
        pasienService.deletePasien(idPasien);
        return ResponseEntity.ok("OK");
    }
}