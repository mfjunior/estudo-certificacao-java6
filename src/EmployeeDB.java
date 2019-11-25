import java.util.TreeMap;
import java.util.Map;

public class EmployeeDB {
	// for testing
	public static void populate(Map<Long, EmployeeInfo> map) {
		map.put(564567L, new EmployeeInfo("Anagha", "Mudigonda"));
		map.put(564566L, new EmployeeInfo("Naren", "Venkatatarman"));
		map.put(564568L, new EmployeeInfo("Keith", "Irwin"));
		map.put(564569L, new EmployeeInfo("Mark", "Newsome"));
		map.put(564600L, new EmployeeInfo("Vikram", "Jolapara"));
	}
	
	// test the queries
	public static void main(String[] args) {

		TreeMap<Long, EmployeeInfo> db = new TreeMap<Long, EmployeeInfo>();
		populate(db);
		System.out.println("the view of employee DB ranging from 564566 to 564599");
		System.out.println(db.subMap(564566L, 564600L));
		System.out.println("print the employees with employee numbers >= 564566");
		System.out.println(db.tailMap(564566L));
		System.out.println("print the employees whose employee number is < 564568");
		System.out.println(db.headMap(564568L));
	}
}

class EmployeeInfo {
	public String firstName;
	public String lastName;
	
	public EmployeeInfo(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		return "(FirstName->"+ firstName + " LastName->"+lastName +")";
	}
}
