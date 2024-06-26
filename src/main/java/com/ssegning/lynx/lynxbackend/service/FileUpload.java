package com.ssegning.lynx.lynxbackend.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUpload {
    String uploadFile(MultipartFile file) throws IOException;

    Resource downloadFile(String fileName);

    void deleteFile(String fileName);
}
