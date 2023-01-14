
package com.niit.Music.service;

import com.niit.Music.domain.Track;
import com.niit.Music.exception.ArtistNotFoundException;
import com.niit.Music.exception.MusicAlreadyExistException;
import com.niit.Music.exception.MusicNotFoundException;
import com.niit.Music.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    MusicRepository musicRepository;

    @Override
    public Track addTrack(Track track) throws MusicAlreadyExistException {
        if (musicRepository.findById(track.getTrackId()).isEmpty()) {
            Track track1 = musicRepository.save(track);
            return track1;
        }
        throw new MusicAlreadyExistException();
    }

    @Override
    public List<Track> getAll() {
        return musicRepository.findAll();
    }

    @Override
    public String delete(Integer trackId) throws MusicNotFoundException {
        if (musicRepository.findById(trackId).isEmpty()) {
            throw new MusicNotFoundException();
        }
        musicRepository.deleteById(trackId);
        return "Track deleted Successfully";
    }

    @Override
    public List<Track> findByUser(String userName) throws ArtistNotFoundException {
        return musicRepository.findByArtist(userName);
    }

    @Override
    public List<Track> findByRating(Integer trackRating) {
        return musicRepository.findByRating(trackRating);
    }
}
