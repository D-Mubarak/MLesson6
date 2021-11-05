package com.example.mlesson6;

public class ModelOfSecondFragment {
    private String infoComment, TimeInfo;
    private int imageStart, imageEnd;

    public String getInfoComment() {
        return infoComment;
    }

    public void setInfoComment(String infoComment) {
        this.infoComment = infoComment;
    }

    public String getTimeInfo() {
        return TimeInfo;
    }

    public void setTimeInfo(String timeInfo) {
        TimeInfo = timeInfo;
    }

    public int getImageStart() {
        return imageStart;
    }

    public void setImageStart(int imageStart) {
        this.imageStart = imageStart;
    }

    public int getImageEnd() {
        return imageEnd;
    }

    public void setImageEnd(int imageEnd) {
        this.imageEnd = imageEnd;
    }

    public ModelOfSecondFragment(String infoComment, String timeInfo, int imageStart, int imageEnd) {
        this.infoComment = infoComment;
        TimeInfo = timeInfo;
        this.imageStart = imageStart;
        this.imageEnd = imageEnd;
    }
}
