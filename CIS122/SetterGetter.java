package CIS122;

public class SetterGetter {}
/*
Title: The Simple Book Class
Description:
Create a class named Book that represents a book in a library.

Instance Variables:

title (String)

author (String)

Methods:

Create standard Getters and Setters for both variables.

Add a method displayInfo() that prints the book's title and author.

Test: In a main method, create a Book object, use setters to give it a name like "Head First Java" and author "Kathy Sierra", then call displayInfo().
*/

class Library {
    private String title;
    private String author;

    public void setTitle (String newTitle) {
        title = newTitle;
    }

    public void setAuthor (String newAuthor) {
        author = newAuthor;
    }

    public String getTitle () {
        return title;
    }

    public String getAuthor () {
        return author;
    }

    public String displayInfo () {
        return title + " " + author;
    }
}

class LibraryTest {
    public static void main(String[] args) {
        Library Book = new Library();   // 一定加括号
        Book.setTitle("HJHJ");
        Book.setAuthor("KK");
        System.out.println(Book.displayInfo());     // 调用方法一定要加括号
    }
}


class BankAccount{
    private String accountNumber;
    private double balance;

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setBalance (double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        } else {
            System.out.println("Error");
        }
    }

    public double getBalance () {
        return balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bob = new BankAccount();
        bob.setBalance(-500);
        System.out.println(bob.getBalance());
        bob.setBalance(1500);
        System.out.println(bob.getBalance());        
    }
}


class SmartHomeDevice {
    private String deviceName;
    private int brightness;
    private boolean isOn;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int newBrightness) {
        if (newBrightness >= 0 && newBrightness <= 100) {
            brightness = newBrightness;
            isOn = newBrightness == 0? false : true; 
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String statusReport() {
        if (isOn){
            return "The [deviceName] is ON at [brightness]% brightness.";
        } else {
            return "The device is OFF.";
        }
    }
}