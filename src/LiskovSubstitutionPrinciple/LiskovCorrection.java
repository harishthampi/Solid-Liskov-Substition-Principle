package LiskovSubstitutionPrinciple;

public class LiskovCorrection {
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
            private double getDiscount(){
                return 0.0;
            }
        }
        public static class BeverageItem extends MenuItem {

            public BeverageItem(int price, String name, String description) {
                super(price, name, description);
            }
            public double getPrice(){
                return this.price-this.getDiscount();
            }
            private double getDiscount(){
                int discountPercentage=20;
                return discountPercentage*0.01*this.price;
            }
        }
        public static void printBill(MenuItem item){
            if(item instanceof BeverageItem){
                System.out.println("Bevarage item bill");
            }
            else{
                System.out.println("Menu item bill");
            }
            System.out.println(item.getPrice());
        }
        public static void main(String[] args) {
            MenuItem menuItem = new MenuItem(10,"Bread","Brown bread");
            BeverageItem beverageItem = new BeverageItem(60,"Coke","CodeBeverage");
            printBill(menuItem);
            printBill(beverageItem);
        }


}
