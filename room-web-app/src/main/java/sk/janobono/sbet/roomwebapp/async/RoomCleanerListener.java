package sk.janobono.sbet.roomwebapp.async;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import sk.janobono.sbet.roomwebapp.model.Room;
import sk.janobono.sbet.roomwebapp.service.RoomService;

@Component
public class RoomCleanerListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoomCleanerListener.class);

    private final ObjectMapper objectMapper;

    private final RoomService roomService;

    public RoomCleanerListener(ObjectMapper objectMapper, RoomService roomService) {
        this.objectMapper = objectMapper;
        this.roomService = roomService;
    }

    public void receiveMessage(String message) {
        try {
            AsyncPayload payload = objectMapper.readValue(message, AsyncPayload.class);
            if ("ROOM".equals(payload.model())) {
                Room room = roomService.getRoom(payload.id());
                LOGGER.info("ROOM {}:{} needs to be cleaned", room.getNumber(), room.getName());
            } else {
                LOGGER.warn("Unknown model");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
