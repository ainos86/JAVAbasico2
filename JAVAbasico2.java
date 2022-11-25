package JAVAbasico2;

public class JAVAbasico2 {

        public static void main(String[] args) {
            double productPrice = 24.99;
            double totalPrice = calculateTotalPrice(productPrice);

            System.out.println("El precio total es de " + totalPrice + " " + "euros.");
        }

        public static double calculateTotalPrice (double productPrice){
            double iva = productPrice * 0.21;
            return productPrice + iva;
        }
}
