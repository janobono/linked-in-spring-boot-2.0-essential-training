package sk.janobono.sbet.roomwebapp.service;

import org.springframework.stereotype.Service;
import sk.janobono.sbet.roomwebapp.data.RoomRepository;
import sk.janobono.sbet.roomwebapp.model.Room;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getRoom(long id) {
        return roomRepository.getReferenceById(id);
    }
}
