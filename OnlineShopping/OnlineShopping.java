import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

interface User
{
    void browseProducts(List<Product> products);
    void addProducttoCart(Product product);
    void placingOrders();

}
abstract class Product
{
    private int productId;
    private String productName;
    private int price;

    public void setElements(int productId, String productName, int price)
    {
        this.productId=productId;
        this.price=price;
        this.productName=productName;
    }

    public int getProductid(){
        return this.productId;
    }
    public String getProductName(){
        return this.productName;
    }
    public int getPrice(){
        return this.price;
    }

    abstract void display();
    abstract int discount();
}

class Electronics extends Product
{
    private int warrantyPeriod;

    

    public Electronics(int productId, String productName, int price, int warrantyPeriod){
        super.setElements(productId, productName, discount());
        this.warrantyPeriod= warrantyPeriod;
    }

    public int discount()
    {
        int price = getPrice();
        price = (int) (price - (price * 0.3));
        return price;
    }
    public int getWarranty(){
        return this.warrantyPeriod;
    }

    
    public void display(){
        System.out.println("Details of the Product: ");
        System.out.println("The ProductId is : "+getProductid());
        System.out.println("The Product Name is : "+getProductName());
        System.out.println("The Price of the Product is : "+getPrice());
        System.out.println("The Warranty Period of the Product is : "+getWarranty());
    }

}

class Clothing extends Product
{
    private String size;
    private String color;

    
    public Clothing(int productId, String productName, int price, String size, String color)
    {
        super.setElements(productId, productName, discount());
        this.size= size;
        this.color = color;
    }
    public int discount()
    {
        int price = getPrice();
        price = (int) (price - (price * 0.4));
        return price;
    }

    public String getSize(){
        return this.size;
    }

    public String getColor(){
        return this.color;
    }
    public void display(){
        System.out.println("Details of the Product: ");
        System.out.println("The ProductId is : "+getProductid());
        System.out.println("The Product Name is : "+getProductName());
        System.out.println("The Price of the Product is : "+getPrice());
        System.out.println("The Size of the Product is : "+getSize());
        System.out.println("The Color of the Product is : "+getColor());
    }
}
class Guest implements User {
    private List<Product> cart;

    public Guest() {
        cart = new ArrayList<>();
    }

    
    public void browseProducts(List<Product> products) {
        System.out.println("Browsing products as a guest...");
        for(Product product : products){
            product.display();
            System.out.println("--------------------------");
        }
    }

    public void addProducttoCart(Product product) {
        cart.add(product);
        System.out.println("Added " + product.getProductName() + " to cart.");
    }

    
    public void placingOrders() {
        System.out.println("Guest cannot place an order. Please register yourself first.");
    }

    public List<Product> getCart() {
        return cart;
    }
}

class RegisteredUser implements User {
    private List<Product> cart;
    private List<String> orderHistory;

    public RegisteredUser() {
        cart = new ArrayList<>();
        orderHistory = new ArrayList<>();
    }

   
    public void browseProducts(List<Product> products) {
        System.out.println("Browsing products as a registered user...");
        for(Product product : products){
            product.display();
            System.out.println("--------------------------");
        }
    }

    
    public void addProducttoCart(Product product) {
        cart.add(product);
        System.out.println("Added " + product.getProductName() + " to cart.");
    }

   
    public void placingOrders() {
        System.out.println("Placing order as a registered user...");
        
        Order order  = new Order();
        for(Product product : cart){
            order.addProduct(product);
        }
        order.display();
        orderHistory.add("Order placed with " + cart.size() + " items and Order Date is : "+order.getOrderDate()+" and Total amount is "+order.getTotalAmount()
        );
        cart.clear();

    }

    public void viewOrderHistory() {
        System.out.println("Order History:");
        for (String order : orderHistory) {
            System.out.println(order);
        }
    }

    public List<Product> getCart() {
        return cart;
    }

}
class Order {
    private List<Product> products;
    private Date orderDate;
    private double totalAmount;

    public Order() {
        products = new ArrayList<>();
        orderDate = new Date(); // Current date and time
        totalAmount = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice(); // Add the price of the product to the total amount
    } 

    // Getters for order details
    public List<Product> getProducts() {
        return products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Display order details
    public void display() {
        System.out.println("Order Details:");
        System.out.println("Order Date: " + orderDate);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getProductName() + " ($" + product.getPrice() + ")");
        }
    }
}

class UserAccount
{
    private String userId;
    private String password;

    public UserAccount(String userId, String password)
    {
        this.userId=userId;
        this.password = password;
    }

    public String getUserId(){
        return this.userId;
    }

    public String getPassword(){
        return this.password;
    }
}
public class OnlineShopping {

    static class ProductDetail
    {
        private ArrayList<Product> prod;

        public ProductDetail(){
            prod = new ArrayList<>();
        }

        void addItem(Product obj)
        {
            prod.add(obj);
            System.out.println("New Product is added  with Product Id: "+obj.getProductid());   
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        ProductDetail obj = new ProductDetail();
        while(true)
        {
            System.out.println("\n*********WELCOME TO ONLINE SHOPPING CART***************");
            System.out.println("1. Adding new Products ");
            System.out.println("2. Creating New User Account ");
            System.out.println("3. Browsing Products");
            System.out.println("4. Adding Product to the cart");
            System.out.println("5. Placing Order");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the type of product (1. Electronics and   2. Clothes): ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the Product Id: ");
                    int productId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the Product name: ");
                    String productName = sc.nextLine();
                    System.out.print("Enter the price of the product: ");
                    int price =sc.nextInt();

                    if(n == 1){
                        System.out.print("Enter the warranty period: ");
                        int warrantyPeriod = sc.nextInt();
                        Electronics electr = new Electronics(productId, productName, price, warrantyPeriod);
                        obj.addItem(electr);
                        products.add(electr);
                    }
                    else if( n == 2){
                        System.out.print("Enter the size of cloth in terms of M L XL XXL : ");
                        String size = sc.nextLine();
                        System.out.print("Enter the color of cloth : ");
                        String color = sc.nextLine();
                        Clothing clth = new Clothing(productId, productName, price, size, color);
                        obj.addItem(clth);
                        products.add(clth);
                    }
                    else{
                        System.out.println("Invalid Input");
                    }
                    break;

                case 2: 
                System.out.print("Enter the user type (1. Guest, 2. Registered User): ");
                int userType = sc.nextInt();
                sc.nextLine();
                if (userType == 1) {
                    Guest guest = new Guest();
                    guest.browseProducts(products);
                    
                } else if (userType == 2) {
                    RegisteredUser registeredUser = new RegisteredUser();
                    System.out.print("Enter your username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter your password: ");
                    String password = sc.nextLine();
                    registeredUser.browseProducts(products);
                    
                } else {
                    System.out.println("Invalid user type!");
                }
                break;
                
                case 3:
                    System.out.println("Browsing products...");
                    for (Product product : products) {
                        product.display();
                    }
                    break;
                case 4:
                    System.out.print("Enter the user type (1. Guest, 2. Registered User): ");
                    int userTypeAdd = sc.nextInt();
                    sc.nextLine();
                    if (userTypeAdd == 1) {
                        Guest guest = new Guest();
                        guest.browseProducts(products);
                        System.out.print("Enter the Product Id to add to cart: ");
                        int productIdAdd = sc.nextInt();
                        sc.nextLine();
                        for (Product product : products) {
                            if (product.getProductid() == productIdAdd) {
                                guest.addProducttoCart(product);
                                break;
                            }
                        }
                    } 
                    else if (userTypeAdd == 2) {
                        RegisteredUser registeredUser = new RegisteredUser();
                        registeredUser.browseProducts(products);
                        System.out.print("Enter the Product Id to add to cart: ");
                        int productIdAdd = sc.nextInt();
                        sc.nextLine();
                        for (Product product : products) {
                            if (product.getProductid() == productIdAdd) {
                                registeredUser.addProducttoCart(product);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Invalid user type!");
                    }
                    break;
                case 5:
                    System.out.print("Enter the user type (1. Guest, 2. Registered User): ");
                    int usertype = sc.nextInt();
                    if (usertype == 2) {
                        RegisteredUser registeredUser = new RegisteredUser();
                        registeredUser.placingOrders();
                    } else {
                        System.out.println("Only registered users can place orders.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        }

    }
}
