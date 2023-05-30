import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ManagerFilmsTest {

    @Test
    public void addNewFilms () {
        ManagerFilms manager = new ManagerFilms();

        String film_1 = "Move 1";
        String film_2 = "Move 2";
        String film_3 = "Move 3";
        String film_4 = "Move 4";
        String film_5 = "Move 5";

        manager.addFilm(film_1);
        manager.addFilm(film_2);
        manager.addFilm(film_3);
        manager.addFilm(film_4);
        manager.addFilm(film_5);

        String[] expected = { film_1, film_2, film_3, film_4, film_5 };
        String[] actual = manager.findAllFilm();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastAddFilms () {
        ManagerFilms manager = new ManagerFilms();

        String film_1 = "Move 1";
        String film_2 = "Move 2";
        String film_3 = "Move 3";
        String film_4 = "Move 4";
        String film_5 = "Move 5";

        manager.addFilm(film_1);
        manager.addFilm(film_2);
        manager.addFilm(film_3);
        manager.addFilm(film_4);
        manager.addFilm(film_5);

        String[] expected = { film_5, film_4, film_3, film_2, film_1 };
        String[] actual = manager.findLastFilm();

        Assertions.assertArrayEquals(expected, actual);
}