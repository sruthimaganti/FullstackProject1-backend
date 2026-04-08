package com.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gallery.model.Artwork;
import com.gallery.service.ArtworkService;

@RestController
@RequestMapping("/api/artworks")
@CrossOrigin(origins="*")

public class ArtworkController {

    @Autowired
    ArtworkService service;

    @PostMapping
    public Artwork save(@RequestBody Artwork art) {

        return service.saveArtwork(art);
    }

    @GetMapping
    public List<Artwork> getAll() {

        return service.getAllArtworks();
    }

    @DeleteMapping("/{id}")
    public void deleteArtwork(@PathVariable Long id) {

        service.deleteArtwork(id);
    }
    @PutMapping("/{id}")
    public Artwork updateArtwork(@PathVariable Long id, @RequestBody Artwork art) {

        return service.updateArtwork(id, art);
    }
}