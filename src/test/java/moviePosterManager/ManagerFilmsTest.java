package moviePosterManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerFilmsTest {

    @Test
    public void addNewFilmsAndFindAll() {
        ManagerFilms manager = new ManagerFilms();

        String film_1 = "Move_1";
        String film_2 = "Move_2";
        String film_3 = "Move_3";

        manager.addFilm(film_1);
        manager.addFilm(film_2);
        manager.addFilm(film_3);


        String[] expected = {film_1, film_2, film_3};
        String[] actual = manager.findAllFilm();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void findLastAddFilmsBeforLimit() {
        ManagerFilms manager = new ManagerFilms();

        String film_1 = "Move_1";
        String film_2 = "Move_2";
        String film_3 = "Move_3";
        String film_4 = "Move_4";
        String film_5 = "Move_5";

        manager.addFilm(film_1);
        manager.addFilm(film_2);
        manager.addFilm(film_3);
        manager.addFilm(film_4);
        manager.addFilm(film_5);

        String[] expected = {film_5,film_4,film_3,film_2,film_1};
        String[] actual = manager.findLastFilm();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastAddFilmsLimit() {
        ManagerFilms manager = new ManagerFilms();

        String film_1 = "Move_1";
        String film_2 = "Move_2";
        String film_3 = "Move_3";
        String film_4 = "Move_4";
        String film_5 = "Move_5";
        String film_6 = "Move_6";
        String film_7 = "Move_7";
        String film_8 = "Move_8";
        String film_9 = "Move_9";
        String film_10 = "Move_10";

        manager.addFilm(film_1);
        manager.addFilm(film_2);
        manager.addFilm(film_3);
        manager.addFilm(film_4);
        manager.addFilm(film_5);
        manager.addFilm(film_6);
        manager.addFilm(film_7);
        manager.addFilm(film_8);
        manager.addFilm(film_9);
        manager.addFilm(film_10);

        String[] expected = {film_10,film_9,film_8,film_7,film_6,film_5,film_4,film_3,film_2,film_1};
        String[] actual = manager.findLastFilm();

        Assertions.assertArrayEquals(expected, actual);
    }
}
