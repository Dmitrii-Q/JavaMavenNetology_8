public class ManagerFilms {
    private String[] films = new String[0];
    private int limit;

    public void addFilm (String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
    }

    public String[] findAllFilm () {
        return films;
    }

    public String[] findLastFilm () {
        int resultLenght;
        if(films.length < limit) {
            resultLenght = films.length;
        }else {
            resultLenght = limit;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

    public ManagerFilms() {
        this.limit = 10;
    }

    public ManagerFilms(int limit) {
        this.limit = limit;
    }
}
