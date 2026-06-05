interface LibraryUser{
    void registerAccount();
    void requestBook();
}

class KidUsers implements LibraryUser{
    int age;
    String bookType;

    public void registerAccount(){
        if(this.age <= 12) 
            System.out.println("You have successfully registered under a Kids Account");
        else
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }

    public void requestBook(){
        if(this.bookType == "Kids") 
          System.out.println("Book Issued successfully,please return the book within 10 days");
        else 
          System.out.println("Oops, you are allowed to take only kids books");
    }
}

class AdultUser implements LibraryUser{
    int age;
    String bookType;

    public void registerAccount(){
        if(this.age > 12)
            System.out.println("You have successfully registered under an Adult Account");
        else
            System.out.println("Sorry,Age must be greater than 12 to register as an adult");
    }

    public void requestBook(){
        if(this.bookType == "Fiction")
          System.out.println("Book Issued successfully, please return the book within 7 days");
        else
          System.out.println("Oops,you are allowed to take only adult Fiction books");
    }
}


public class LibraryInterfaceDemo {
     public static void main(String[] args){
      KidUsers k1 = new KidUsers();
      KidUsers k2 = new KidUsers();

      k1.age = 10;   k2.age = 18;
      k1.registerAccount();   k2.registerAccount();

      k1.bookType = "Kids";  k2.bookType = "Fiction";
      k1.requestBook();   k2.requestBook();


      AdultUser a1 = new AdultUser();
      AdultUser a2 = new AdultUser();

      a1.age = 5;  a2.age = 23;
      a1.registerAccount();  a2.registerAccount();

      a1.bookType = "Kids";  a2.bookType = "Fiction";
      a1.requestBook();  a2.requestBook();
     }
    
}
