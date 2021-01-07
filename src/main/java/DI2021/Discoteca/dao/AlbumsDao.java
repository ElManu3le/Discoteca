package DI2021.Discoteca.dao;

import java.util.ArrayList;
import java.util.List;
import DI2021.Discoteca.models.Album;

public class AlbumsDao implements DAO<Album> {

    private static List<Album> albums = new ArrayList<Album>();

    @Override
    public Album get(long id) {
        
        return albums.get((int) id);
    }

    @Override
    public List<Album> getAll() {
        
        return albums;
    }

    @Override
    public void save(Album t) throws Exception{

        albums.add(t);
        

    }

    @Override
    public void update(Album t, String[] params) {
        t.setNombre(" ");
        

    }

    @Override
    public void delete(Album t) {
        albums.remove(t);
        

    }

   
    
}
