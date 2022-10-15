public class StudentRunner {
    public static void main(String[] args) {
      //Student student = new Student();
      //student.setName("Ranga");
      //student.setEmail("ranga@gmail.com");
        /*
        Person person = new Person();
        person.setName("Ranga");
        person.setEmail("ranga@gmail.com");
        person.setPhoneNumber("1234567890");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);
        */
        Employee employee = new Employee("Ranga","devops");
        Student student = new Student("sai","Klu");

        //employee.setName("Ranga");
        employee.setEmail("ranga@gmail.com");
        employee.setPhoneNumber("1234567890");
        employee.setEmployer("SDC Sonic Solution");
        employee.setEmployeeGrade('A');
        //employee.setTitle("Programmer Analyst");
        student.setEmail("sai@gmail.com");
        student.setPhoneNumber("9876543210");
        System.out.println(employee);
        System.out.println(student);

    }
}
