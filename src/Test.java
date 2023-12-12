/* 
public class Test {
    public int dato=0;
    public static int datoestatico=1;

public void metodo() {
    this.datoestatico++;
    this.dato++;
    datoestatico++;
} //metodo

public static void metodoestatico() {
    this.datoestatico++;
    datoestatico++;
} //metodoestatico

public static void main(String[] args){
    dato++;
    datoestatico++;
    metodoestatico();
// metodo(); -- error

} // main

} //Class

*/




/*CORRECIÓN */
/* 
public class Test {
    public int dato=0;
    public static int datoestatico=1;

public void metodo() {
    this.datoestatico++;
    this.dato++;
    datoestatico++;
} //metodo

public static void metodoestatico() {
    //this.datoestatico++;
    datoestatico++;
} //metodoestatico

public static void main(String[] args){

    //dato++;
    datoestatico++;
    System.out.println("datoestatico 1st-> "+ datoestatico);
    metodoestatico();
    System.out.println("datoestatico 2nd-> "+ datoestatico);
// metodo(); -- error

} // main

} //Class

*/







/*PRUEBAS DE CLASE */

public class Test {
    public int dato=-1; /*esto es no estático */
    public static int datoestatico=1; /*esto es estático */

public void metodo() {
    this.datoestatico++;
    this.dato++;
    datoestatico++;
} //metodo

public static void metodoestatico() {
    //this.datoestatico++;
    datoestatico++;
} //metodoestatico

public static void main(String[] args){

    Test tst1 = new Test(); /*su valor es el de dato */
    Test tst2 = new Test(); /*su valor es el de dato */

    System.out.println("valor del atributo dato en tst1" + tst1.dato);
    System.out.println("valor del atributo dato en tst2" + tst2.dato);

    tst1.dato = tst1.dato +1; /*Aquí solo se le cambia el valor a tst1, no afecta al tst2 */
    tst2.dato = tst2.dato +100; /*Aquí solo se le cambia el valor a tst2, no afecta al tst1 */

    System.out.println("valor del atributo dato en tst1 " + tst1.dato);
    System.out.println("valor del atributo dato en tst2 " + tst2.dato);


    /* 

    //dato++;
    datoestatico++;
    System.out.println("datoestatico 1st-> "+ datoestatico);
    metodoestatico();
    System.out.println("datoestatico 2nd-> "+ datoestatico);
// metodo(); -- error


    */

} // main

} //Class