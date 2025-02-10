public class CalculoSalario {
    public static void main(String[] args) {
        double HORASTRABAJADAS;
        double TARIFA;
        double sueldo;
        
        HORASTRABAJADAS = LEERHORASTRABAJADAS(); //lee las horas trabajadas del trabajador
        TARIFA = LEERTARIFA(); //lee la tarifa establecida para el trabajador
        
        if (HORASTRABAJADAS > 40) {
            double horasExtras = HORASTRABAJADAS - 40;
            double tarifaExtra = TARIFA * 1.5;
            sueldo = (40 * TARIFA) + (horasExtras * tarifaExtra);
        } else {
            sueldo = HORASTRABAJADAS * TARIFA;
        }
        
        System.out.println("El sueldo recibido es: " + sueldo);
    }
}
