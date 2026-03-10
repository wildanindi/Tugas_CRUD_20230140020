package com.tugas.ktp_api.mapper;

import com.tugas.ktp_api.model.dto.KtpAddRequest;
import com.tugas.ktp_api.model.dto.KtpDto;
import com.tugas.ktp_api.model.entity.Ktp;

public interface KtpMapper {

    // Dari Input Web (Request) ke Database (Entity)
    static Ktp mapToEntity(KtpAddRequest request) {
        Ktp ktp = new Ktp();
        ktp.setNomorKtp(request.getNomorKtp());
        ktp.setNamaLengkap(request.getNamaLengkap());
        ktp.setAlamat(request.getAlamat());
        ktp.setTanggalLahir(request.getTanggalLahir());
        ktp.setJenisKelamin(request.getJenisKelamin());
        return ktp;
    }

    // Dari Database (Entity) ke Balikan Web (DTO)
    static KtpDto mapToDto(Ktp ktp) {
        KtpDto dto = new KtpDto();
        dto.setId(ktp.getId());
        dto.setNomorKtp(ktp.getNomorKtp());
        dto.setNamaLengkap(ktp.getNamaLengkap());
        dto.setAlamat(ktp.getAlamat());
        dto.setTanggalLahir(ktp.getTanggalLahir());
        dto.setJenisKelamin(ktp.getJenisKelamin());
        return dto;
    }
}
