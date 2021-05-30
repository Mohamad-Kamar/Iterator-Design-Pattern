public class FromScratchExample {
    
    
    public static void main(String[] args) {
        Item handBanana = new Fruit("Hand Banana",50);
        Item handApple = new Fruit("Hand Apple",100);
        
        IStorage hands = new HandHeldStorage(handBanana,handApple);
        
        
        
        Item bagBanana = new Fruit("Bag Banana",50);
        Item bagBpple = new Fruit("Bag Apple",100);
        
        Item [] items = {bagBanana,bagBpple};
        IStorage bag = new BagStorage(items);
        displayStorage(hands);
        displayStorage(bag);
        
        int nums[] = {1,2,3,4,5,6,6,7};
        System.out.println("Nums: ");
        for(int num : nums){
            System.out.println(num);
        }
    }
    
    
    /**
     *
     * @param storageMethod
     */
    public static void displayStorage(IStorage storageMethod){
        StorageIterator handIterator = storageMethod.GetIterator();
        while(!handIterator.isDone()){
            Item currentItem = handIterator.current();
            System.out.println(currentItem);
            handIterator.next();
        }   
    }
}
