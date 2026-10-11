package me.shinsungyoung.springbootdeveloper2.controller;

import me.shinsungyoung.springbootdeveloper2.dto.UploadResponse;
import me.shinsungyoung.springbootdeveloper2.service.FileStorageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class UploadController {

    private final FileStorageService fileStorageService;

    public UploadController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @PostMapping("/api/upload")
    public ResponseEntity<UploadResponse> uploadFIle(@RequestParam("file") MultipartFile file) throws IOException {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(fileStorageService.store(
                        file.getBytes(),
                        file.getOriginalFilename()
                ));
    }
}
