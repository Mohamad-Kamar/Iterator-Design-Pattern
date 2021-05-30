
interface IStorage{
    StorageIterator GetIterator();
}


class HandHeldStorage implements IStorage{
    
    Item right;
    Item left;
    public HandHeldStorage(Item right, Item left){
        this.right = right;
        this.left = left;
    }
    
    
    @Override
    public StorageIterator GetIterator(){
        return new HandHeldStorageIterator(this);
    }
    
    public Item getRightItem(){
        return this.right;
    }
    
    public Item getLeftItem(){
        return this.left;
    }

     
}



class BagStorage implements IStorage{
    Item [] items;

    
    public BagStorage(Item [] items){
        this.items = items;
    }
    
    @Override
    public StorageIterator GetIterator(){
        return new BagStorageIterator(this);
    }

}

