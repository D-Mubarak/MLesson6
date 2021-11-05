package com.example.mlesson6;

public class ModelOfFirstFragment {

    private int photos;
    private String first;
    private String second;

    public ModelOfFirstFragment(int photos, String first, String second) {
        this.photos = photos;
        this.first = first;
        this.second = second;
    }

    public int getPhotos() {
        return photos;
    }

    public void setPhotos(int photos) {
        this.photos = photos;
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }


}
