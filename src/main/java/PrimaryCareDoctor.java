import com.github.javafaker.Faker;

import java.util.*;

public class PrimaryCareDoctor {

    Queue<Patient> patientsList = new PriorityQueue<>();
    //ALBO Queue<Pacient> patientsList = new PriorityQueue<>(new PatientComparator());
    SpecialistInterface[] specialists = new SpecialistInterface[3];

    public PrimaryCareDoctor(){

        specialists[0] = new Oculist();
        specialists[1] = new Pulmonologist();
        specialists[2] = new Dentist();

        Faker faker = new Faker();

        for(int i =0; i<100; i++){

            Patient p = new Patient();
            p.setName(faker.name().lastName());
            p.setAge(faker.number().numberBetween(16,101));
            patientsList.add(p);

        }

    }

    public void diagnosis(){
        Faker faker = new Faker();


       while(patientsList.size()>0){

            int number = faker.number().numberBetween(0,4);
            Patient p = patientsList.poll();

            if(number < 3){
                specialists[number].treat(p);
            }else{
                System.out.println(p.getName() + " " + p.getAge() +" Wyleczył Cię lekarz pierwszego kontaktu");
            }
        }

    }

    public static void main(String[] args){
        PrimaryCareDoctor doc = new PrimaryCareDoctor();
        doc.diagnosis();
    }
}
