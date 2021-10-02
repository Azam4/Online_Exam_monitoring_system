package com.azam.service.impl;


import org.springframework.data.domain.Pageable;

import com.azam.model.Video;

import java.util.List;

public interface VideoServiceImpl {

    Video findById(int id);

    List<Video> findAll(Pageable pageable);

    Video findByTitle(String name);

    Video findByDescription(String description);

    void saveVideoToDB(Video video);

    void deleteVideo(int videoId);

}
