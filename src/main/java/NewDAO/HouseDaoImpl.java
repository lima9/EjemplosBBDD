package NewDAO;

import java.util.ArrayList;
import java.util.List;

public class HouseDaoImpl implements HouseDao
{
    List<House> houses;

    public HouseDaoImpl()
    {
        houses = new ArrayList<House>();
        House house1 = new House(0,3,"yes",2);
        House house2 = new House(1,2,"yes",1);
        House house3 = new House(2,4,"no",3);
        House house4 = new House(3,5,"yes",3);
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);
    }

    public List<House> getAllHouses()
    {
        return houses;
    }

    public House getHouse(int houseid)
    {
        return houses.get(houseid);
    }

    public int getBedrooms(int houseid, int beedrom)
    {
        return getHouse(houseid).getBeednum();
    }

    public String getClean(int houseid, String clean)
    {
        return getHouse(houseid).getClean();
    }

    public void updateHouse(House house)
    {
        houses.get(house.getHouseid()).setHouseid(house.getBeednum());
        System.out.println("House: ID " + house.getHouseid() + " updated in the Database");
    }

    public void deleteHouse(House house)
    {
        houses.remove(house.getHouseid());
        System.out.println("House: ID " + house.getHouseid() + " deleted from Database");
    }
}

