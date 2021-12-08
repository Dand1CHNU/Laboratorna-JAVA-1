package lab1;

import java.util.*;
import java.util.regex.Pattern;

import lab1.Employee;
import lab1.Airport;
import lab1.Employee.Builder;

public class Country {
    private String nameCountry;
    private String nameCountry;
    private List<Airport> masiv = new ArrayList<Airport>();
    public static String Patt = "S[a-z]+";

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }


    @Override
    public String toString() {
        return "\nCountry: [name Country -> " + nameCountry
                + "\nname country -> " + nameCountry
                + "\nlist Airport in this Country -> " + masiv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Country Country = (Country) o;
        return nameCountry.equals(Country.nameCountry) && nameCountry.equals(Country.nameCountry) && masiv.equals(Country.masiv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameCountry, nameCountry, masiv);
    }

    public static void main(String args[]){

        Employee Employee1 = new Employee.Builder().setId(1).setFirstname("Dorosenko").setName("Artem").setLastname("Panasovych").setAge(51).build();
        Employee Employee2 = new Employee.Builder().setId(2).setFirstname("Rusnak").setName("Vasyl").setLastname("Vasylovych").setAge(22).build();
        Employee Employee3 = new Employee.Builder().setId(3).setFirstname("Vatin").setName("Sasha").setLastname("Olehovych").setAge(26).build();
        Employee Employee4 = new Employee.Builder().setId(4).setFirstname("Krypov").setName("Anton").setLastname("Denisovych").setAge(31).build();
        Employee Employee5 = new Employee.Builder().setId(5).setFirstname("Baluk").setName("Ihor").setLastname("Andriovych").setAge(44).build();
        Employee Employee6 = new Employee.Builder().setId(6).setFirstname("Puzenko").setName("Yevhen").setLastname("Viktorovych").setAge(19).build();
        Employee Employee7 = new Employee.Builder().setId(7).setFirstname("Sutenko").setName("Kostia").setLastname("Iosopovych").setAge(39).build();

        List<Employee> l1 = new ArrayList<Employee>();
        List<Employee> l2 = new ArrayList<Employee>();
        List<Employee> l3 = new ArrayList<Employee>();
        List<Employee> l4 = new ArrayList<Employee>();


        l1.add(Employee1);
        l1.add(Employee2);
        l2.add(Employee3);
        l2.add(Employee4);
        l3.add(Employee5);
        l3.add(Employee6);
        l3.add(Employee7);
        l4.add(Employee2);
        l4.add(Employee5);

        Airport obj1 = new Airport.Create().setNameAirport("Boruspil").setNumberAirport(1).setListEmployees(l1).createAirport();
        Airport obj2 = new Airport.Create().setNameAirport("Kharkiv").setNumberAirport(2).setListEmployees(l2).createAirport();
        Airport obj3 = new Airport.Create().setNameAirport("Shevchenko").setNumberAirport(3).setListEmployees(l3).createAirport();
        Airport obj4 = new Airport.Create().setNameAirport("Chernivtsi").setNumberAirport(4).setListEmployees(l4).createAirport();

        Country ob = new Country();
        ob.setNameCountry("Kyiv");
        ob.setNameCountry("Ukraine");
        ob.masiv.add(obj1);
        ob.masiv.add(obj2);
        ob.masiv.add(obj3);
        ob.masiv.add(obj4);

      for (int i = 0; i < ob.masiv.size();i++){
         if(Pattern.matches(Patt,ob.masiv.get(i).getNameAirport())){
             for(int j = 0; j < ob.masiv.get(i).getList().size(); j++){
                 if(ob.masiv.get(i).getList().get(j).getAge() > 40){
                     System.out.println(ob.masiv.get(i).getList().get(j));
                 }
             }
         }


      }


    }
}
