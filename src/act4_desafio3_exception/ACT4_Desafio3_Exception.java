package act4_desafio3_exception;

public class ACT4_Desafio3_Exception {

    public static void main(String[] args) {
        
        DataBag bolsa = new DataBag(3);
        
        System.out.println("==== DESAFIO 3 - DATABAG ====");
        System.out.println("Capacidad maxima: " + bolsa.getCapacidadMaxima());
        
        bolsa.add("Manzana");
        bolsa.add(250);
        bolsa.add(14.50);
        
        System.out.println("Contenido de la bolsa: " + bolsa);
        System.out.println("Cantidad de elementos: " + bolsa.size());
        
        //Aquí intentamos agreagar un cuarto elemento para probar la excepción
        try {
            bolsa.add("Cuarto elemento");
        } catch (FullDataBagException e){
            System.out.println();
            System.out.println("EXCEPCION AL AGREGAR:");
            System.out.println(e.getMessage());
        }
        
        System.out.println();
        System.out.println("==== REMOVER ELEMENTOS ====");
        
        System.out.println();
        System.out.println("Se removio : " + bolsa.remove());
        System.out.println("Se removio : " + bolsa.remove());
        System.out.println("Se removio : " + bolsa.remove());
        
        System.out.println("Contenido de la bolsa: " + bolsa);
        
        //Ahora intentamos remover con la bolsa vacia
        try {
            bolsa.remove();
        } catch (EmptyDataBagException e){
            System.out.println();
            System.out.println("EXCEPCION AL REMOVER:");
            System.out.println(e.getMessage());
        }
        
    }
    
}