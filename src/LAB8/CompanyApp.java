package LAB8;

public class CompanyApp {
    public static void main(String[] args){
        Employee emp1 = new Employee();

        emp1.setPid("1809700328741");
        emp1.setName("Chutima Leetrakul");
        emp1.setAge(22);
        emp1.setGender("Famale");
        emp1.setTel("063241xxxx");

        emp1.setEmpID("emp001");
        emp1.setPosition("Programmer");
        emp1.setSalary(10000.00);

        //display object data
        System.out.println(emp1.toString());

    }//main
}
