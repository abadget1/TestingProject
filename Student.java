package Student;

public class Student
{
    public String name;
    public int ID;
    public String email;
    public int attendance;
    public String team;

    public Student(String name){
        this.name = name;

    }

    public String getName()
{
    return this.name;
}

    public String getTeam()
    {
        return this.team;
    }

    public String getEmail(){
        return this.email;
    }

    public int getID()
    {
        return this.ID;
    }

    public int getAttendance(){
        return this.attendance;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setTeam(String newTeam)
    {
        this.team = newTeam;
    }

    public void setEmail(String newEmail)
    {
        this.email = newEmail;
    }

    public void setID(int newID)
    {
        this.ID = newID;
    }


    public static void main(String [] args){
        Student sarah = new Student("Jackie");
        System.out.print(sarah.getName());
    }
}
