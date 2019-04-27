package gcm.commands;

import java.io.Serializable;

public class BroadcastCommandResponse implements Response, Serializable {
    public String id;
    public Boolean ok;

    public BroadcastCommandResponse(String id, boolean ok) {
        this.id = id;
        this.ok = ok;
    }
}
