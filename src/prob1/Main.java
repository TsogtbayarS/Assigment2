package prob1;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tsogt", "Bayar", "123-221-4444");
        Address a1 = new Address("1", "Chicago", "Illinios", "123");
        c1.setBillingAddress(a1);
        c1.setShippingAddress(a1);
        Customer c2 = new Customer("Joe", "Smith", "332-221-4444");
        Address a2 = new Address("2", "Fairfield", "Iowa", "456");
        c2.setBillingAddress(a2);
        c2.setShippingAddress(a2);
        Customer c3 = new Customer("Dulam", "Dorj", "789-221-4444");
        Address a3 = new Address("3", "Des Moines", "Iowa", "789");
        c3.setBillingAddress(a3);
        c3.setShippingAddress(a3);

        Customer[] array = {c1, c2, c3};

        for (Customer c : array) {
            if(c.getBillingAddress().getCity().equals("Chicago"))
                System.out.println(c.toString());
        }
    }
}