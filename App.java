public class App {
    public static void main(String[] args) throws Exception {
        /*Principito P1 = new Principito("Buena", "Alegre");
        System.out.println("Principito 1: " + P1.getActitud());
        System.out.println("Principito 1: " + P1.getPersonalidad());
 */
        Flor F1 = new Flor("Vanidosa", "Hermosa");
        
        
        
        System.out.println("Flor 1: " + F1.getActitud());
        System.out.println("Flor 1: " + F1.getApariencia());
        
        
        Flor Fmia = new Flor();
        Fmia.setActitud("Alegre");
        Fmia.setApariencia("Fea");

        Principito mPrincipito = new Principito ("Bondadoso","Explorador");
        mPrincipito.setFlor(Fmia);

        System.out.println("El principito tenía una flor que amaba mucho.");
        System.out.println("Cuidaba de ella todos los días, la regaba y le quitaba las orugas. ");
        System.out.println("La flor, aunque un poco " + mPrincipito.getFlor().getActitud() + ", era muy " + mPrincipito.getFlor().getApariencia() + " y agradecía al principito por su dedicación.");
        System.out.println(" Un dia, el principito decidió explorar otros planetas y, aunque no quería dejar sola a su flor, ");
        System.out.println("sabía que debía continuar su viaje para aprender más sobre el universo.");
    }
}
