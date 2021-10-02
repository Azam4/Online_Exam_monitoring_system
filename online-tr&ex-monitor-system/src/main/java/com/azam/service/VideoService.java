package com.azam.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.azam.model.Video;
import com.azam.service.impl.VideoServiceImpl;
@Service
public class VideoService implements VideoServiceImpl{

	@Override
	public Video findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Video> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Video findByTitle(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Video findByDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveVideoToDB(Video video) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteVideo(int videoId) {
		// TODO Auto-generated method stub
		
	}

}
