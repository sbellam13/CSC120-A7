
/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements {

  // Instance Variables
  private Hashtable<String, Boolean> collection;

  /**
   * Constructor
   * @param name
   * @param address
   * @param nFloors
   */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    collection = new Hashtable<String, Boolean>();
  }

  /**
   * Adds a book to library if not already in library, otherwise throws error
   * @param   title Book to be addded
   */
  public void addTitle(String title) {
    if (collection.contains(title)) {
      throw new RuntimeException("This book is already in the library. ");
    }
    collection.put(title, true);
  }

  /**
   * Removes a book for library and returns the title if in library, otherwise throws an error
   * @param   title Book to be removed
   * @return title
   */
  public String removeTitle(String title) {
    if (!collection.contains(title)) {
      throw new RuntimeException("Title is not in library. ");
    }
    collection.remove(title);
    return title;
  }

  /**
   * Changes the value corresponding to title to true if title is in the library, otherwise throws an error
   * @param title Book to check out
   */
  public void checkOut(String title) {
    if (!collection.contains(title)) {
      throw new RuntimeException("Title is not in library. ");
    }
    if (collection.get(title) == true) {
      System.out.println(title + " is checked out. ");
    }
    collection.replace(title, false, true);
  }

  /**
   * Changes the value corresponding to title to false if title is in the library, otherwise throws error
   * @param title Book to be returned
   */
  public void returnBook(String title) {
    if (!collection.contains(title)) {
      throw new RuntimeException("Title is not in library. ");
    }
    if (collection.get(title) == false) {
      System.out.println(title + " is not checked out. ");
    }
    collection.replace(title, true, false);
  }

  /**
   * Checks if title is in the library
   * @param title
   * @return boolean corresponding to if title is in library
   */
  public boolean containsTitle(String title) {
    return collection.contains(title);
  }

  /**
   * Checks if title is available
   * @param title
   * @return  boolean representing if title is available
   */
  public boolean isAvailable(String title) {
    return collection.get(title);
  }

  /**
   * Prints out the collection of the library
   */
  public void printCollection() {
    System.out.println(collection);
  }

  public static void main(String[] args) {
    Library test = new Library("Neilson", "ADDRESS", 4);
  }

}