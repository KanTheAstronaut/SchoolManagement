package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import datamodel.Students;

public class PayService {	
	
	public List<Students> read() throws IOException{
		String line = null;
		String splitBy = ",";
		BufferedReader br = new BufferedReader(new FileReader("/Users/kanepu/Downloads/students.csv"));
		List<Students> studentList = new ArrayList<>();
		int count = 0;
		while((line = br.readLine()) != null) {
			if(count != 0) {
				String[] students = line.split(splitBy);
				
				Students student = new Students();
				String a = students[4].trim();
				if (a != "") {
					a = (Integer.valueOf(students[4].trim()) >= 19) ? students[4].trim(): String.valueOf(0);
				}
				//System.out.println(age);
				student.setStudId(students[0].trim());
				student.setName(students[1].trim());
				student.setDepartment(students[2].trim());
	
				String CSV = students[3].trim();
				
				//String[] values = CSV.split(",");
				String[] values = CSV.split(";"); // The courses are split with a semicolon not a comma
				// the comma is used for regular CSV field separation
				
				//System.out.println(Arrays.toString(values));
		        student.setCourse(Arrays.asList(values));
				student.setAge(students[4].trim());
				student.setYear(students[5].trim());
				double fee = Double.parseDouble(students[6].trim());
				student.setFee(fee);
				student.setPaid(students[7].trim());
				if(students[7].trim() != null && !students[7].trim().isEmpty()) {
					student.setPaid(students[7].trim());
				}
				studentList.add(student);			
			}
			count ++;
			//System.out.println(count);
		}
		br.close();

		// HOMEWORK 1
		
		// age comparison ASCENDING
//        Comparator<Students> comparator = Comparator.comparing(Students::getAge);
        
		// year comparison ASCENDING
        Comparator<Students> comparator = Comparator.comparing(Students::getYear);

		// age comparison DESCENDING
//      Comparator<Students> comparator = Comparator.comparing(Students::getAge).reversed();
      
		// year comparison DESCENDING
//      Comparator<Students> comparator = Comparator.comparing(Students::getYear).reversed();
        
        // sort using one of the comparators (one will be commented)
        studentList.sort(comparator);
		
        // END OF HOMEWORK 1
        
		return studentList;
	}
}
