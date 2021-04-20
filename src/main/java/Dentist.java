public class Dentist implements SpecialistInterface{
    @Override
    public void treat(Patient p) {
        System.out.println(p.getName() + " " +p.getAge() + " Masz zdrowe zęby");
    }
}
