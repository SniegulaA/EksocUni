import lombok.Data;

@Data
public class Patient implements Comparable<Patient> {
    private int age;
    private String name;

    @Override
    public int compareTo(Patient pacient) {
         if(this.getAge() < pacient.getAge())
         {
             return 1;
         }
         else if (this.getAge() == pacient.getAge()){
             return 0;
         }
         else {
             return -1;
         }
    }
}
