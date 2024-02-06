package com.example.Rumahsakit.reponsitory;
import com.example.Rumahsakit.entity.Pasien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasienRepository extends JpaRepository<Pasien, String> {
}
