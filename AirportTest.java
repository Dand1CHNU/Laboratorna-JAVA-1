package lab1;

import java.util.*;
import lab1.Airport;
import lab1.Employee;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AirportTest {

    @Test(dataProvider = "in1")
    public void testFilter(List<Employee> list1, List<Employee> list2){
        assertEquals(list1,list2);
    }

    @DataProvider
    public Object[][] in1(){
        Employee w1 = new Employee.Builder().setId(1).setFirstname("Rusnak").setName("Vasyl").setLastname("Vasylovych").setAge(22).build();
        Employee w2 = new Employee.Builder().setId(3).setFirstname("Krypov").setName("Anton").setLastname("Denisovych").setAge(31).build();
        Employee w3 = new Employee.Builder().setId(4).setFirstname("Puzenko").setName("Yevhen").setLastname("Viktorovych").setAge(19).build();
        Employee w4 = new Employee.Builder().setId(5).setFirstname("Sutenko").setName("Kostia").setLastname("Iosopovych").setAge(39).build();
        Employee w5 = new Employee.Builder().setId(7).setFirstname("Baluk").setName("Ihor").setLastname("Andriovych").setAge(44).build();
        Employee w6 = new Employee.Builder().setId(2).setFirstname("Vatin").setName("Sasha").setLastname("Olehovych").setAge(26).build();
        Employee w7 = new Employee.Builder().setId(6).setFirstname("Dorosenko").setName("Artem").setLastname("Panasovych").setAge(51).build();

        List<Employee> list = new ArrayList<Employee>();
        List<Employee> list1 = new ArrayList<Employee>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);

        list1.add(w1);
        list1.add(w2);
        list1.add(w3);
        list1.add(w4);
        list1.add(w5);
        list1.add(w6);
        list1.add(w7);

        return new Object[][]{{Airport.filter(list1),list}};
    }

    @Test(dataProvider = "in2")
    public void testSort(List <Employee> list1, List<Employee> list2){
        assertEquals(list1,list2);
    }

    @DataProvider
    public Object[][] in2(){
        Employee w1 = new Employee.Builder().setId(1).setFirstname("Rusnak").setName("Vasyl").setLastname("Vasylovych").setAge(22).build();
        Employee w2 = new Employee.Builder().setId(3).setFirstname("Krypov").setName("Anton").setLastname("Denisovych").setAge(31).build();
        Employee w3 = new Employee.Builder().setId(4).setFirstname("Puzenko").setName("Yevhen").setLastname("Viktorovych").setAge(19).build();
        Employee w4 = new Employee.Builder().setId(5).setFirstname("Sutenko").setName("Kostia").setLastname("Iosopovych").setAge(39).build();
        Employee w5 = new Employee.Builder().setId(7).setFirstname("Baluk").setName("Ihor").setLastname("Andriovych").setAge(44).build();


        List<Employee> list = new ArrayList<Employee>();
        List<Employee> expectedlist = new ArrayList<Employee>();


        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);

        expectedlist.add(w2);
        expectedlist.add(w4);
        expectedlist.add(w3);
        expectedlist.add(w1);
        expectedlist.add(w5);

        return new Object[][] {{Airport.sort(list), expectedlist}};
    }
}
