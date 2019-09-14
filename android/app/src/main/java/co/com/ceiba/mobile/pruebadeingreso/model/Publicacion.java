package co.com.ceiba.mobile.pruebadeingreso.model;

import com.google.gson.annotations.SerializedName;

public class Publicacion {

    private int userId;
    private int id;
    private String title;

    @SerializedName("body")
    private String text;

    public Publicacion() {

    }

    public Publicacion(int userId, int id, String title, String text) {
        this();
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
