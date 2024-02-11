class GetSet {

    private String name;
    private int age;

    public void setName(String settingName){
        this.name = settingName;
    }

    public String getName(){
        return name;
    }

    public void setAge(int settingAge){
        this.age = settingAge;
    }

    public int getAge(){
        return age;
    }

}


public class Main {
    public static void main(String[] args) {

        GetSet Student1 = new GetSet();
        GetSet Student2 = new GetSet();

        System.out.println("Student 1's name is: " + Student1.getName());
        System.out.println("Student 1's age is: " + Student1.getAge());
        System.out.println("Student 2's name is: " + Student2.getName());
        System.out.println("Student 2's age is: " + Student2.getAge());
        System.out.println();

        Student1.setName("Billy");
        Student1.setAge(17);

        System.out.println("Student 1's name is: " + Student1.getName());
        System.out.println("Student 1's age is: " + Student1.getAge());
        System.out.println("Student 2's name is: " + Student2.getName());
        System.out.println("Student 2's age is: " + Student2.getAge());




    }
}