package NewDAO;

public class House
{
    private int houseid; //identifier of the house
    private int beednum; // Number of beedroms
    private String clean;// Is the house clean or no
    private int floors; // Number of floors

    House(int houseid, int beednum, String clean, int floors)
    {
        this.houseid = houseid;
        this.beednum = beednum;
        this.clean = clean;
        this.floors = floors;
    }

    public int getBeednum() {
        return beednum;
    }

    public void setBeednum(int beednum) {
        this.beednum = beednum;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    public int getFloors() {
        return floors;
    }

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
