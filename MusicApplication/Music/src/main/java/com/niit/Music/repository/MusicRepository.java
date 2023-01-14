package com.niit.Music.repository;

import com.niit.Music.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MusicRepository extends MongoRepository<Track,Integer> {

    @Query("{'user.userName':{$in:[?0]}}")
    public List<Track> findByArtist(String userName);
    @Query("{'trackRating':{$gte:4}}")
    public List<Track> findByRating(Integer trackRating);
}
