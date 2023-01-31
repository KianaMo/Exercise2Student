package fi.haagahelia.student.web;

import fi.haagahelia.student.domain.Student;
import java.util.ArrayList;
import java.util.List;	
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class StudentController {
	@RequestMapping("/studentlist")
	public String studentlist(Model model) {
		List<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.firstName = "John";
		s1.lastName = "Snow";
		students.add(s1);
		
		Student s2 = new Student();
		s2.firstName = "Sara";
		s2.lastName = "Williams";
		students.add(s2);
		
		Student s3 = new Student();
		s3.firstName = "Ahmet";
		s3.lastName = "Nabir";
		students.add(s3);
		
		model.addAttribute("students", students);
		return  "studentlist";
	}

}