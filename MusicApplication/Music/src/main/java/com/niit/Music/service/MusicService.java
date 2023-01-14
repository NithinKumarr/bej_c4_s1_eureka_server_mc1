package com.niit.Music.service;

import com.niit.Music.domain.Track;
import com.niit.Music.exception.ArtistNotFoundException;
import com.niit.Music.exception.MusicAlreadyExistException;
import com.niit.Music.exception.MusicNotFoundException;

import java.util.List;

public interface MusicService {
    public Track addTrack(Track track) throws MusicAlreadyExistException;
    public List<Track> getAll();
    public String delete(Integer trackId) throws MusicNotFoundException;
    public List<Track> findByUser(String userName) throws ArtistNotFoundException;
    public List<Track> findByRating(Integer trackRating);
}
