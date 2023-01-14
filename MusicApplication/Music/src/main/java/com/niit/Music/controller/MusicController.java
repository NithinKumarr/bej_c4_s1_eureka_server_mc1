
package com.niit.Music.controller;

import com.niit.Music.domain.Track;
import com.niit.Music.exception.ArtistNotFoundException;
import com.niit.Music.exception.MusicAlreadyExistException;
import com.niit.Music.exception.MusicNotFoundException;
import com.niit.Music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/musicservice")
public class MusicController {
    @Autowired
    MusicService musicService;
    @PostMapping("/Music")
    public ResponseEntity<?>add(@RequestBody Track track) throws MusicAlreadyExistException {
        return new ResponseEntity<>(musicService.addTrack(track), HttpStatus.OK);
    }
    @GetMapping("/Music")
    public ResponseEntity<?>get(){
        return new ResponseEntity<>(musicService.getAll(),HttpStatus.OK);
    }
    @DeleteMapping("/music/{id}")
    public ResponseEntity<?>delete(@PathVariable Integer id) throws MusicNotFoundException {
        return new ResponseEntity<>(musicService.delete(id),HttpStatus.OK);
    }
    @GetMapping("/artist/{artist}")
    public ResponseEntity<?>getByUser(@PathVariable String artist) throws ArtistNotFoundException {
        return new ResponseEntity<>(musicService.findByUser(artist),HttpStatus.OK);
    }
    @GetMapping("/rating/{trackRating}")
    public ResponseEntity<?>getByRating(@PathVariable Integer trackRating){
        return new ResponseEntity<>(musicService.findByRating(trackRating),HttpStatus.OK);
    }
}
