package sk.janobono.sbet.roomwebapp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.janobono.sbet.roomwebapp.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
