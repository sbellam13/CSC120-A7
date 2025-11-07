
/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building implements HouseRequirements {

  // Instance Variables
  private ArrayList<Student> residents; // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  /**
   * Constructor
   * @param name
   * @param address
   * @param nFloors
   * @param diningRoom
   */
  public House(String name, String address, int nFloors, boolean diningRoom) {
    super(name, address, nFloors);
    hasDiningRoom = diningRoom;
    residents = new ArrayList<Student>();
  }

  /**
   * Accessor for hasDiningRoom
   * @return value of hasDiningRoom
   */
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }

  /**
   * Accessor for nResidents
   * @return value of nResidents
   */
  public int nResidents() {
    return residents.size();
  }

  /**
   * Adds Student s to residents if not already in house, otherwise throws error
   * @param s Student to add
   */
  public void moveIn(Student s) {
    if (residents.contains(s)) {
      throw new RuntimeException("Studnet already in " + name + ". ");
    }
    residents.add(s);
  }

  /**
   * Removes Student s from residents and returns s if s is in residents, otherwise throws error
   * @param   s Student to remove
   * @return  Student that had moved out
   */
  public Student moveOut(Student s) {
    if (!residents.contains(s)) {
      throw new RuntimeException("Student not in " + name + ". ");
    }
    residents.remove(s);
    return s;
  }

  /**
   * Returns true if student s is in house, false otherwise
   * @param   s Student to lookup
   * @return  boolean representing if student is in the house
   */
  public boolean isResident(Student s) {
    return residents.contains(s);
  }

  public static void main(String[] args) {
    House test = new House("Northrop", "49 Elm St, Northampton, MA 01063", 5, true);
  }

}