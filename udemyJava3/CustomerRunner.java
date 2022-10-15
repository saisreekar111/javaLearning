public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("line 1", "Hyderabad","500035");
        Customer customer = new Customer("Srikar",homeAddress);
        Address workAddress = new Address("line1 for w","Hyderabad","500034");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
}
}