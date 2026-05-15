public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("The Matrix", Movie.REGULAR);
        Movie movie2 = new Movie("Shrek", Movie.CHILDRENS);
        Movie movie3 = new Movie("Dune: Part Two", Movie.NEW_RELEASE);

        Customer customer = new Customer("John Doe");

        customer.addRental(new Rental(movie1, 3));
        customer.addRental(new Rental(movie2, 2));
        customer.addRental(new Rental(movie3, 1));

        System.out.println("=== RECIBO ===");
        System.out.println(customer.statement());
    }
}