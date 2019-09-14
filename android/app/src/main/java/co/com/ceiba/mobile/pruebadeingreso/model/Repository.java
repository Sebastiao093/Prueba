package co.com.ceiba.mobile.pruebadeingreso.model;

import android.app.Application;
import android.os.AsyncTask;
import android.provider.ContactsContract;

import java.util.List;

import androidx.lifecycle.LiveData;

public class Repository {

    private NoteDao noteDao;
    private LiveData<List<Note>> allNotes;
    private UserDao userDao;
    private LiveData<List<User>> allUsers;

    public Repository(Application application){
        NoteDatabase database = NoteDatabase.getInstance(application);
        noteDao = database.noteDao();
        userDao = database.userDao();
        allNotes = noteDao.getAllNotes();
        allUsers = userDao.getAllUsers();
    }

    public void insert(Note note){
        new InsertNoteAsyncTask(noteDao).execute(note);
    }

    public void update(Note note){
        new UpdateNoteAsyncTask(noteDao).execute(note);
    }

    public void delete(Note note){
        new DeleteNoteAsyncTask(noteDao).execute(note);
    }

    public void deleteAllNotes(){
        new DeleteAllNotesAsyncTask(noteDao).execute();

    }

    public LiveData<List<Note>> getAllNotes(){
        return allNotes;
    }

    public void insert(User user){
        new InsertUserAsyncTask(userDao).execute(user);
    }

    public void update(User user){
        new UpdateUserAsyncTask(userDao).execute(user);
    }

    public void delete(User user){
        new DeleteUserAsyncTask(userDao).execute(user);
    }

    public void deleteAllUsers(){
        new DeleteAllUsersAsyncTask(userDao).execute();
    }

    public LiveData<List<User>> getAllUsers(){
        return allUsers;
    }

    private static class InsertNoteAsyncTask extends AsyncTask<Note, Void, Void>{
        private NoteDao noteDao;

        private InsertNoteAsyncTask(NoteDao noteDao){
            this.noteDao = noteDao;
        }

        @Override
        protected Void doInBackground(Note... notes){
            noteDao.insert(notes[0]);
            return null;
        }

    }

    private static class UpdateNoteAsyncTask extends AsyncTask<Note, Void, Void>{
        private NoteDao noteDao;

        private UpdateNoteAsyncTask(NoteDao noteDao){
            this.noteDao = noteDao;
        }

        @Override
        protected Void doInBackground(Note... notes){
            noteDao.update(notes[0]);
            return null;
        }

    }

    private static class DeleteNoteAsyncTask extends AsyncTask<Note, Void, Void>{
        private NoteDao noteDao;

        private DeleteNoteAsyncTask(NoteDao noteDao){
            this.noteDao = noteDao;
        }

        @Override
        protected Void doInBackground(Note... notes){
            noteDao.delete(notes[0]);
            return null;
        }

    }

    private static class DeleteAllNotesAsyncTask extends AsyncTask<Void, Void, Void>{
        private NoteDao noteDao;

        private DeleteAllNotesAsyncTask(NoteDao noteDao){
            this.noteDao = noteDao;
        }

        @Override
        protected Void doInBackground(Void... voids){
            noteDao.deleteAllNotes();
            return null;
        }

    }

    private static class InsertUserAsyncTask extends AsyncTask<User, Void, Void>{
        private UserDao userDao;

        private InsertUserAsyncTask(UserDao userDao){
            this.userDao = userDao;
        }

        @Override
        protected Void doInBackground(User... users){
            userDao.insert(users[0]);
            return null;
        }

    }

    private static class UpdateUserAsyncTask extends AsyncTask<User, Void, Void>{
        private UserDao userDao;

        private UpdateUserAsyncTask(UserDao userDao){
            this.userDao = userDao;
        }

        @Override
        protected Void doInBackground(User... users){
            userDao.update(users[0]);
            return null;
        }

    }

    private static class DeleteUserAsyncTask extends AsyncTask<User, Void, Void>{
        private UserDao userDao;

        private DeleteUserAsyncTask(UserDao userDao){
            this.userDao = userDao;
        }

        @Override
        protected Void doInBackground(User... users){
            userDao.delete(users[0]);
            return null;
        }

    }

    private static class DeleteAllUsersAsyncTask extends AsyncTask<Void, Void, Void>{
        private UserDao userDao;

        private DeleteAllUsersAsyncTask(UserDao userDao){
            this.userDao = userDao;
        }

        @Override
        protected Void doInBackground(Void... voids){
            userDao.deleteAllUsers();
            return null;
        }

    }

}
