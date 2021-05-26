public class ExceptionHandling {
    public static void main(String[] args) {
        try {

            // Integer.parseInt converts str to int
            int n = Integer.parseInt("123s");
            System.out.println(n);

//            int result = 123/0;
//            System.out.println(result);

        } catch(ArithmeticException e) {
            System.out.println("Arithmetic exception happened");
        } catch(NumberFormatException e) {
            System.out.println("Number format exception happened");
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("In base exception branch");
        }
    }
}
