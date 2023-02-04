package by.it_academy.jd2.MJD29522.dao.api;

import by.it_academy.jd2.MJD29522.dao.orm.entity.GenreEntity;
import by.it_academy.jd2.MJD29522.dto.GenreID;
import java.sql.SQLException;
import java.util.List;

public interface IGenreDao{
//    List<GenreID> get();

    List<GenreEntity> get() throws SQLException;

    boolean add(String newGenre);

    void update(GenreEntity genreEntity);

    boolean delete(long id);

    boolean exist(long id);
}
