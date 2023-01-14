///*
// * Author Name: Philip Meshach
// * Date: 30-12-2022
// * Praise The Lord
// */
//package com.niit.Muzix.repository;
//
//import com.niit.Muzix.domain.User;
//import com.niit.Muzix.domain.Track;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@ExtendWith(SpringExtension.class)
//@DataMongoTest
//public class RepositoryTest {
//    @Autowired
//    private MuzixRepository muzixRepository;
//    private Track track;
//    private User user;
//
//    @BeforeEach
//    public void setUp(){
//        this.user = new User("@we","Finn");
//        this.track = new Track(1,"hello",9,this.user);
//    }
//    @Test
//    public void addTrackSuccess(){
//        muzixRepository.save(track);
//       Track track1 =  muzixRepository.findById(track.getTrackId()).get();
//       assertEquals(track,track1);
//    }
//    @Test
//    public void deleteTrack(){
//        this.track = new Track(2,"Hello",6,this.user);
//        muzixRepository.insert(track);
//        Track t2 = muzixRepository.findById(track.getTrackId()).get();
//        muzixRepository.delete(t2);
//        assertEquals(Optional.empty(),muzixRepository.findById(track.getTrackId()));
//    }
//
//    @Test
//    public void getTracks(){
//        muzixRepository.deleteAll();
//        this.track = new Track(3,"Woee",7,this.user);
//        this.user = new User("3@35","Fuse");
//        muzixRepository.insert(track);
//        List<Track> lt = muzixRepository.findAll();
//        assertEquals(1,lt.size());
//    }
//
//    @AfterEach
//    public void tearDown(){
//        this.user = null;
//        this.track = null;
//    }
//}
