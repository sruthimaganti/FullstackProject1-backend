package com.gallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gallery.model.Artwork;
import com.gallery.repository.ArtworkRepository;

@Service
public class ArtworkService {

    @Autowired
    ArtworkRepository repo;

    public Artwork saveArtwork(Artwork art) {

        return repo.save(art);
    }

    public List<Artwork> getAllArtworks() {

        return repo.findAll();
    }
    public void deleteArtwork(Long id) {

        repo.deleteById(id);
    }
    public Artwork updateArtwork(Long id, Artwork art) {

        Artwork existing = repo.findById(id).orElse(null);

        if(existing != null){

            existing.setTitle(art.getTitle());
            existing.setImageUrl(art.getImageUrl());
            existing.setCategory(art.getCategory());
            existing.setPrice(art.getPrice());

            return repo.save(existing);
        }

        return null;
    }

}