package NewDAO;

public class HousePatternDemo
{
    public static void main(String[] args)
    {
        HouseDao houseDao = new HouseDaoImpl();

        /*Print all houses*/
        for (House house : houseDao.getAllHouses())
        {
            System.out.println("House: [ID: " + house.getHouseid() + " Nº beedroms: " + house.getBeednum() + " Clean: " + house.getClean() + " Nº of floors: " + house.getFloors() + "]");
        }

        /*Get the House*/
        House house = houseDao.getHouse(0);
        System.out.println("House: [ID: " + house.getHouseid() + " Nº beedroms: " + house.getBeednum() + " Clean: " + house.getClean() + " Nº of floors: " + house.getFloors() + "]");


    }



}

/*
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        /* print all students
for (Student student : studentDao.getAllStudents()) {
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        /* update student
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        /* get the student
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }
        }
 */