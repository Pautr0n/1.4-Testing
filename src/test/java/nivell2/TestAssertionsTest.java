package nivell2;

import nivell1.exercici1.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestAssertionsTest {


    @AfterEach
    void lines(){
        IO.println("-------------TEST SUCCEEDED -------------");
    }

    @Test
    @DisplayName("Exercici 1: Assertion value equality")
    void valueEqualityTest(){

        class Car{
            String model;
            String brand;


            Car(String model, String brand){
                this.model = model;
                this.brand = brand;
            }

        }

        Car car1 = new Car("Escort","Ford"),
                car2 = new Car("Escort","Ford"),
                    car3 = new Car("Panda","Seat");

        assertThat(car1).extracting("model","brand").containsExactly(car2.model,car2.brand);
        assertThat(car1).extracting("model","brand").doesNotContain(car3.model,car3.brand);

    }

    @Test
    @DisplayName("Exercici 2: Assertion Reference equality")
    void referenceEqualityTest(){
        Book value1 = new Book("El Quijote", "Cervantes"), value2;
        value2 = value1;
        assertThat(value1).isSameAs(value2);

        value2= new Book("El Quijote", "Cervantes");
        assertThat(value1).isNotSameAs(value2);


    }

    @Test
    @DisplayName("Exercici 3: assertArrayEquals() ")
    void arraysSameValueTest(){

        int[] array1 = {1,2,3,4,5,6,7,8,9,10},
                array2 = {1,2,3,4,5,6,7,8,9,10};

        assertThat(array1).isEqualTo(array2);

    }

    @Test
    @DisplayName("Exercici 4: Assertion ArrayList")
    void arrayListTest() {

        int object1 = 100;
        double object2 = 2.3569;
        boolean object3 = true;
        char object4 = 'c';
        String object5 = "Tron";
        Book object6 = new Book("El Quijote","Cervantes");


        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(object1);
        arrayList.add(object2);
        arrayList.add(object3);
        arrayList.add(object4);
        arrayList.add(object5);

        assertThat(arrayList).containsExactly(100,2.3569,true,'c',"Tron");
        assertThat(arrayList).containsExactlyInAnyOrder(object2,object1,object3,object5,object4);
        assertThat(arrayList).containsOnlyOnce(object1,object2,object3,object4,object5);
        assertThat(arrayList).doesNotContain(object6);

    }

    @Test
    @DisplayName("Exercici 5: Assertion of a key")
    void mapAssertion(){

        Map<String, String> person = new HashMap<>();
        person.put("46689756N", "Chiquito de la Calzada");
        person.put("46688886N", "Ramón el Vanidoso");
        person.put("46985789N", "El Pozi");

        assertThat(person).containsKey("46688886N");

    }

    @Test
    @DisplayName("Exercici 6: assert IndexOutOfBounds")
    void indexOutOfBoundsExceptionTest(){


        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);

        assertThrows(IndexOutOfBoundsException.class, () -> array.get(5));
    }

    @Test
    @DisplayName("Exercici 7: IsEmpty")
    void optionalEmptyTest(){
        Optional<String> optional = Optional.empty();
        assertThat(optional).isEmpty();
    }

}