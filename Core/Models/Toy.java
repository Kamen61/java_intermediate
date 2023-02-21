package Core.Models;

public class Toy {
    public int id;
    public String name;
    public int weight;

    public Toy (int id, String name, int weight){
        this.id=id;
        this.name=name;
        this.weight=weight;
    }

    public String getName(){
        return this.name;
    }


    public int getid(){
        return this.id;
    }

    public int getWeight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return "ID игрушки: " + id + "; Название: " + name + "; Вес: " + weight;
    }
}