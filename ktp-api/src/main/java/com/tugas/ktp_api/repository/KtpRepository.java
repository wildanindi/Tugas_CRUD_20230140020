package com.tugas.ktp_api.repository;


import com.tugas.ktp_api.model.entity.Ktp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KtpRepository extends JpaRepository<Ktp, Integer> {
    boolean existsByNomorKtp(String nomorKtp);
}
