package com.practice1.photoz_clone.service;

import org.springframework.stereotype.Service;

import com.practice1.photoz_clone.model.Photo;
import com.practice1.photoz_clone.repository.PhotozRepository;

@Service
public class PhotozService {

    private final PhotozRepository photozRepository;

    public PhotozService(PhotozRepository photozRepository) {
        this.photozRepository = photozRepository;
    }

    public Iterable<Photo> get() {
        return photozRepository.findAll();
    }

    public void remove(Integer id) {
        photozRepository.deleteById(id);
    }

    public Photo save(String fileName, String content, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(content);
        photo.setFileName(fileName);
        photo.setData(data);
        return photozRepository.save(photo);
    }

    public Photo get(Integer id) {
        return photozRepository.findById(id).orElse(null);
    }
}
