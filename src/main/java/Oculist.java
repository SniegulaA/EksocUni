public class Oculist implements SpecialistInterface  {
    @Override
    public void treat(Patient p) {
        System.out.println(p.getName() + " " +p.getAge() + " Masz zdrowe oczy");
    }
}
