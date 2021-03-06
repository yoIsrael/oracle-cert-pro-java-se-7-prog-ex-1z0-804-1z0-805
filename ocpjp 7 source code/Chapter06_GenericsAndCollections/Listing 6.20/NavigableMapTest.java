/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program demonstrates the usage of navigable tree interface and TreeMap class

import java.util.*;

public class NavigableMapTest {
public static void main(String []args) {
NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>();

examScores.put(90, "Sophia");
		examScores.put(20, "Isabella");
examScores.put(10, "Emma");
examScores.put(50, "Olivea");

System.out.println("The data in the map is: " + examScores);
System.out.println("The data descending order is: " + examScores.descendingMap());
System.out.println("Details of those who passed the exam: " + examScores.tailMap(40));
System.out.println("The lowest mark is: " + examScores.firstEntry());
}
}

