package NewDAO;

import java.util.List;

public interface HouseDao {
    public List<House> getAllHouses();
    public House getHouse(int houseid);
    public int getBedrooms(int houseid, int beedrom);
    public String getClean(int houseid, String clean);
    public void updateHouse(House house);
    public void deleteHouse(House house);
}

