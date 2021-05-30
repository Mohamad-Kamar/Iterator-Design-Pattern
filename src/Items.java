
interface Item{
    int getWeight();
    String getType();
    @Override
    String toString();
}

class Fruit implements Item{
    private final int weight;
    private final String type;
    
    public Fruit(String type, int weight){
        this.weight = weight;
        this.type = type;
    }
    
    
    @Override
    public int getWeight(){
        return this.weight;
    }
    @Override
    public String getType(){
        return this.type;
    }
    
    @Override
    public String toString(){
        return this.getType();
    }
}

