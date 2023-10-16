package LiskovSubstitutionPrinciple;

public class LiskovExample {
    public static class MenuItem {
        public int price;
        public String name;
        public String description;

        public MenuItem(int price, String name, String description) {
            this.price = price;
            this.name = name;
            this.description = description;
        }
        public double getPrice(){
            return this.price;
        }
    }
    public static class BeverageItem extends MenuItem{

        public BeverageItem(int price, String name, String description) {
            super(price, name, description);
        }        public double getDiscountPrice(int discountPercentage){
            return this.price-(discountPercentage*0.01* this.price);
        }
    }
    public static void printBill(MenuItem item){
        //Here the Liskov principle is getting violated as we need to check if the object item is instance
        //of Beverageitem or menu item and call the getprice()
        if(item instanceof BeverageItem ){
            System.out.println("Bill amount is " +((BeverageItem) item).getDiscountPrice(10));
        }
        else{
            System.out.println("Bill amount is " + item.getPrice());
        }
    }
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem(10,"Bread","Brown bread");
        BeverageItem beverageItem = new BeverageItem(60,"Coke","CodeBeverage");
        printBill(menuItem);
        printBill(beverageItem);
    }
}


