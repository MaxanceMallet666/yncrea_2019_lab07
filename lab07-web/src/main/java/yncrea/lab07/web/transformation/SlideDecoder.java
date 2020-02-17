package yncrea.lab07.web.transformation;

import com.fasterxml.jackson.databind.ObjectMapper;
import yncrea.lab07.web.dto.Slide;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import java.io.IOException;

public class SlideDecoder implements Decoder.Text<Slide> {

    private ObjectMapper mapper;

    @Override
    public boolean willDecode(String s) {
        //TODO Tester la classe de la valeur : JSON ou non?
        boolean done = true;
        /*try{
            decode(s);
            done=true;
        }catch (DecodeException e)
        {
            e.printStackTrace();
        }*/
        return done;
    }

    @Override
    public void destroy() {
        mapper=null;
    }

    @Override
    public Slide decode(String s) throws DecodeException {

        Slide slide=null;
        try {
            slide=mapper.readValue(s,Slide.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return slide;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        this.mapper=new ObjectMapper();
    }
}
