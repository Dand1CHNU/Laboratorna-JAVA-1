package lab1;

import lab1.Employee;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeTest {

    @Test(dataProvider = "test1")
    public void testSetterId(int id1){
        Employee ob1 = new Employee.Builder().setId(id1).build();
        assertEquals(ob1.getId(),id1);
    }

    @DataProvider
    public Object[][] test1(){
        return new Object[][] {{30},{40}};
    }

    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "test2")
    public void test1SetterId(int id1){
        Employee ob1 = new Employee.Builder().setId(id1).build();
    }

    @DataProvider
    public Object[][] test2(){
        return new Object[][] {{-10}};
    }

    @Test(dataProvider = "test3")
    public void testSetterFirsname(String value){
        Employee ob = new Employee.Builder().setFirstname(value).build();
        assertEquals(ob.getFirstname(),value);
    }

    @DataProvider
    public Object[][] test3(){
        return new Object[][] {{"Dorosenko"}};
    }


    @Test(dataProvider = "test4")
    public void testSetterName(String value){
        Employee ob = new Employee.Builder().setName(value).build();
        assertEquals(ob.getName(),value);
    }

    @DataProvider
    public Object[][] test4(){
        return new Object[][] {{"Doroh"}};
    }


    @Test(dataProvider = "test5")
    public void testSetterLastname(String value){
        Employee ob = new Employee.Builder().setLastname(value).build();
        assertEquals(ob.getLastname(),value);
    }

    @DataProvider
    public Object[][] test5(){
        return new Object[][] {{"Dorohovych"}};
    }


    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "test6")
    public void test1SetterInformation(String value, String value1, String value2){
        Employee ob = new Employee.Builder().setFirstname(value).setName(value1).setLastname(value2).build();
    }

    @DataProvider
    public Object[][] test6(){
        return new Object[][] {{"Vasylko","vasyl","Vasylovych"}};
    }


    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "test7")
    public void testSetterAge(int age){
        Employee ob = new Employee.Builder().setAge(age).build();
    }

    @DataProvider
    public Object[][] test7(){
        return new Object[][] {{15}};
    }


    @Test(dataProvider = "test8")
    public void test1SetterAge(int age){
        Employee ob = new Employee.Builder().setAge(age).build();
        assertEquals(ob.getAge(),age);
    }

    @DataProvider
    public Object[][] test8(){
        return new Object[][] {{40}};
    }



    Employee ob3 = new Employee.Builder().setId(30).setFirstname("Sutenko").setName("Kostia").setLastname("Iosopovych").setAge(39).build();
    Employee ob4 = new Employee.Builder().setId(30).setFirstname("Sutenko").setName("Kostia").setLastname("Iosopovych").setAge(39).build();

    Employee ob5 = new Employee.Builder().setId(25).setId(6).setFirstname("Dorosenko").setName("Artem").setLastname("Panasovych").setAge(51).build();
    Employee ob6 = new Employee.Builder().setId(25).setId(6).setFirstname("Dorosenko").setName("Artem").setLastname("Panasovych").setAge(51).build();

    @Test(dataProvider = "test10")
    public void testEquals(Employee obj1, Employee obj2, boolean res){
        assertEquals(obj1.equals(obj2), res);
    }

    @DataProvider
    public Object[][] test10(){
        return new Object[][] {{ob3,ob4,true},{ob5,ob6,false}};
    }
}
