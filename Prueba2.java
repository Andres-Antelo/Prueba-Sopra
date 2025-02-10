class Persona {
    char SEXO; // 'M' para masculino, 'F' para femenino
    int EDAD;
}

public class ClasificacionPersonas {
    public static void main(String[] args) {
        int totalPersonas = 50;
      
        Persona[] PERSONAS = new Persona[totalPersonas];
        
        int mayoresEdad = 0;
        int menoresEdad = 0;
        int masculinosMayores = 0;
        int femeninasMenores = 0;
        int totalMujeres = 0;
        
        LEERPERSONAS(PERSONAS); //carga las 50 personas en la variable PERSONAS
        
        for (int i = 0; i < totalPersonas; i++) {
            if (PERSONAS[i].EDAD >= 18) {
                mayoresEdad++;
                if (PERSONAS[i].SEXO == 'M') {
                    masculinosMayores++;
                }
            } else {
                menoresEdad++;
                if (PERSONAS[i].SEXO == 'F') {
                    femeninasMenores++;
                }
            }
            
            if (PERSONAS[i].SEXO == 'F') {
                totalMujeres++;
            }
        }
        
        double porcentajeMayores = (mayoresEdad / totalPersonas) * 100;
        double porcentajeMujeres = (totalMujeres / totalPersonas) * 100;
        
        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + masculinosMayores);
        System.out.println("Cantidad de personas femeninas menores de edad: " + femeninasMenores);
        System.out.println("Porcentaje de personas mayores de edad respecto al total: " + porcentajeMayores + "%");
        System.out.println("Porcentaje de mujeres respecto al total: " + porcentajeMujeres + "%");
    }
}
