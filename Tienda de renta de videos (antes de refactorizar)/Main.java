public class Main {
    public static void main(String[] args) {
        // Create some movies
        Movie movie1 = new Movie("The Matrix", Movie.REGULAR);
        Movie movie2 = new Movie("Shrek", Movie.CHILDRENS);
        Movie movie3 = new Movie("Dune: Part Two", Movie.NEW_RELEASE);

        // Create a customer
        Customer customer = new Customer("John Doe");

        // Create rentals and add them to the customer
        customer.addRental(new Rental(movie1, 3));
        customer.addRental(new Rental(movie2, 2));
        customer.addRental(new Rental(movie3, 1));

        // Print the statement
        System.out.println(customer.statement());
    }
}