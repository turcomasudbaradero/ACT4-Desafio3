package act4_desafio3_exception;

import java.util.ArrayList;

public class DataBag {
    
    private final int capacidadMaxima;
    private final ArrayList<Object> elementos;
    
    public DataBag (int capacidadMaxima){
        if(capacidadMaxima <= 0){
            throw new IllegalArgumentException ("La capacidad maxima debe ser mayor que cero");
        }
        
        this.capacidadMaxima = capacidadMaxima;
        this.elementos = new ArrayList<>();
    }
    
    public void add(Object elemento){
        if(elementos.size() >= capacidadMaxima){
            throw new FullDataBagException("El DataBag esta lleno. Capacidad maxima: " + capacidadMaxima);
        }
        elementos.add(elemento);
    }
    
    public Object remove(){
        if(elementos.isEmpty()){
            throw new EmptyDataBagException("El DataBag esta vacio. No hay elementos para remover.");
        }
        return elementos.remove(elementos.size() - 1);
    }
    
    public int size(){
        return elementos.size();
    }
    
    public boolean isEmpty(){
        return elementos.isEmpty();
    }
    
    public boolean isFull(){
        return elementos.size() == capacidadMaxima;
    }
    
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    
    @Override
    public String toString(){
        return elementos.toString();
    }
    
}