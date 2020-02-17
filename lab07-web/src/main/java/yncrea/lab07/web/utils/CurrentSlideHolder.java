package yncrea.lab07.web.utils;

import yncrea.lab07.web.dto.Slide;

public class CurrentSlideHolder {

    private static CurrentSlideHolder currentSlideHolder=null;
    private Slide slide;

    private CurrentSlideHolder() {
    }

    public static CurrentSlideHolder getInstance()
    {
        if(currentSlideHolder==null)
        {
            currentSlideHolder=new CurrentSlideHolder();
        }
        return (currentSlideHolder);
    }

    public Slide getCurrentSlide() {
        return slide;
    }

    public void setCurrentSlide(Slide slide) {
        this.slide = slide;
    }

}
