package yncrea.lab07.web.transformation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import yncrea.lab07.web.dto.Slide;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class SlideEncoder implements Encoder.Text<Slide> {

    private ObjectMapper mapper;

    @Override
    public String encode(Slide slide) throws EncodeException {
        String s=null;
        try {
            s=mapper.writeValueAsString(slide);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        this.mapper=new ObjectMapper();
    }

    @Override
    public void destroy() {
        mapper=null;
    }
}
