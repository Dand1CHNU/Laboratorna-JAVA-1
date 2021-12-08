package lab1;

import java.util.Objects;
public class Accountant extends Employee{

    private int salary;
    private int experience;

    public Accountant(Employee obj){

        this.id = obj.getId();
        this.Firstname = obj.getFirstname();
        this.Name = obj.getName();
        this.Lastname = obj.getLastname();
        this.age = obj.getAge();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void growSalary(){
        if(this.experience > 5){
            this.salary = ((int) (this.salary*1.2));
        }
    }

    @Override
    public String toString(){

        return "\n Info about Employee: [Employee_id -> " + id
                + "\nEmployee Surname -> " + Firstname
                + "\nEmployee Name -> " + Name
                + "\nEmployee Lastname -> "+ Lastname
                + "\nEmployee age -> "+ age
                + "]" +
                "\nAccountant has salary -> "+ salary
                + " and his work experience -> "
                + experience +"\n";

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Accountant Accountant = (Accountant) o;
        return salary == Accountant.salary && experience == Accountant.experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, experience);
    }

    public static void main(String args[]){


        Accountant m1 = new Accountant(new Employee.Builder().setId(1).setFirstname("Dorosenko").setName("Artem").setLastname("Panasovych").setAge(51).build());
        Accountant m2 = new Accountant(new Employee.Builder().setId(2).setFirstname("Rusnak").setName("Vasyl").setLastname("Vasylovych").setAge(22).build());
        m1.setSalary(2300);
        m1.setExperience(5);

        m2.setSalary(5600);
        m2.setExperience(9);


        m1.growSalary();
    m2.growSalary();
       System.out.println(m1);
       System.out.println(m2);
    }

}
