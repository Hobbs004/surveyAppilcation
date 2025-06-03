package surveyApp;

import java.time.LocalDate;
import java.util.List;

public class surveyData {

    private String name, surname;
    private int age;
    private LocalDate date;
    private List<String> favoriteFoods;
    private int eatOut, watchMovies, watchTV, listenRadio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    public int getEatOut() {
        return eatOut;
    }

    public void setEatOut(int eatOut) {
        this.eatOut = eatOut;
    }

    public int getWatchMovies() {
        return watchMovies;
    }

    public void setWatchMovies(int watchMovies) {
        this.watchMovies = watchMovies;
    }

    public int getWatchTV() {
        return watchTV;
    }

    public void setWatchTV(int watchTV) {
        this.watchTV = watchTV;
    }

    public int getListenRadio() {
        return listenRadio;
    }

    public void setListenRadio(int listenRadio) {
        this.listenRadio = listenRadio;
    }
}


