package gcm.commands;

import java.io.Serializable;

public class BroadcastCommandRequest implements Request, Serializable {
    public String id, message;

    public BroadcastCommandRequest(String id, String message) {
        this.id = id;
        this.message = message;
    }
}
