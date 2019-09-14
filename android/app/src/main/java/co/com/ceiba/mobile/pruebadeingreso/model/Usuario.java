package co.com.ceiba.mobile.pruebadeingreso.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario {

    private int id;
    private String name;
    private String email;
    private String phone;


    public Usuario() {

    }

    public Usuario(int id, String name, String email, String phone) {
        this();
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /*@Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.email);
        parcel.writeString(this.phone);
    }

    protected Usuario(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.email = in.readString();
        this.phone = in.readString();
    }

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel parcel) {
            return new Usuario(parcel);
        }

        @Override
        public Usuario[] newArray(int i) {
            return new Usuario[i];
        }
    };*/
}
