import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person [] people = new Person[3];
        people[0] = new Person("JimBob");
        people[1] = new Person("JoeBob");
        people[2] = new Person("BillyBob");

        System.out.println(Arrays.toString(people));

        for(Person person : people){
            System.out.println(person.getName());
        }

        Person[] newPeopleArray = addPerson(people, new Person("BobBob"));

        for(Person person: newPeopleArray){
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person[] peopleArray, Person personAdding) {
        Person[] tmpArray = Arrays.copyOf(peopleArray, peopleArray.length + 1);
        tmpArray[tmpArray.length-1] = personAdding;

        return tmpArray;
    }

}
