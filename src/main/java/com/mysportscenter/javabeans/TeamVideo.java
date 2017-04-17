package com.mysportscenter.javabeans;

/**
 * Created by Jason on 4/17/17.
 */
public class TeamVideo {
    private String id;
    private int version;
    private String refKeyForTeam;
    private String refKeyForPersonal;
    private String video_theme;
    private String videoThubnailsPath;
    private String teamVideoPath;
    private String updateTime;
    private String custom1;
    private String custom2;
    private String custom3;
    private String custom4;
    private String custom5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getRefKeyForTeam() {
        return refKeyForTeam;
    }

    public void setRefKeyForTeam(String refKeyForTeam) {
        this.refKeyForTeam = refKeyForTeam;
    }

    public String getRefKeyForPersonal() {
        return refKeyForPersonal;
    }

    public void setRefKeyForPersonal(String refKeyForPersonal) {
        this.refKeyForPersonal = refKeyForPersonal;
    }

    public String getVideo_theme() {
        return video_theme;
    }

    public void setVideo_theme(String video_theme) {
        this.video_theme = video_theme;
    }

    public String getVideoThubnailsPath() {
        return videoThubnailsPath;
    }

    public void setVideoThubnailsPath(String videoThubnailsPath) {
        this.videoThubnailsPath = videoThubnailsPath;
    }

    public String getTeamVideoPath() {
        return teamVideoPath;
    }

    public void setTeamVideoPath(String teamVideoPath) {
        this.teamVideoPath = teamVideoPath;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    public String getCustom3() {
        return custom3;
    }

    public void setCustom3(String custom3) {
        this.custom3 = custom3;
    }

    public String getCustom4() {
        return custom4;
    }

    public void setCustom4(String custom4) {
        this.custom4 = custom4;
    }

    public String getCustom5() {
        return custom5;
    }

    public void setCustom5(String custom5) {
        this.custom5 = custom5;
    }

    @Override
    public String toString() {
        return "TeamVideo{" +
                "id='" + id + '\'' +
                ", version=" + version +
                ", refKeyForTeam='" + refKeyForTeam + '\'' +
                ", refKeyForPersonal='" + refKeyForPersonal + '\'' +
                ", video_theme='" + video_theme + '\'' +
                ", videoThubnailsPath='" + videoThubnailsPath + '\'' +
                ", teamVideoPath='" + teamVideoPath + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", custom1='" + custom1 + '\'' +
                ", custom2='" + custom2 + '\'' +
                ", custom3='" + custom3 + '\'' +
                ", custom4='" + custom4 + '\'' +
                ", custom5='" + custom5 + '\'' +
                '}';
    }
}
