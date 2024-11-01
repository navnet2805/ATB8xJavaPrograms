package Tasks;

public class Person {
    private String Name = "Naveen";
    private int Age = 30;
    private String Color = "Grey";
    private double Height = 5.2;
    private boolean Educated = true;
    private String Place = "Bangalore";
    private String Profession = "Test Engineer";
    private float Experience = 5.5f;
    private long Phone_number = 9663621985l;
    private boolean Is_married = true;

    //behaviours - methods
    void sleep(){
        System.out.println("Can sleep");
    }

    void walk(){
        System.out.println("Can walk");
    }

    void study(){
        System.out.println("Can study");
    }

    void talk(){
        System.out.println("Can speak");
    }

    void earn(){
        System.out.println("is earning");
    }

    //Default constructor
    public Person(){
        System.out.println("Default constructor");
    }

    //parametarised constructor
    public Person(String Name, int Age, String Color, double Height, boolean Educated, String Place, String Profession, float Experience, long Phone_number, boolean Is_married){
        System.out.println("Parametarised constructor");
        this.Name=Name;
        this.Age=Age;
        this.Color=Color;
        this.Height=Height;
        this.Educated=Educated;
        this.Place=Place;
        this.Profession=Profession;
        this.Experience=Experience;
        this.Phone_number=Phone_number;
        this.Is_married=Is_married;
    }

    //getter method


    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getColor() {
        return Color;
    }

    public double getHeight() {
        return Height;
    }

    public String getPlace() {
        return Place;
    }

    public boolean isEducated() {
        return Educated;
    }

    public String getProfession() {
        return Profession;
    }

    public float getExperience() {
        return Experience;
    }

    public long getPhone_number() {
        return Phone_number;
    }

    public boolean isIs_married() {
        return Is_married;
    }
}
