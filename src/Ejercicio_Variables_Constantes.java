public class Ejercicio_Variables_Constantes {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String nombre=("bryan");
        System.out.println(nombre);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        Integer edad=16;
        System.out.println(edad);

        // 3. Crea una variable double con tu altura en metros.
        double estatura=1.69;
        System.out.println(estatura);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean gusta=true;
        System.out.println("te gusta programar " + gusta);
        System.out.println(gusta);

        // 5. Declara una constante con tu email.
        final String correo=("alejandrofloresbryan@gmail.com");
        System.out.println(correo);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
char mychar = 'B';
System.out.println(mychar);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla
        String localidad=("veracruz");
        System.out.println(localidad);
        localidad=("oaxaca");
        System.out.println(localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a=1,b=2,suma;
        suma=a+b;
        System.out.println("la suma es " + suma);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
System.out.println(nombre.getClass().getSimpleName());
System.out.println(edad.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int dinero;
        dinero=10;
        System.out.println(dinero);
    }
}