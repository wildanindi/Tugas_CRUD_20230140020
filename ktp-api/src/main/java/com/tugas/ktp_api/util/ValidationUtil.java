package com.tugas.ktp_api.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ValidationUtil {
    public static void validateNomorKtpExists(boolean exists) {
        if (exists) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Nomor KTP sudah terdaftar!");
        }
    }
}
