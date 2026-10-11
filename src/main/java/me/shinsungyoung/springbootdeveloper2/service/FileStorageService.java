package me.shinsungyoung.springbootdeveloper2.service;

import me.shinsungyoung.springbootdeveloper2.dto.UploadResponse;

public interface FileStorageService {
    UploadResponse store(byte[] bytes, String filename);
}
