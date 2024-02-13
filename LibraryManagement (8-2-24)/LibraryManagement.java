import java.util.*;

abstract class Items {
    // Abstraction concept is used
    private int id;
    private String title;
    private String author;

    public void setElements(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // this getter methods will get the properties
    public int getid() {
        return this.id;
    } // Encapsulation method is used

    public String gettitle() {
        return this.title;
    }

    public String getauthor() {
        return this.author;
    }

    abstract void display();
}

class Disp extends Items // this is class to show details of item
{
    void display() {
        System.out.println("The id of the book is: " + getid());
        System.out.println("The title of the book is: " + gettitle());
        System.out.println("The author of the book is: " + getauthor());
    }
}

class Book extends Items {
    private String isbn;

    // adding isbn to the items
    public Book(int id, String title, String author, String isbn) {
        super.setElements(id, title, author);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    void display() {
        // Polymorphism is achived...

        System.out.println("Book Details: ");
        System.out.println("The id of the book is: " + getid());
        System.out.println("The title of the book is: " + gettitle());
        System.out.println("The author of the book is: " + getauthor());
        System.out.println("The isbn of the book is: " + getIsbn());
    }

}

class Magazine extends Items {
    private int magnumber;

    public Magazine(int id, String title, String author, int magumber) {
        super.setElements(id, title, author);
        this.magnumber = magumber;
    }

    public int getMagnumber() {
        return magnumber;
    }

    void display() {
        System.out.println("Magazine Details: ");
        System.out.println("The id of the book is: " + getid());
        System.out.println("The title of the book is: " + gettitle());
        System.out.println("The author of the book is: " + getauthor());
        System.out.println("The isbn of the book is: " + getMagnumber());
    }

}

public class LibraryManagement {

    static class LibraryMember {
        private int memberId;
        private String name;
        private List<Items> checkedOutItems;

        public LibraryMember(int memberId, String name) {
            this.memberId = memberId;
            this.name = name;
            this.checkedOutItems = new ArrayList<>();
        }

        public int getMemberId() {
            return memberId;
        }

        public String getName() {
            return name;
        }

        public void checkOutItem(Items item) {
            if (item != null) {
                checkedOutItems.add(item);
                System.out.println("Item checked out successfully!");
            } else {
                System.out.println("Item not available for checkout.");
            }
        }

        public void returnItem(Items item) {
            if (checkedOutItems.contains(item)) {
                checkedOutItems.remove(item);
                System.out.println("Item returned successfully!");
            } else {
                System.out.println("You haven't checked out this item.");
            }
        }

        // public void displayCheckedOutItems() {
        // if (checkedOutItems.isEmpty()) {
        // System.out.println("No items checked out.");
        // } else {
        // System.out.println("Checked out items:");
        // for (Items item : checkedOutItems) {
        // System.out.println(item.gettitle());
        // }
        // }
        // }

    }

    static class Library {
        private List<Items> inventory;
        private List<LibraryMember> members;

        public Library() {
            inventory = new ArrayList<>(); // initialization while creating of Library object
            members = new ArrayList<>();
        }

        public List<Items> getInventory() {
            return inventory;
        }

        // Getter for members
        public List<LibraryMember> getMembers() {
            return members;
        }

        // adding new item to the inventory
        public void addItem(Items item) {
            inventory.add(item);
            System.out.println("Added to inventory: " + item.gettitle());
        }

        // registering new member
        public void registerMember(LibraryMember member) {
            members.add(member);
            System.out.println("Registered member: " + member.getName());
        }

        public void checkOutItem(LibraryMember member, Items item) {
            member.checkOutItem(item);
        }

        public void returnItem(LibraryMember member, Items item) {
            member.returnItem(item);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n***************Welcome to the Library Management System****************");
            System.out.println("1. Add item to inventory");
            System.out.println("2. Register a member");
            System.out.println("3. Check out item");
            System.out.println("4. Return item");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the type of item (1 for Book, 2 for Magazine): ");
                    int itemType = sc.nextInt();
                    sc.nextLine(); // for the newline
                    System.out.print("Enter the id of the item: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title of the item: ");
                    String title = sc.nextLine();
                    System.out.print("Author of the item: ");
                    String author = sc.nextLine();

                    if (itemType == 1) {
                        System.out.print("Enter the ISBN of the book: ");
                        String isbn = sc.nextLine();
                        Book book = new Book(id, title, author, isbn);
                        library.addItem(book);
                    } else if (itemType == 2) {
                        System.out.print("Enter the magzine number : ");
                        int magNumber = sc.nextInt();
                        Magazine magazine = new Magazine(id, title, author, magNumber);
                        library.addItem(magazine);
                        magazine.display();
                    } else {
                        System.out.println("Invalid item type!");
                    }
                    break;
                case 2:
                    System.out.print("Enter the member ID: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the name of the member: ");
                    String name = sc.nextLine();
                    LibraryMember member = new LibraryMember(memberId, name);
                    library.registerMember(member);
                    break;
                case 3:
                    System.out.print("Enter the member ID who wants to check out: ");
                    int membercheck = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the title of the item to check out: ");
                    String itemtitle = sc.nextLine();
                    LibraryMember checkingOutMember = null;
                    for (LibraryMember mem : library.getMembers()) {
                        if (mem.getMemberId() == membercheck) {
                            checkingOutMember = mem;
                            break;
                        }
                    }
                    if (checkingOutMember != null) {
                        boolean itemFound = false;
                        for (Items item : library.getInventory()) {
                            if (item.gettitle().equalsIgnoreCase(itemtitle)) {
                                library.checkOutItem(checkingOutMember, item);
                                itemFound = true;
                                break;
                            }
                        }
                        if (!itemFound) {
                            System.out.println("Item not found in the inventory!");
                        }
                    } else {
                        System.out.println("Member not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter the member ID who wants to return: ");
                    int memberIdToReturn = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter the title of the item to return: ");
                    String itemtitleret = sc.nextLine();
                    LibraryMember returningMember = null;
                    for (LibraryMember mem : library.getMembers()) {
                        if (mem.getMemberId() == memberIdToReturn) {
                            returningMember = mem;
                            break;
                        }
                    }
                    if (returningMember != null) {
                        boolean itemFound = false;
                        for (Items item : library.getInventory()) {
                            if (item.gettitle().equalsIgnoreCase(itemtitleret)) {
                                library.returnItem(returningMember, item);
                                itemFound = true;
                                break;
                            }
                        }
                        if (!itemFound) {
                            System.out.println("Item not found in the inventory!");
                        }
                    } else {
                        System.out.println("Member not found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
