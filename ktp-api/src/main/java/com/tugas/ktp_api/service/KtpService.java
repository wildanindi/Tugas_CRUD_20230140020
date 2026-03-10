package com.tugas.ktp_api.service;

import com.tugas.ktp_api.model.dto.KtpAddRequest;
import com.tugas.ktp_api.model.dto.KtpDto;
import java.util.List;

public interface KtpService {
    KtpDto createKtp(KtpAddRequest request);
    List<KtpDto> getAllKtp();
    KtpDto getKtpById(Integer id);
    KtpDto updateKtp(Integer id, KtpAddRequest request);
    void deleteKtp(Integer id);
}
