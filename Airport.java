package lab1;

import java.util.*;

import lab1.Employee;
public class Airport {

    private String nameAirport;
    private int numberAirport;
    private List<Employee> list;


    public String getNameAirport() {
        return nameAirport;
    }

    public int getNumberAirport() {
        return numberAirport;
    }

    public List<Employee> getList() {
        return list;
    }


    public static class Create{

        private Airport Airport;

        public Create(){
            Airport = new Airport();
        }

        public Create setNameAirport(String NameAirport){
            Airport.nameAirport = NameAirport;
            return this;
        }

        public Create setNumberAirport(int NumberAirport){
            Airport.numberAirport = NumberAirport;
            return this;
        }

        public Create setListEmployees(List<Employee> list){
            Airport.list = list;
            return this;
        }

        public Airport createAirport(){
            return Airport;
        }
    }


    public static List<Employee> filter(List<Employee> list){

        for(int i = list.size()-1; i >=0 ;i--){
            if(list.get(i).getAge() > 40) {
                list.remove(i);
            }
        }

        return list;
    }

    public static List<Employee> sort(List<Employee> list){
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object EmployeeOne, Object EmployeeTwo) {
                return ((Employee) EmployeeOne).getFirstname().compareTo(((Employee) EmployeeTwo).getFirstname());
            }
        });

        return list;
    }

    @Override
    public String toString(){
        return "Name Airport: -> " + nameAirport
                + "\nCode Airport: -> " + numberAirport
                + "\nList Employees: -> "+list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Airport Airport = (Airport) o;
        return numberAirport == Airport.numberAirport && nameAirport.equals(Airport.nameAirport) && list.equals(Airport.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameAirport, numberAirport, list);
    }

    public static void main(String args[]) {

        Employee Employee1 = new Employee.Builder().setId(1).setFirstname("Dorosenko").setName("Artem").setLastname("Panasovych").setAge(51).build();
        Employee Employee2 = new Employee.Builder().setId(2).setFirstname("Rusnak").setName("Vasyl").setLastname("Vasylovych").setAge(22).build();
        Employee Employee3 = new Employee.Builder().setId(3).setFirstname("Vatin").setName("Sasha").setLastname("Olehovych").setAge(26).build();
        Employee Employee4 = new Employee.Builder().setId(4).setFirstname("Krypov").setName("Anton").setLastname("Denisovych").setAge(31).build();
        Employee Employee5 = new Employee.Builder().setId(5).setFirstname("Baluk").setName("Ihor").setLastname("Andriovych").setAge(44).build();
        Employee Employee6 = new Employee.Builder().setId(6).setFirstname("Puzenko").setName("Yevhen").setLastname("Viktorovych").setAge(19).build();
        Employee Employee7 = new Employee.Builder().setId(7).setFirstname("Sutenko").setName("Kostia").setLastname("Iosopovych").setAge(39).build();

        List<Employee> l = new ArrayList<Employee>();
        l.add(Employee1);
        l.add(Employee2);
        l.add(Employee3);
        l.add(Employee4);
        l.add(Employee5);
        l.add(Employee6);
        l.add(Employee7);

        List<Employee> 17 = new ArrayList<Employee>();
        List<Employee> 18 = new ArrayList<Employee>();


        17 = filter(l);


        18 = sort(17);
        Airport obj = new Airport.Create().setNameAirport("Boruspil").setNumberAirport(1).setListEmployees(18).createAirport();

         System.out.println(obj);
    }
}
