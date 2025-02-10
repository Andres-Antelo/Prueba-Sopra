public class ParImparDescendente {
    public static void main(String[] args) {
      
        int NUMERO = LEERNUMERO(); //cargamos un número en la variable NUMERO con LEERNUMERO()
        
        if (NUMERO % 2 == 0) {
            System.out.println("El número es par. Números pares descendentes hasta 0:");
            for (int i = NUMERO; i >= 0; i -= 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("El número es impar. Números impares descendentes hasta 1:");
            for (int i = NUMERO; i >= 1; i -= 2) {
                System.out.print(i + " ");
            }
        }
    }
}
