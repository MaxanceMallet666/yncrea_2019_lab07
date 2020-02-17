package yncrea.lab07.web.data;

import yncrea.lab07.web.dto.Slide;

import javax.websocket.EncodeException;
import javax.websocket.Session;
import java.io.IOException;

public class SlideSession {

    private Session session;

    public SlideSession(Session session) {
        this.session = session;
    }


    public void send(Object object)
    {
        try {
            session.getBasicRemote().sendObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EncodeException e) {
            e.printStackTrace();
        }
    }


    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
