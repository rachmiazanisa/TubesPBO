/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rachmi
 */
import java.util.*;

public class MyGenerics<E> {
    private List<E> list = new ArrayList<>();
    public int getSize(){
        return list.size();
    }
    public void insert(E item){
        list.add(item);
    }
    public void printAll(){
        while(list.isEmpty()){
            E item = list.remove(list.size()-1);
            System.out.println(item);
        }
    }
    public static void main(String[] args){
        class Building{
            String address;
            Building(String address){
                this.address = address;
            }
            @Override
            public String toString(){
                return "address : "+address;
            }
        }
        MyGenerics<Building> building = new MyGenerics<>();
        building.insert(new Building("Jl. Margahayu Raya No. 30"));
        building.insert(new Building("Jl. Cisaranten"));
        building.insert(new Building("Jl. Solokan Jeruk No.22"));
        building.printAll();
    }
}
