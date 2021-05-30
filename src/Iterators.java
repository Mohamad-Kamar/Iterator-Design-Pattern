interface StorageIterator{
    Item current();
    boolean isDone();
    void next();
    void reset();
}



class HandHeldStorageIterator implements StorageIterator{
    private HandHeldStorage storage;
    int index;
    public HandHeldStorageIterator(HandHeldStorage s){
        this.storage = s;
        this.index = 0;
    }
    
    @Override
    public boolean isDone(){
        return this.index > 1;
    }
    
    @Override
    public Item current(){
        return switch (this.index) {
            case 0 -> this.storage.left;
            case 1 -> this.storage.right;
            default -> null;
        };
    }
    
    @Override
    public void next(){
        this.index ++;
    }
    
    @Override
    public void reset(){
        this.index = 0;
    }

}


class BagStorageIterator implements StorageIterator{
    private BagStorage storage;
    int index;
    
    public BagStorageIterator(BagStorage s){
        this.storage = s;
        this.index = 0;
    }
    @Override
    public boolean isDone(){
        return this.index > this.storage.items.length -1;
    }
    
    @Override
    public Item current(){
        return this.storage.items[this.index];
    }
    
    @Override
    public void next(){
        this.index ++;
    } 
    
    @Override
    public void reset(){
        this.index = 0;
    }
}