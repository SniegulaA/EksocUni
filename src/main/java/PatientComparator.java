import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {


    @Override
    public int compare(Patient pacient, Patient t1) {
       if(pacient.getAge() > t1.getAge()){
           return 1;
       }
       else if(pacient.getAge() == t1.getAge()){
           return 0;
       }
       else{
           return -1;
       }
    }
}
