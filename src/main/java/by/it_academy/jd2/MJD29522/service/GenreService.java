package by.it_academy.jd2.MJD29522.service;

import by.it_academy.jd2.MJD29522.dao.api.IGenreDao;
import by.it_academy.jd2.MJD29522.dto.GenreID;
import by.it_academy.jd2.MJD29522.service.api.IGenreService;
import java.util.List;

public class GenreService implements IGenreService {

//    private final IGenreDao dao;

    private final IGenreDao dao;

//    public GenreService(IGenreDao dao) {
//        this.dao = dao;
//    }

    public GenreService(IGenreDao dao) {
        this.dao = dao;
    }

    @Override
    public List<GenreID> get() {
        return dao.get();
    }

    @Override
    public boolean add(String newGenre) {
        return dao.add(newGenre);
    }

    @Override
    public void update(long id, String name) {
        dao.update(id, name);
    }

    @Override
    public boolean delete(long id) {
        return dao.delete(id);
    }

    @Override
    public boolean exist(long id) {
        return this.dao.exist(id);
    }
}
