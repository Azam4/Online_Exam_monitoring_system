package com.azam.model;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "videos")

public class Video {

    @Id
   
    @Column(name = "video_id")
    private int videoId;

    private String title;

    private String description;

    private String link;

    public Video() {
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

  
  
    }

