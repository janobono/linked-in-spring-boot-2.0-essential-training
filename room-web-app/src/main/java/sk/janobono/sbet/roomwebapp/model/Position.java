package sk.janobono.sbet.roomwebapp.model;

public enum Position {
    HOUSEKEEPING("Housekeeping"),
    FRONT_DESK("Front Desk"),
    SECURITY("Security"),
    CONCIERGE("Concierge");

    private final String value;

    Position(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
