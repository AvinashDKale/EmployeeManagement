package com.em.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.em.employee.entity.Employee;
import com.em.employee.service.EmployeeServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@GetMapping(value = "/")
	public String viewHomePage(Model model) {
		model.addAttribute("employeeList", employeeServiceImpl.findAllEmployee());
		return "index";
	}

	@GetMapping(value = "/employee/add")
	public String addEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "newEmployee";

	}

	@GetMapping(value = "/employee/search")
	public String searchEmployeeForm() {

		return "searchPage";
	}

	@GetMapping(value = "/searchEmployee")
	public String searchEmployee(Model model, String keyword) {
		if (keyword != null) {
			model.addAttribute("employeeList", employeeServiceImpl.getByKeyword(keyword));
		} else {
			return "searchPage";
		}
		return "searchPage";
	}

	@PostMapping(value = "/employee/save")
	public String saveBook(@ModelAttribute("employee") Employee employee) {

		employeeServiceImpl.saveEmployee(employee);

		return "redirect:/";
	}

	@GetMapping("/employee/update/{id}")
	public String showFormForUpdate(@PathVariable int id, Model model) {
		Employee employee = employeeServiceImpl.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "updateEmployee";
	}

	@GetMapping("/employee/delete/{id}")
	public String deleteEmployee(@PathVariable(value = "id") int id) {
		this.employeeServiceImpl.deleteEmployee(id);

		return "redirect:/";
	}
}
