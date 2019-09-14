package co.com.ceiba.mobile.pruebadeingreso.viewmodel;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import co.com.ceiba.mobile.pruebadeingreso.model.Repository;
import co.com.ceiba.mobile.pruebadeingreso.model.User;

public class UserViewModel extends AndroidViewModel {

    private Repository repository;
    private LiveData<List<User>> allUsers;

    public UserViewModel(@NonNull Application application) {
        super(application);
        repository = new Repository(application);
        allUsers = repository.getAllUsers();
    }

    public void insert(User user){
        repository.insert(user);
    }

    public void update(User user){
        repository.update(user);
    }

    public void delete(User user){
        repository.delete(user);
    }

    public void deleteAllUsers(){
        repository.deleteAllUsers();
    }

    public LiveData<List<User>> getAllUsers() {
        return allUsers;
    }
}