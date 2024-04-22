package com.example.roomwebapp.service;

import java.util.List;

import com.example.roomwebapp.data.RoomRepository;
import com.example.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }
}