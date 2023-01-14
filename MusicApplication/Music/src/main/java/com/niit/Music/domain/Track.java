
package com.niit.Music.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Track {
    @Id
    private int trackId;
    private String trackName;
    private int trackRating;
    private User user;

    public Track() {
    }

    public Track(int trackId, String trackName, int trackRating, User user) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackRating = trackRating;
        this.user = user;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public int getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(int trackRating) {
        this.trackRating = trackRating;
    }

    public User getArtist() {
        return user;
    }

    public void setArtist(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackRating=" + trackRating +
                ", artist=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return trackId == track.trackId && trackRating == track.trackRating && Objects.equals(trackName, track.trackName) && Objects.equals(user, track.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, trackName, trackRating, user);
    }
}
